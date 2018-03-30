package day15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket =null;
		try{
			serverSocket = new ServerSocket(7777);
			//������ �Է½�Ʈ���� ��´�.
			System.out.println(getTime()+"���� �غ� �Ϸ�");
			 
		}catch(IOException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		while(true)
		{
			try{
			System.out.println(getTime()+"�����û�� ��ٸ��ϴ�.");
			Socket socket = serverSocket.accept();
			System.out.println(getTime()+socket.getInetAddress()+"�κ��� �����û�� ���Խ��ϴ�.");
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			dos.writeUTF("[NOTICE] Test Message 1 from Server.");
			System.out.println(getTime()+"�����͸� �����Ͽ����ϴ�.");
			
			dos.close();
			socket.close();
		}catch(IOException e){
			e.printStackTrace();}
		}
	}

	 static String getTime() {
		SimpleDateFormat f=new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}
}
