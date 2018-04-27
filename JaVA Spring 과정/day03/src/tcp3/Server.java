package tcp3;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	class ReceiveAndSend implements Runnable{
		OutputStream out;
		OutputStreamWriter outw;
		
		public ReceiveAndSend() {}
		public ReceiveAndSend(Socket socket) throws IOException {
			Socket socket1;
			socket1 =socket;
			out=socket1.getOutputStream();
			outw=new OutputStreamWriter(out);
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(10);
				outw.write("�ȳ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(outw!=null) {
					try {
						outw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	
	int port;
	ServerSocket serverSocket;

	boolean flag =true;
	
	
	public Server() throws IOException {
		port=7777;
		serverSocket = new ServerSocket(port); //�ߺ��� ��Ʈ������� ���� ����ó���ʿ�
	}
///////////////////����////////////////////////////////
	
	public void startServer() throws IOException {
		System.out.println("Start Server....");
		while(flag) {
			Socket socket=null;
			System.out.println("Ready Server....");
			socket= serverSocket.accept();
			ReceiveAndSend sender =new ReceiveAndSend(socket); //��� �ö����� ������ Accept
			new Thread(sender).start();
			System.out.println("Accepted Client ....."+socket.getInetAddress());	
		}
	}
	

	public static void main(String[] args) {
		
		Server server=null; //������ �׽��ϴ�.
		try {
			server = new Server();
			server.startServer();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
