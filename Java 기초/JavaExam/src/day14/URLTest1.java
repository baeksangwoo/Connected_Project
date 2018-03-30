package day14;

import java.net.*;
import java.io.*;
public class URLTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageName="C:/iotest/duke.jpg";
		try{
			URL req= new URL("http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			InputStream is =req.openStream();//�Q�Q��! ����Ʈ ��Ʈ�� 1����Ʈ�� �����´� ����! ���ƾƾ�
			FileOutputStream fos=new FileOutputStream(imageName);
			int input=0;
			InputStreamReader isr =new InputStreamReader(is,"UTF-8");
			BufferedReader br =new BufferedReader(isr);
			while(true){
				input=is.read();
				if(input==-1)
					break;
				fos.write(input);
//				String data = br.readLine();
//				if(data==null)
//					break;
//				System.out.println(data);
			}
			fos.write(input);
		}	catch(MalformedURLException e){
				System.out.println("URL ���ڿ� ����: "+e.getMessage());
			}catch(IOException e){
				System.out.println("IO ����:"+e.getMessage());
			}
		}
	
}
