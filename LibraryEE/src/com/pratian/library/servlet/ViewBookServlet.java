package com.pratian.library.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pratian.library.dao.LibraryDAO;
import com.pratian.library.jdbc.DAOImplementation;
import com.pratian.library.jdbc.MySQLConnector;
import com.pratian.library.model.Book;

/**
 * Servlet implementation class ViewBookServlet
 */
public class ViewBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().print(request.getParameter("bookId"));
		int id = Integer.parseInt(request.getParameter("bookId"));
		Connection connection = MySQLConnector.connectToDB();
		LibraryDAO dao = new DAOImplementation(connection);
		Book book = dao.getBookById(id);
		request.setAttribute("book", book);
		RequestDispatcher dispatcher = request.getRequestDispatcher("viewbook.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
