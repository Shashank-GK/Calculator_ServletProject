package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ModulusServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String n1 = req.getParameter("num1");
		int num1=Integer.parseInt(n1);
		int num2=Integer.parseInt(req.getParameter("num2"));

		int mod=num1%num2;

		PrintWriter out=res.getWriter();


		// Generate HTML output with styling
		out.println("<html>");
		out.println("<head><title>Addition Result</title>");

		// Adding styles for h1 tag
		out.println("<style>");
		out.println("h1 { color: #007bff; font-family: Arial, sans-serif; font-size: 2rem; text-align: center; }");
		out.println("h3 { color: #28a745; font-family: Arial, sans-serif; text-align: center; }");
		out.println("body { font-family: Arial, sans-serif; background-color: rgb(218, 214, 236); padding: 20px; }");
		out.println("</style>");

		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align=\"center\" style=\"color: black\">Calculator WebApp - Addition</h2>");


		out.println("<h1>The Modulus of number " + num1 + " and " + num2 + " is: " + mod + "</h1>");

		out.println("<h3><a href='addition.html'>Go Back</a></h3>");
		out.println("</body>");
		out.println("</html>");
	}
}
