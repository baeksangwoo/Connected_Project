package day13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {

		try(FileReader reader =new FileReader("C:/iotest/output.txt");//FileReader 바이트 단위
				BufferedReader br =new BufferedReader(reader);){ //BufferedReader 문자열로 받는다
			String data;
			while(true)
				{
				data= br.readLine(); //한행씩 읽는 것 read는 한 문자씩 받는다.
				if(data==null)
					break;
				System.out.println(data);
				}
		
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("파일로 출력할 수 없습니다.");
		}catch(IOException ioe){
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}
