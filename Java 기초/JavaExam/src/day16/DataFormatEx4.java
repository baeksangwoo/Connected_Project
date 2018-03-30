package day16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataFormatEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern ="yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);
		
		Date inDate=null;
		System.out.println("날짜를 " +pattern+"의 형태로 입력해 주세요 (입력예 : 2011/05/12)");
		
		while(s.hasNextLine())
		{
			try{
				inDate=df.parse(s.nextLine());
				break;
			}catch(Exception e ){
				System.out.println("날짜를 " +pattern+"의 형태로 다시 입력해 주세요 (입력예 : 2011/05/12)");
				
			}
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today=Calendar.getInstance();
		long day =(cal.getTimeInMillis()-today.getTimeInMillis())/(60*60*1000*24);
		System.out.println("입력하신 날짜와 "+Math.abs(day)+" 일 차이가 납니다.");
	}

}
