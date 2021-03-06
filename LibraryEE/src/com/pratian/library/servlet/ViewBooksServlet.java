package com.pratian.library.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

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
 * Servlet implementation class ViewBooksServlet
 */
public class ViewBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		Connection connection =  MySQLConnector.connectToDB();
		LibraryDAO dao = new DAOImplementation(connection);
		List<Book> books = dao.getAllBooks();
		request.setAttribute("allBooksList", books);
		RequestDispatcher dispatcher = request.getRequestDispatcher("allBooks.jsp");
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
