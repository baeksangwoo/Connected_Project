package day15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpIpClient5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String serverIp="70.12.114.106";
			System.out.println("서버에 연결 중"+serverIp);
			Socket socket = new Socket(serverIp,7777);
			
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			InputStream in =socket.getInputStream();
			DataInputStream dis=new DataInputStream(in);
			
			sender.start();
			receiver.start();
		}catch(ConnectException ce)
		{
			ce.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}