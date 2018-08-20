package com.pratian.calculator.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String plus = request.getParameter("plus");
		String minus= request.getParameter("minus");
		String divide= request.getParameter("divide");
		String multiply= request.getParameter("multiply");
		int a = Integer.parseInt(request.getParameter("fnumber"));
		int b = Integer.parseInt(request.getParameter("snumber"));
		int res = 0;
		if(plus!=null) {
			res = a+ b;
		}
		if(minus!=null) {
			res = a- b;
		}
		if(divide!=null) {
			res = a/ b;
		}
		if(multiply!=null) {
			res = a* b;
		}
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>Welcome Page</title></head>");
		writer.println("<body>");
		writer.println("<h1> Welcome </h1>");
		writer.println("<h4>answer is :" + res+ " </h4>");
		writer.println("</body>");
		writer.println("</html>");
		System.out.println(res);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
