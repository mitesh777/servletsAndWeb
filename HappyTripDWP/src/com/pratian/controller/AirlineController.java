package com.pratian.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pratian.dao.AirlineDao;
import com.pratian.dao.impl.AirlineDaoImplementation;
import com.pratian.model.Airline;

/**
 * Servlet implementation class AirlineController
 */
@WebServlet("/AirlineControllerURL")
public class AirlineController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AirlineController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String airlineName = request.getParameter("airlineName");
		String airlineLogo = request.getParameter("airlineLogo");
		Airline airline = new Airline(airlineName, airlineLogo);
		AirlineDao dao = new AirlineDaoImplementation();
		long airlineId = dao.addNewAirLine(airline);
		airline.setAirlineId(airlineId);
		request.setAttribute("airline", airline);
		request.getRequestDispatcher("AddedAirline.jsp").forward(request, response);
		//doGet(request, response);
	}

}
