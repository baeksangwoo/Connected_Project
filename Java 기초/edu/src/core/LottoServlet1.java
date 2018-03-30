package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LottoServlet1
 */
@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out =response.getWriter();
		int number = Integer.parseInt(request.getParameter("num"));
		  // Random() 객체 생성
        Random generator = new Random();        
        
        int num1;
     
        num1= generator.nextInt(10)+1;         
        
        System.out.print("전달된 값 : "+number);
        System.out.print(" 추출된 값 : "+num1);
        System.out.println();
        if(number==num1)
        {
        	out.print("<h1> 추카 추카 </h1>");
        }
        else
        {
        	out.print("<h1> 다음 기회를.... </h1>");
        }
		out.print("<a href='/edu/htmlexam/lotto.html'>"+"입력화면으로 가기</a>");
		out.close();
		
	}

}
