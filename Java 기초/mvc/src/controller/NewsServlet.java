package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.NewsDAO;
import model.vo.NewsVO;
import model.vo.VisitorDAO;
import model.vo.VisitorVO;


@WebServlet("/news.do")
public class NewsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

			ArrayList<NewsVO> list = null;
			NewsVO v=null;
			if(request.getParameter("action")!=null)
			{
				
				String action=request.getParameter("action");
				if(action.equals("read"))
				{
					String uid=request.getParameter("newsid");
					int id=Integer.parseInt(uid);
					v =new NewsDAO().listOne(id);
					request.setAttribute("getvalue", v);
				}
				else if(action.equals("delete"))
				{
					String uid=request.getParameter("newsid");
					int id=Integer.parseInt(uid);
					boolean df=true;
					df= new NewsDAO().delete(id);
				}
				else if(action.equals("search"))
				{
					
				}
			}
			else
			{
				System.out.println("yyyy");
			}
		
		   if(request.getParameter("name") !=null ) 
		   {
			   
		   }
		   else
		   {
			   list = new NewsDAO().listAll();
			   request.setAttribute("list",list);
		   }

		   request.getRequestDispatcher("/jspexam/news.jsp").forward(request, response);  
		   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("action");
		if(request.getParameter("action")!=null){

			System.out.println("update");
			if(action.equals("update"))
			{
				System.out.println("update");
				String writer = request.getParameter("writer");
				String title = request.getParameter("title");
				String content =request.getParameter("content");

				int id= Integer.parseInt(request.getParameter("id"));

				 NewsDAO dao = new NewsDAO();
				 NewsVO vo = new  NewsVO();
				 vo.setWriter(writer);
				 vo.setTitle(title);
				 vo.setContent(content);
				 vo.setId(id);
				dao.update(vo);
				 
			}
		}
		else{
        String writer = request.getParameter("writer");
		 String title = request.getParameter("title");
		 String content =request.getParameter("content");
		 NewsDAO dao = new NewsDAO();
		 NewsVO vo = new  NewsVO();
		 vo.setWriter(writer);
		 vo.setTitle(title);
		 vo.setContent(content);
		 dao.insert(vo);
		}
		 doGet(request, response);
		 
	}

}
