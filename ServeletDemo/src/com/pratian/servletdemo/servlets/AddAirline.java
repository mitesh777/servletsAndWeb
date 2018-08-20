package com.pratian.servletdemo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pratian.travelapp.dao.AirlineDao;
import com.pratian.travelapp.entity.Airline;
import com.pratian.travelapp.jdbc.DAOImplementation;
import com.pratian.travelapp.jdbc.MySQLConnector;

/**
 * Servlet implementation class AddAirline
 */
public class AddAirline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddAirline() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String airlineName = request.getParameter("AirlineName");
		String serviceType = request.getParameter("ServiceType");
		Airline airline = new Airline(airlineName,serviceType);
		Connection connection = MySQLConnector.connectToDB();
		AirlineDao airlineDAO = new DAOImplementation(connection);
		airlineDAO.createAirline(airline);
		request.setAttribute("airlines", airline);
		RequestDispatcher dispatcher = request.getRequestDispatcher("AddAirlineSuccess.jsp");
		dispatcher.forward(request, response);
		
		//createAirline(airline);
//		PrintWriter writer = response.getWriter();
//		writer.println("<html>");
//		writer.println("<head><title>Welcome Page</title></head>");
//		writer.println("<body>");
//		writer.println("<h1> Added "+ airlineName +" </h1>");
//		writer.println("<h4> you have logged in at : " + new java.util.Date() + " </h4>");
//		writer.println("</body>");
//		writer.println("</html>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
