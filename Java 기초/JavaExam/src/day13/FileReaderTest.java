package day13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		try(FileReader reader =new FileReader("C:/iotest/output.txt")){
			while(true)
				{
				int data= reader.read(); //한문자씩 읽는 것
				if(data==-1)
					break;
				System.out.print((char)data);
				}
		
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("파일로 출력할 수 없습니다.");
		}catch(IOException ioe){
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}
