package tcp2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	
	int port;
	ServerSocket serverSocket;

	boolean flag =true;
	
	
	public Server() throws IOException {
		port=7777;
		serverSocket = new ServerSocket(port); //중복된 포트사용으로 인한 예외처리필요
	}
///////////////////동일////////////////////////////////
	
	public void startServer() throws IOException {
		System.out.println("Start Server....");
		while(flag) {
			Socket socket=null;
			System.out.println("Ready Server....");
			socket= serverSocket.accept();
			Sender sender =new Sender(socket); //들어 올때마다 소켓을 Accept
			new Thread(sender).start();
			System.out.println("Accepted Client ....."+socket.getInetAddress());	
		
		}
	}
	class Sender implements Runnable{
		OutputStream out;
		OutputStreamWriter outw;
		Socket socket;
		
		public Sender() {}
		public Sender(Socket socket) throws IOException {
			this.socket =socket;
			out=socket.getOutputStream();
			outw=new OutputStreamWriter(out);
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(3000);
				outw.write("안녕");
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
				if(socket!=null) {
					try {
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
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
