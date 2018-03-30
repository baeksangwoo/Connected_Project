

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({"/First1","/First2"})
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");//서블릿의 응답은 html이면서 utf-8방식이다.
		PrintWriter out= response.getWriter();
		out.print("<h2>FirstSelvlet 수행완료</h2>");
		out.print("<hr>");
		out.print("<h2>현재 시간:"+java.time.LocalTime.now()+"수행완료</h2>"); //서버의 위치에 따라 현재 시간이 다르다 클라이언트에 따라 바꿀려 하면 javascript로 활용해야한다.
		out.close();//servlet 을 실행하려면 tomcat이라는 엔진이 필요하다.카탈리나 == 엔진
	}

}
