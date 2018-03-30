package controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/logservlet2")
public class ClickLogservlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
  
	  response.setContentType("text/html; charset=utf-8");
		
		SimpleDateFormat  formatter01 = new SimpleDateFormat("yyyyMMddhhmm ");
		String todate01=  formatter01.format(new Date());

		String pid= request.getParameter("productID");
		
		todate01+=pid;
		
		
		String loggerName= "case3";
		Logger log = LogManager.getLogger(loggerName);
		log.info(pid);
		
		
		
		
		request.setAttribute("getvalue", pid);
	  request.getRequestDispatcher("/jspexam/logview.jsp").forward(request, response);  
	   
	}

}
