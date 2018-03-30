package day13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter writer =null;
		String path="C:/iotest";
		File isDir =new File(path);
		if(!isDir.isDirectory())
		{
			isDir.mkdirs();
		}
		try{
			writer =new FileWriter("C:/iotest/output.txt");
			char arr[]={'��','ü','��','��','��','��','J','A','V','A'};
			for(int cnt=0; cnt<arr.length;cnt++)
			{
				writer.write(arr[cnt]);
			}
			writer.write("\r\n");
			writer.write(arr);
			writer.write("\r\n");
			writer.write("OCJP ������");
			writer.write("\r\n");
			System.out.println("���Ͽ� ��� �Ϸ�!");
			
		}catch(IOException ioe)
		{
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}finally{
			try{
				if(writer!=null)
					writer.close();
			}catch(Exception e)
			{
				System.out.println("������ �ݴ� ���� �����߻�!!");
			}
		}
	}

}
