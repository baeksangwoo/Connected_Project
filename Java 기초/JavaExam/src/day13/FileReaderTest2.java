package day13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest2 {

	public static void main(String[] args) {

		try(FileReader reader =new FileReader("C:/iotest/output.txt");//FileReader ����Ʈ ����
				BufferedReader br =new BufferedReader(reader);){ //BufferedReader ���ڿ��� �޴´�
			String data;
			while(true)
				{
				data= br.readLine(); //���྿ �д� �� read�� �� ���ھ� �޴´�.
				if(data==null)
					break;
				System.out.println(data);
				}
		
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}catch(IOException ioe){
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}

}
