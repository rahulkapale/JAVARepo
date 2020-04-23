package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		int countryCode=0;
		String capitals[]= {"New Delhi","Islmabad","Bejing","WashingtonDC","mascow"};
		
		//get PrintWriter
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form data 
		countryCode=Integer.parseInt(req.getParameter("country"));
		pw.println("<h1 style='color:green;text-align:center'>"+capitals[countryCode]+"</h1>");
		
		//add hyperlink
		pw.println("<br><a href='form.html'>home</a>");
		//close stream
		pw.close();
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req,res);
	}//doPost(-,-)

}//class
