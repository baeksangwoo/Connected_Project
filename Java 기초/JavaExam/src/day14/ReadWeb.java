package day14;
import java.util.Scanner;

import java.net.*;

import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
public class ReadWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageName="C:/iotest/output";
		
		File file = new File(imageName);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		System.out.println(" �ּҸ� �Է��ϼ���!");
		
		Scanner sc = new Scanner(System.in);//ctrl+space: �ڵ��ϼ� ����Ű, �ڵ� import������
	       
        String name;
        name = sc.nextLine(); //nextLine()�� ������ ���о��
        sc.close();//���ɳ� �ݱ�
        //http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg
		try{
			String lastname=name.substring(name.lastIndexOf(".")+1);
			System.out.println(lastname);// �����Ͽ���
			URL req= new URL(name);
			if(name.endsWith("png")||name.endsWith("jpg")||name.endsWith("gif")) //url
			{
				System.out.println("�̹����� ����մϴ�!");
				InputStream is =req.openStream();//�Q�Q��! ����Ʈ ��Ʈ�� 1����Ʈ�� �����´� ����! ���ƾƾ�
				FileOutputStream fos=new FileOutputStream(imageName+"."+lastname);
				int input=0;
				while(true){
					input=is.read();
					if(input==-1)
						break;
					fos.write(input);
				}
				fos.close();
			}
			else//url
			{
				System.out.println("����µȴ�");
				InputStream is =req.openStream();//�Q�Q��! ����Ʈ ��Ʈ�� 1����Ʈ�� �����´� ����! ���ƾƾ�
				FileOutputStream  writer = new FileOutputStream(imageName+"."+lastname);
				InputStreamReader isr = new InputStreamReader(is, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				PrintWriter out = new PrintWriter(imageName, "UTF-8");
				BufferedWriter br1 = new BufferedWriter(out);
	
				
				while(true){
					String data = br.readLine();
					if(data==null)
						break;
					br1.write(data);
					br1.newLine();
				}		
				br1.close();
			}
			
			System.out.println(imageName+"���������� ��µǾ����ϴ�.");
		}	catch(MalformedURLException e){
				System.out.println("URL ���ڿ� ����: "+e.getMessage());
			}catch(IOException e){
				System.out.println("IO ����:"+e.getMessage());
			}
	}
}