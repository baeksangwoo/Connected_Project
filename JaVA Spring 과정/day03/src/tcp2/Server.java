package tcp2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import tcp1.Server;

public class Server {
	
	int port;
	ServerSocket serverSocket;
	Socket socket;
	OutputStream out;
	OutputStreamWriter outw;
	boolean flag =true;
	
	
	public Server() throws IOException {
		port=7777;
		serverSocket = new ServerSocket(port); //�ߺ��� ��Ʈ������� ���� ����ó���ʿ�
	}
///////////////////����////////////////////////////////
	
	public void startServer() { //���� Accept Client Socket
		
		
	}
	
	class Sender implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Server server=null;
		try {
			server = new Server();
			server.startServer();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
