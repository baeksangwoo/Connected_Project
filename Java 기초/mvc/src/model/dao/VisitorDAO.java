package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.vo.ConnectDB;
import model.vo.VisitorVO;

public class VisitorDAO {

	  public boolean insert(VisitorVO vo) {
	      boolean result = true;
	      ConnectDB obj = new ConnectDB();
	      Connection conn = obj.getConnect();
	      PreparedStatement pstmt = null;
	
	      
	      try {
	    	  Context context=new InitialContext();
	    	  DataSource ds=(DataSource)context.lookup("java:comp/env/jdbc/oraDB");
	    	  conn=ds.getConnection();
	         pstmt = conn.prepareStatement("INSERT INTO visitor values(?, sysdate, ?)");
	         pstmt.setString(1, vo.getName());
	         pstmt.setString(2, vo.getMemo());
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
	  
	  

	 public ArrayList<VisitorVO> list() {
	      
	      ArrayList<VisitorVO> list = new ArrayList<VisitorVO>();
	      ConnectDB obj = new ConnectDB();
	      Connection conn = obj.getConnect();
	      Statement stmt = null;
	      ResultSet rs = null;
	      try {
	    	  Context context=new InitialContext();
	    	  DataSource ds= (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
	    	  conn=ds.getConnection();
	         stmt = conn.createStatement();
	         rs = stmt.executeQuery("SELECT name, writedate, memo FROM visitor");
	         VisitorVO vo = null;
	         while(rs.next()){
	            vo = new VisitorVO();
	            try{
	               vo.setName(rs.getString(1));
	            } catch(NullPointerException e){
	               vo.setName("");
	            }
	            try{
	               vo.setWriteDate(rs.getString(2));
	            } catch(NullPointerException e){
	               vo.setName("");
	            }
	            try{
	               vo.setMemo(rs.getString(3));
	            } catch(NullPointerException e){
	               vo.setName("");
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
	 
	 
	 public ArrayList<VisitorVO> searchList(String search) {
	      
	      ArrayList<VisitorVO> list = new ArrayList<VisitorVO>();
	      ConnectDB obj = new ConnectDB();
	      Connection conn = obj.getConnect();
	      Statement stmt = null;
	      ResultSet rs = null;
	      try {
	    	  Context context=new InitialContext();
	    	  DataSource ds= (DataSource)context.lookup("java:comp/env/jdbc/oraDB");
	    	  conn=ds.getConnection();
	         stmt = conn.createStatement();
	    
	         rs = stmt.executeQuery("SELECT name, writedate, memo FROM visitor where name='"+search+"'");
	         VisitorVO vo = null;
	         while(rs.next()){
	            vo = new VisitorVO();
	            try{
	               vo.setName(rs.getString(1));
	            } catch(NullPointerException e){
	               vo.setName("");
	            }
	            try{
	               vo.setWriteDate(rs.getString(2));
	            } catch(NullPointerException e){
	               vo.setName("");
	            }
	            try{
	               vo.setMemo(rs.getString(3));
	            } catch(NullPointerException e){
	               vo.setName("");
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
}
