package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			URL u =new URL("http://unico2013.dothome.co.kr/resweb/exam1.html");//get 방식
			//객체 생성시 이 URL이 맞는 것인지만 확인 하는 거다
			//실제 서버에게 요청하는 것은 이때 가 아니다.
			//openstream이 실제 요청하는 것이다
			URLConnection uc = u.openConnection();//서버에게 요청을 하는 것 
			//내용 추출
			InputStream is =(InputStream)uc.getContent();//URLconnetion 이 응답한 내용 중에 body를 줌
			BufferedReader in = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			String inputLine;
			while((inputLine=in.readLine())!=null)
				System.out.println(inputLine);
			System.out.println("Content-type" +uc.getContentType());
			System.out.println("Date" +new java.util.Date(uc.getDate()));
			System.out.println("Content-lenght" +uc.getContentLength());
		}catch(MalformedURLException e)
		{
			System.out.println("URL이 음서 몰라 다시해");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
//웹 할때 쓰이는 Mine Type