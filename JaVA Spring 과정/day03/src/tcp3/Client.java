package tcp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	String ip;
	int port;
	
	Socket socket;
	InputStream in;
	InputStreamReader inr;
	BufferedReader br;
	boolean flag2=true;
	
	public Client() {}
	
	public Client(String ip, int port) throws UnknownHostException, IOException{
			this.ip =ip;
			this.port=port;
			connect();
			startClient();
	}
	public void connect() {
		
		while(flag2) {
			try {
				socket =new Socket(ip,port);
				if(socket !=null && socket.isConnected()) {
					break;
				}
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("retry!!!");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	public void startClient() throws UnknownHostException,IOException {
		
		try {
			socket =new Socket(ip,port);
			System.out.println("Connected");
			in=socket.getInputStream();
			inr=new InputStreamReader(in);
			br = new BufferedReader(inr);
			String str=br.readLine();
			System.out.println(str);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw e;
		}finally {
			br.close();
			socket.close();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Client client =null;
		
		try {
			client =new Client("70.12.114.130",7777);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw e;
		}
		
		
		
		
	}

}
