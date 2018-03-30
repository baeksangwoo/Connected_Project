package day14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerialTest1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileOutputStream fos =new FileOutputStream("C:/iotest/test1.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);//바이너라 모드로 작동
		
				oos.writeObject(new Date());
				Thread.sleep(3000);
				oos.writeObject(new Date());
				oos.close();
				fos.close();
				System.out.println("직렬화완료");
				
	}

}
