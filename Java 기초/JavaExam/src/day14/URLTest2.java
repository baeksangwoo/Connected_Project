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
			InputStream is =req.openStream();//�Q�Q��! ����Ʈ ��Ʈ�� 1����Ʈ�� �����´� ����! ���ƾƾ�
			InputStreamReader isr =new InputStreamReader(is,"UTF-8");
			BufferedReader br =new BufferedReader(isr);
			while(true){
				String data = br.readLine();
				if(data==null)
					break;
				System.out.println(data);
			}
		}	catch(MalformedURLException e){
				System.out.println("URL ���ڿ� ����: "+e.getMessage());
			}catch(IOException e){
				System.out.println("IO ����:"+e.getMessage());
			}
		}
}
