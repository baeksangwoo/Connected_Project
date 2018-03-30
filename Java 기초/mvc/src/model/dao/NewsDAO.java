package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.vo.ConnectDB;
import model.vo.NewsVO;



public class NewsDAO {


	
	private Connection connectDBCP() {
	    /*  Context context=new InitialContext();
    	  DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/oraDB");
    	  Connection conn = obj.getConnect();
    	*/
		Connection conn=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbctest","jdbctest");
		}
		catch(Exception e){
			
			
		}
		return conn;
	}
	
	public boolean delete(int id){
			boolean result = true;
		      ConnectDB obj = new ConnectDB();
		      Connection conn = obj.getConnect();
		      PreparedStatement pstmt = null;
		try {
		    conn=connectDBCP();
		    pstmt = conn.prepareStatement("DELETE FROM news WHERE id = " + id + "");
		    pstmt.executeUpdate(); 
		    
	     }
	     catch(Exception e)
	     {
	         System.out.println(e);
	         result=false;
	     }
		
		return result;
	}
	
	public boolean update(NewsVO vo){
		
		boolean result = true;
	      ConnectDB obj = new ConnectDB();
	      Connection conn = obj.getConnect();
	      PreparedStatement pstmt = null;
			try {
			    conn=connectDBCP();
			    pstmt = conn.prepareStatement("Update news set writer=?, title=?, content=? WHERE id = " + vo.getId() + "");
			    pstmt.setString(1, vo.getWriter());
			    pstmt.setString(2, vo.getTitle());
			    pstmt.setString(3, vo.getContent());
			    pstmt.executeUpdate(); 
			    
		   }
		   catch(Exception e)
		   {
		       System.out.println(e);
		       result=false;
		   }
			
			return result;
		
	}
	
	
	  public boolean insert(NewsVO vo) {
	      boolean result = true;
	      ConnectDB obj = new ConnectDB();
	      Connection conn = obj.getConnect();
	      PreparedStatement pstmt = null;
	
	      
	      try {
	    	
	    	  conn=connectDBCP();
	         pstmt = conn.prepareStatement("INSERT INTO news values(news_seq.nextval,  ? ,? , ? ,sysdate,0)");
	         pstmt.setString(1, vo.getWriter());
	         pstmt.setString(2,vo.getTitle());
	         pstmt.setString(3,vo.getContent());
	       
	         
	         pstmt.executeUpdate();
	
	      } catch (Exception e) {
	         e.printStackTrace();
	         result = false;
	      }finally {
	         try {
	            if (pstmt != null)
	               pstmt.close();
	            if(conn!=null)
	            	conn.close();
	         } catch (SQLException e) {
	            System.out.println("close 오류 발생");
	         }
	       
	      }
	      return result;
	   }
	  
	  

	 public ArrayList<NewsVO> listAll() {
	      
	      ArrayList<NewsVO> list = new ArrayList<NewsVO>();
	      ConnectDB obj = new ConnectDB();
	      Connection conn = obj.getConnect();
	      Statement stmt = null;
	      ResultSet rs = null;
	      try {
	    	 conn=connectDBCP();
	         stmt = conn.createStatement();
	         rs = stmt.executeQuery("SELECT id, writer, title, content,writedate ,cnt FROM news");
	         NewsVO vo = null;
	         
	         while(rs.next()){
	            vo = new NewsVO();
	            try{
		               vo.setId(rs.getInt(1));
		            } catch(NullPointerException e){
		            	vo.setWriter("");
		            }
		         	try{
		               vo.setWriter(rs.getString(2));
		            } catch(NullPointerException e){
		            	vo.setWriter("");
		            }
		            try{
		               vo.setTitle(rs.getString(3));
		            } catch(NullPointerException e){
		            	vo.setTitle("");
		            }
		            try{
			               vo.setContent(rs.getString(4));
			            } catch(NullPointerException e){
			            	vo.setContent("");
			            }
		            try{
			               vo.setWritedate(rs.getString(5));
			            } catch(NullPointerException e){
			            	vo.setWritedate("");
			            }
		            
		            try{
			               vo.setCnt(rs.getInt(6));
			            } catch(NullPointerException e){
			            	vo.setCnt(0);
			            }
	            list.add(vo);
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(rs != null)
	               rs.close();
	            if (stmt != null)
	               stmt.close();
	            if(conn != null)
	            	conn.close();
	         } catch (SQLException e) {
	            System.out.println("close 오류 발생");
	         }
	        
	      }
	      return list;
	   }
	 
	 
	 public ArrayList<NewsVO> searchList(int id) {
	      
	      ArrayList<NewsVO> list = new ArrayList<NewsVO>();
	      ConnectDB obj = new ConnectDB();
	      Connection conn = obj.getConnect();
	      Statement stmt = null;
	      ResultSet rs = null;
	      try {
	    	  conn=connectDBCP();
	         stmt = conn.createStatement();
	    
	         rs = stmt.executeQuery("SELECT id, writer, title, content,writedate ,cnt FROM news where id='"+id+"'");
	         
	         
	         NewsVO vo = null;
	         while(rs.next()){
	            vo = new NewsVO();
	            try{
		               vo.setId(rs.getInt(1));
		            } catch(NullPointerException e){
		            	vo.setWriter("");
		            }
		         	try{
		               vo.setWriter(rs.getString(2));
		            } catch(NullPointerException e){
		            	vo.setWriter("");
		            }
		            try{
		               vo.setTitle(rs.getString(3));
		            } catch(NullPointerException e){
		            	vo.setTitle("");
		            }
		            try{
			               vo.setContent(rs.getString(4));
			            } catch(NullPointerException e){
			            	vo.setContent("");
			            }
		            try{
			               vo.setWritedate(rs.getString(5));
			            } catch(NullPointerException e){
			            	vo.setWritedate("");
			            }
		            
		            try{
			               vo.setCnt(rs.getInt(6));
			            } catch(NullPointerException e){
			            	vo.setCnt(0);
			            }
	            list.add(vo);
	         }
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(rs != null)
	               rs.close();
	            if (stmt != null)
	               stmt.close();
	            if(conn != null)
	            	conn.close();
	         } catch (SQLException e) {
	            System.out.println("close 오류 발생");
	         }
	        
	      }
	      return list;
	   }
	 public NewsVO listOne(int id){
		 
		 	  NewsVO vo = new NewsVO();
		 	  ConnectDB obj = new ConnectDB();
		      Connection conn = obj.getConnect();
		      Statement stmt = null;
		      ResultSet rs = null;
		      try {
		    	  conn=connectDBCP();
		         stmt = conn.createStatement();
		    
		         rs = stmt.executeQuery("SELECT id, writer, title, content,writedate ,cnt FROM news where id="+id);
		         while(rs.next()){	
		         try{
		               vo.setId(rs.getInt(1));
		            } catch(NullPointerException e){
		            	vo.setWriter("");
		            }
		         	try{
		               vo.setWriter(rs.getString(2));
		            } catch(NullPointerException e){
		            	vo.setWriter("");
		            }
		            try{
		               vo.setTitle(rs.getString(3));
		            } catch(NullPointerException e){
		            	vo.setTitle("");
		            }
		            try{
			               vo.setContent(rs.getString(4));
			            } catch(NullPointerException e){
			            	vo.setContent("");
			            }
		            try{
			               vo.setWritedate(rs.getString(5));
			            } catch(NullPointerException e){
			            	vo.setWritedate("");
			            }
		            
		            try{
			               vo.setCnt(rs.getInt(6));
			            } catch(NullPointerException e){
			            	vo.setCnt(0);
			            }
		         }
		         rs = stmt.executeQuery("update news set cnt=cnt+1  where id="+id);
		      
		      }
		      catch (Exception e) {
			         e.printStackTrace();
			      }finally {
			         try {
			            if(rs != null)
			               rs.close();
			            if (stmt != null)
			               stmt.close();
			            if(conn != null)
			            	conn.close();
			         } catch (SQLException e) {
			            System.out.println("close 오류 발생");
			         }
			        
		 
			      }
		     return vo;
	 }
}
