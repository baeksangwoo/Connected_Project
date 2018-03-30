 package core;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/count")
public class CountServlet extends HttpServlet {
		
	int member_v;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");//서블릿의 응답은 html이면서 utf-8방식이다.
		PrintWriter out= response.getWriter();
		int local_v=0;
		HttpSession session = request.getSession();
		if(session.getAttribute("cnt")==null){
			session.setAttribute("cnt",new int[1]);
		}
		int session_v[] = (int[])session.getAttribute("cnt");
		session_v[0]++;
		
		
		member_v++;
		local_v++;
		out.print("<h2>session_v[0]: "+session_v[0]+" 수행완료</h2>");
		out.print("<h2>member_v: "+member_v+" 수행완료</h2>");
		//메모리 할당된 것이 계속 쓰고 있는 것이다! 재사용하고 있는 것이다 요청할 때마다 객체를 만드는 것이 아니다@
		out.print("<h2>local_v: "+local_v+ "수행완료</h2>");
		out.print("<hr>");
		out.close();//servlet 을 실행하려면 tomcat이라는 엔진이 필요하다.카탈리나 == 엔진
	}

}
