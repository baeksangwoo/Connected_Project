package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import day8.KoreanDay;
public class FileWriterLab {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			FileWriter writer =null;
			String path="C:/iotest";
			File isDir =new File(path);
			if(!isDir.isDirectory())
			{
				isDir.mkdirs();
			}
			try{
				Date d = new Date();
				GregorianCalendar gc = new GregorianCalendar();
				GregorianCalendar sangwoo = new GregorianCalendar(1991,05,15);
				int sdf=gc.get(Calendar.DAY_OF_WEEK);
				String day=KoreanDay.korDayName[sdf];
				int s=sangwoo.get(Calendar.DAY_OF_WEEK);
				String dsd=KoreanDay.korDayName[s];
				
				writer=new FileWriter("C:/iotest/lab_0109.txt");
				writer.write("오늘은 "+day+"입니다");
				System.out.println("오늘은 "+day+"입니다");
				writer.write("\r\n");
				System.out.println("백상우는 "+dsd+"에 태어났습니다.");
				writer.write("\r\n");
				writer.write("백상우는 "+dsd+"에 태어났습니다.");
				writer.write("\r\n");
				
				System.out.println("파일에 출력 완료!");
				
			}catch(IOException ioe)
			{
				System.out.println("파일로 출력할 수 없습니다.");
			}finally{
				try{
					if(writer!=null)
						writer.close();
				}catch(Exception e)
				{
					System.out.println("파일을 닫는 동안 오류발생!!");
				}
			}
		}
}
