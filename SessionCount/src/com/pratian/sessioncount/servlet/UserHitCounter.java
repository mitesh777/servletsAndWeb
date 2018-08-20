package com.pratian.sessioncount.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserHitCounter
 */
@WebServlet("/UserHitCounter")
public class UserHitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserHitCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer = response.getWriter();
		HttpSession session = request.getSession();
		
		Integer count = (Integer)session.getAttribute("count");
		if(count == null ) {
			count = new Integer(0);
			session.setAttribute("count", count);
		}
		count++;
		session.setAttribute("count", count);
		
		//PrintWriter writer = response.getWriter();
		//++count;
		writer.println("<html>");
		writer.println("<head><title>Hit Counter</title></head>");
		writer.println("<body>");
		writer.println("<h1> Welcome </h1>");
		writer.println("<h4>number of visits are :" + count+ " </h4>");
		writer.println("</body>");
		writer.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
