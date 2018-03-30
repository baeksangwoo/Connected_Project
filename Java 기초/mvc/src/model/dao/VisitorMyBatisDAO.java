package model.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import model.vo.VisitorVO;

public class VisitorMyBatisDAO {
		
	SqlSessionFactory sqlSessionFactory;
	public VisitorMyBatisDAO(){
		
		try{
			String resource ="resource/mybatis-config.xml";
			InputStream inputStream= Resources.getResourceAsStream(resource);
			sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public boolean insert(VisitorVO vo){
		boolean result =false;
		 SqlSession session =sqlSessionFactory.openSession();
		try{
			String statement="resource.VisitorMapper.insertVisitor";
			session.insert(statement,vo);
			result=true;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}finally{
			session.close();
		}
		return result;
	}
	 public List<VisitorVO> list() {     
		 List<VisitorVO> list = null;
		 SqlSession session =sqlSessionFactory.openSession();
		 
		 try{
				String statement="resource.VisitorMapper.insertVisitor";
				list=session.selectList(statement);
				System.out.println(list.getClass().getName());
			}
			catch(Exception e){
				e.printStackTrace();
				
			}finally{
				session.close();
			}
			return list;
	   }
	 
	 public List<VisitorVO> listByName(String name) {     
		 List<VisitorVO> list = null;
		 SqlSession session =sqlSessionFactory.openSession();
		 
		 try{
				String statement="resource.VisitorMapper.selectByName";
				list=session.selectList(statement,name);
			}
			catch(Exception e){
				e.printStackTrace();
				
			}finally{
				session.close();
			}
			return list;
	   }
	 
	/* 
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
	    
	         rs = stmt.executeQuery("SELECT name, writedate, memo FROM visitor where name like'%"+search+"%'");
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
	   }*/
}
