package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Ok extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ok() {
     super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		//System.out.println(name);
		PrintWriter out = response.getWriter();
		out.print("<h1>");
		out.print("My NAME is  : " + name);
		out.print("</h1>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
