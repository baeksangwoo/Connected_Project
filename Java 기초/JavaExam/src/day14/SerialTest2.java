package day14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

import day6.Student;

public class SerialTest2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("C:/iotest/test2.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);//���̳ʶ� ���� �۵�
		
		Date value1=(Date)ois.readObject();
		Date value2=(Date)ois.readObject();

		System.out.println("Date ��ü ������"+value1);
		System.out.println("Date ��ü ������"+value2);
		ois.close();
		fis.close();
	
	}
}
