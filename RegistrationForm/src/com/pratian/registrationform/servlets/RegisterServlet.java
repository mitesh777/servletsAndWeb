package com.pratian.registrationform.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>Entered values</title></head>");
		writer.println("<body>you are getting you should post</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String password = request.getParameter("password");
		String zip = request.getParameter("zip");
		String country = request.getParameter("country");
		String gender = request.getParameter("gender");
		System.out.println(country+" "+gender+" "+ password);
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>Entered values</title></head>");
		writer.println("<body>");
		writer.println("<h1> entered values are </h1>");
		writer.println("<br> entered first name is "+fname);
		writer.println("<br> entered last name is "+lname);
		writer.println("<br> entered password is "+password);
		writer.println("<br> entered email is "+email);
		writer.println("<br> entered city name is "+city);
		writer.println("<br> entered country name is "+country);
		writer.println("<br> entered gender is "+gender);
		writer.println("<h4> you have registered at : " + new java.util.Date() + " </h4>");
		writer.println("<br><button onclick=\"location.href='./home.html'\" type=\"button\">cancel</button>");

		writer.println("</body>");
		writer.println("</html>");
		
	}

}
