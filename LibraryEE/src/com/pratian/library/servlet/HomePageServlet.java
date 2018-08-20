package com.pratian.library.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.pratian.library.dao.LibraryDAO;
import com.pratian.library.jdbc.DAOImplementation;
import com.pratian.library.jdbc.MySQLConnector;
import com.pratian.library.model.BasketItem;
import com.pratian.library.model.User;

/**
 * Servlet implementation class HomePageServlet
 */
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("uname");
		String password = request.getParameter("password");
		User user = new User(username,password);
		Connection connection = MySQLConnector.connectToDB();
		LibraryDAO dao = new DAOImplementation(connection);
		if(dao.validUsername(user)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", username);
			//int basketId = dao.getBasketId(username);
			List<BasketItem> basket = new ArrayList<BasketItem>();
			
			session.setAttribute("basket", basket);
		//	session.setAttribute("basketId", 12);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("failed.html");
			dispatcher.forward(request, response);
		}
	}

}
