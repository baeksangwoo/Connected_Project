package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.impl.encoding.OSFCodeSetRegistry.Entry;

@WebServlet("/basketNB")
public class BasketServletDONOTDOTHIS extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	HashMap<String, Integer> clientBasket = new HashMap();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String userName =request.getParameter("productID"); //string으로 받는다.
		
		//
		HttpSession session = request.getSession();
		if(session.getAttribute(userName)==null){
			session.setAttribute(userName,new int[1]);		
		}
		
		int session_v[] = (int[])session.getAttribute(userName); 
		session_v[0]++; 
		//세션 객체 생성
	//	clientBasket.put(userName, session_v[0]);
		PrintWriter out =response.getWriter();
		
		
		String [] productarray={"p001","p002","p003","p004","p005","p006","p007","p008","p009","p010"};
		
	//	Iterator<String> iter = clientBasket.keySet().iterator();

		/*while(iter.hasNext()) {
			String key = iter.next();
			Integer value = clientBasket.get(key);
			out.print("<h1>"+key+"상품 "+value+"개! </h1>");	
			}
		*/
		out.print("<a href='/edu/htmlexam/productlog.html'>"+"상품선택화면</a>"+"\t");
		
		out.print("<a href='/edu/htmlexam/productlog.html'>"+"상품 비우기</a>");
		//지구기 map.clear();
		out.close();
		}
}
