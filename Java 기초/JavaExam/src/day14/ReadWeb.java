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
		
		System.out.println(" 주소를 입력하세요!");
		
		Scanner sc = new Scanner(System.in);//ctrl+space: 자동완성 단축키, 자동 import시켜줌
	       
        String name;
        name = sc.nextLine(); //nextLine()은 한줄을 다읽어옴
        sc.close();//스케너 닫기
        //http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg
		try{
			String lastname=name.substring(name.lastIndexOf(".")+1);
			System.out.println(lastname);// 추출하였다
			URL req= new URL(name);
			if(name.endsWith("png")||name.endsWith("jpg")||name.endsWith("gif")) //url
			{
				System.out.println("이미지를 출력합니다!");
				InputStream is =req.openStream();//똒똒이! 바이트 스트림 1바이트씩 가져온다 느려! 으아아아
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
				System.out.println("잘출력된다");
				InputStream is =req.openStream();//똒똒이! 바이트 스트림 1바이트씩 가져온다 느려! 으아아아
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
			
			System.out.println(imageName+"성공적으로 출력되었습니댜.");
		}	catch(MalformedURLException e){
				System.out.println("URL 문자열 오류: "+e.getMessage());
			}catch(IOException e){
				System.out.println("IO 오류:"+e.getMessage());
			}
	}
}