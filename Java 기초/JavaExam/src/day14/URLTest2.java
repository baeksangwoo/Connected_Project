package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			URL req= new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=1159068000");
			InputStream is =req.openStream();//똒똒이! 바이트 스트림 1바이트씩 가져온다 느려! 으아아아
			InputStreamReader isr =new InputStreamReader(is,"UTF-8");
			BufferedReader br =new BufferedReader(isr);
			while(true){
				String data = br.readLine();
				if(data==null)
					break;
				System.out.println(data);
			}
		}	catch(MalformedURLException e){
				System.out.println("URL 문자열 오류: "+e.getMessage());
			}catch(IOException e){
				System.out.println("IO 오류:"+e.getMessage());
			}
		}
}
