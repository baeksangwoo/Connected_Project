package tcp5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	ServerSocket serverSocket;
	boolean flag =true;
	ArrayList<DataOutputStream> list= new ArrayList<>();
	
	public Server() throws IOException {
		serverSocket =new ServerSocket(9999);
		System.out.println("Server Ready");
	}
	
	
	//Client Accept
	//While Loop가 돌아야 한다.
	public void start() throws IOException {
		while(flag) {
			Socket socket = serverSocket.accept();
			
			
			System.out.println(serverSocket.getInetAddress()+"Connected Client...");
		}
	}
	
	class Receiver extends Thread{
		InputStream in;
		DataInputStream din;
		OutputStream out;
		DataOutputStream dout;
		
		public Receiver(Socket socket) throws IOException {
			in = socket.getInputStream();
			din = new DataInputStream(in);
			
			out= socket.getOutputStream();
			dout = new DataOutputStream(out);
			list.add(dout);
			
			System.out.println("Client Count: "+list.size());
		}
		
		@Override
		public void run() {
		
		  while(din!=null) {
			String str=null;
			try {
				str = din.readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str.equals("q")) {
				break;
			}
		  System.out.println(str);
		  }
		  list.remove(dout); //채팅방 나가면 실행
		  if(dout!=null) {
			  try {
				dout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  if(din!=null) {
			  try {
				din.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server =null;
		try {
			server =new Server();		
			server.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		
	}

}
