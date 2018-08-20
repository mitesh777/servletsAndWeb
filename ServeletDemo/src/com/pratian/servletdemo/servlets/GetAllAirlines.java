package com.pratian.servletdemo.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pratian.travelapp.dao.AirlineDao;
import com.pratian.travelapp.entity.Airline;
import com.pratian.travelapp.jdbc.DAOImplementation;
import com.pratian.travelapp.jdbc.MySQLConnector;

/**
 * Servlet implementation class GetAllAirlines
 */
public class GetAllAirlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllAirlines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection connection = MySQLConnector.connectToDB();
		AirlineDao dao = new DAOImplementation(connection);
		List<Airline> airlines = dao.retrieveAllAirlines();
		request.setAttribute("airlinesList", airlines);
		request.getRequestDispatcher("./ViewAllAirlines.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
