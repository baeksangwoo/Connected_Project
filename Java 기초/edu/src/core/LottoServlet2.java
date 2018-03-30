package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LottoServlet1
 */
@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    int whetherNum=0; //로또에 당첨 여부
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out =response.getWriter();
		int number = Integer.parseInt(request.getParameter("num"));
		  // Random() 객체 생성
		HttpSession session = request.getSession();
		if(session.getAttribute("cnt")==null){
			session.setAttribute("cnt",new int[1]);
		}
		int session_v[] = (int[])session.getAttribute("cnt");
		session_v[0]++; //로또를 수행한 횟수
		//세션 객체 생성
		
		
        Random generator = new Random();        
        int num1;
     
        num1= generator.nextInt(10)+1;         
        
        System.out.print("전달된 값 : "+number);
        System.out.print("추출된 값 : "+num1);
        System.out.println();
        
        if(whetherNum==0){
	        if(number==num1)
	        {
	        	out.println("<h1> 추카 추카.... </h1>");
	        	out.print("<h1> 재응모를 하려면 브라우저를 재기동하세요! </h1>");
	        	whetherNum++;
	        	
	        }
	        else if(session_v[0]>=3)
	        {
	        	out.print("<h1> 더 이상 응모 할 수 없습니다. 브라우저를 재기동한 후에 응모하세요...</h1>");
	        }
	        else
	        {
	        	out.print("<h1> 다음 기회를.... 남은 횟수: "+(3-session_v[0])+ "</h1>");
				out.print("<a href='/edu/htmlexam/lotto.html'>"+"입력화면으로 가기</a>");
	        }

			
		}
        else
        {
        	out.print("<h1> 예전에 당첨이 되었습니다. 브라우저를 재기동하세요 </h1>");
        }
    	out.close();
	}
	
}
