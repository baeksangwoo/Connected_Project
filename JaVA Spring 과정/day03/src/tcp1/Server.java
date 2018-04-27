package tcp1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	int port;
	ServerSocket serverSocket;
	Socket socket;
	OutputStream out;
	OutputStreamWriter outw;
	boolean flag =true;
	
	
	public Server() throws IOException {
		port=7777;
		serverSocket = new ServerSocket(port); //중복된 포트사용으로 인한 예외처리필요
	}

	public void startServer() throws IOException {
		System.out.println("Start Server....");
	
		while(flag) {
		
		try {
			System.out.println("Ready Server....");
			socket= serverSocket.accept();
			System.out.println("Accepted Client ....."+socket.getInetAddress());
			out=socket.getOutputStream();
			outw = new OutputStreamWriter(out);
			outw.write("하이요!!");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		   throw e;
		}finally {
			if(outw !=null) {
				outw.close();	
			}if(socket!=null) {
			socket.close();
			}
		}
		System.out.println("End Server....");
		}
	}

	public static void main(String[] args){
		Server server=null;
		try {
			server = new Server();
			server.startServer();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
