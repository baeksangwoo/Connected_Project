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
			URL u =new URL("http://unico2013.dothome.co.kr/resweb/exam1.html");//get ���
			//��ü ������ �� URL�� �´� �������� Ȯ�� �ϴ� �Ŵ�
			//���� �������� ��û�ϴ� ���� �̶� �� �ƴϴ�.
			//openstream�� ���� ��û�ϴ� ���̴�
			URLConnection uc = u.openConnection();//�������� ��û�� �ϴ� �� 
			//���� ����
			InputStream is =(InputStream)uc.getContent();//URLconnetion �� ������ ���� �߿� body�� ��
			BufferedReader in = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			String inputLine;
			while((inputLine=in.readLine())!=null)
				System.out.println(inputLine);
			System.out.println("Content-type" +uc.getContentType());
			System.out.println("Date" +new java.util.Date(uc.getDate()));
			System.out.println("Content-lenght" +uc.getContentLength());
		}catch(MalformedURLException e)
		{
			System.out.println("URL�� ���� ���� �ٽ���");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
//�� �Ҷ� ���̴� Mine Type