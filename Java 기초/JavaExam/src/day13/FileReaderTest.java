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
				int data= reader.read(); //�ѹ��ھ� �д� ��
				if(data==-1)
					break;
				System.out.print((char)data);
				}
		
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}catch(IOException ioe){
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}

}
