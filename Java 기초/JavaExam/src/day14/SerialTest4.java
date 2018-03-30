package day14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

import day6.Student;

public class SerialTest4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis= new FileInputStream("C:/iotest/test2.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);//바이너라 모드로 작동
		
		Date value1=(Date)ois.readObject();
		Date value2=(Date)ois.readObject();
		Student st = (Student)ois.readObject();
		System.out.println("Date 객체 데이터"+value1);
		System.out.println("Date 객체 데이터"+value2);
		System.out.println("Student 객체 데이터: ");
		st.studentInfo();
		ois.close();
		fis.close();
	}
}
