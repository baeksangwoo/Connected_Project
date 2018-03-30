package controller;

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

@WebServlet("/logservlet3")
public class ClickLogservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html; charset=utf-8");
		
		SimpleDateFormat  formatter01 = new SimpleDateFormat("yyyyMMddhhmm ");
		String todate01=  formatter01.format(new Date());

		String pid= request.getParameter("productID");
		
		todate01+=pid;

		
		FileWriter fw = new FileWriter(new File("c:\\Temp\\product.log"),true);
		fw.write(todate01);
		fw.close();
	
		
		request.setAttribute("getvalue", pid);
	  request.getRequestDispatcher("/jspexam/logview.jsp").forward(request, response);  
	 
	  
	  
	}

}
