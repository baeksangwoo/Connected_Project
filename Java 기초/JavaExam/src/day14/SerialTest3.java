package day14;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import day6.Student;

public class SerialTest3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos =new FileOutputStream("C:/iotest/test2.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);//���̳ʶ� ���� �۵�
		
				oos.writeObject(new Date()); //����ȭ�Ͽ� �����Ѵ�.
				Thread.sleep(3000);
				oos.writeObject(new Date());
				Student st = new Student("duke", 23 ,"java�� �н��մϴ�"); //�ƹ� ��ü�� ����ȭ�� ���� �ʴ´�.
				oos.writeObject(st);
				oos.close();
				fos.close();
				System.out.println("����ȭ�Ϸ�");			
	}

}
