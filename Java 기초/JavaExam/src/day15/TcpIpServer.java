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
			//소켓의 입력스트림을 얻는다.
			System.out.println(getTime()+"서버 준비 완료");
			 
		}catch(IOException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		while(true)
		{
			try{
			System.out.println(getTime()+"연결요청을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println(getTime()+socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");
			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			
			dos.writeUTF("[NOTICE] Test Message 1 from Server.");
			System.out.println(getTime()+"데이터를 전송하였습니다.");
			
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
