package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String pval=null; 
		Locale locales[]=null;
		pw=res.getWriter();
		res.setContentType("text/html");
		//locales=Locale.getAvailableLocales();
		pval=req.getParameter("l1");
		if(pval.equalsIgnoreCase("link1")) {
			pw.println("<h1>All languages</h1>");
			locales=Locale.getAvailableLocales();
			for(Locale l:locales) {
				pw.println(l.getDisplayLanguage()+"<br>");
			}
		}
		else if(pval.equalsIgnoreCase("link2")) {
			pw.println("<h1>All country</h1>");
			locales=Locale.getAvailableLocales();
			for(Locale l:locales) {
				pw.println(l.getDisplayCountry());
				pw.println("<br>");
			}
		}
		else {
			pw.println("<h1 style='color:red;'>Date and Time::"+new java.util.Date()+"</h1>");
		}
		pw.println("<a href='link.html'><b>Home<b></a>");
		pw.close();
			
	}//doget
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		 	doPost(req, res);
	}
	
	
}//class
