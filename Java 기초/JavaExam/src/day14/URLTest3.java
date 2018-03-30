package day14;

import java.net.*;

import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
public class URLTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageName="C:/iotest/duke1.jpg";
		try{
			URL req= new URL("http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			InputStream is =req.openStream();//�Q�Q��! ����Ʈ ��Ʈ�� 1����Ʈ�� �����´� ����! ���ƾƾ�
			FileOutputStream fos=new FileOutputStream(imageName);
			int input=0;
			InputStreamReader isr =new InputStreamReader(is,"UTF-8");
			BufferedImage bi =ImageIO.read(is);
			for(int y=0;y<bi.getHeight();y++)
			{
				for(int x=0;x<bi.getWidth();x++)
				{
					Color colour = new Color(bi.getRGB(x, y));
					int Y=(int)(0.299*colour.getRed()+0.587*colour.getGreen()+0.114*colour.getBlue());
					bi.setRGB(x, y, new Color(Y,Y,Y).getRGB());
				}
			}
			ImageIO.write(bi, "JPG", fos);
			fos.close();
			System.out.println(imageName+"�� ���������� �����Ǿ����ϴ�.");
//			}
//				while(true){
//				input=is.read();
//				if(input==-1)
//					break;
//				fos.write(input);
////				String data = br.readLine();
//				if(data==null)
//					break;
//				System.out.println(data);
			
		}	catch(MalformedURLException e){
				System.out.println("URL ���ڿ� ����: "+e.getMessage());
			}catch(IOException e){
				System.out.println("IO ����:"+e.getMessage());
			}
		}
	
}
