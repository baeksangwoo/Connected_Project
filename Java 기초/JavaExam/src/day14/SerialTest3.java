package day14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import day6.Student;

public class SerialTest3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos =new FileOutputStream("C:/iotest/test2.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);//바이너라 모드로 작동
		
				oos.writeObject(new Date()); //직렬화하여 저장한다.
				Thread.sleep(3000);
				oos.writeObject(new Date());
				Student st = new Student("duke", 23 ,"java를 학습합니다"); //아무 객체나 직렬화가 되지 않는다.
				oos.writeObject(st);
				oos.close();
				fos.close();
				System.out.println("직렬화완료");			
	}

}
