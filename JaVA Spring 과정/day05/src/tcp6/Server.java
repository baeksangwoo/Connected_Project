package tcp6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class Server extends Thread{


	ServerSocket serverSocket;
	boolean flag= true;
	boolean rflag = true; //receive���� ä���� ����ؼ� ������ ��
	//ArrayList<DataOutputStream>list = new ArrayList<>(); �ؽ����� �Ⱦ���
	
	HashMap<String, DataOutputStream> map= new HashMap(); //��� IP�� output�� �ִ°��� value
	
	public Server() throws IOException {
		//Create ServerSocket...
		serverSocket =new ServerSocket(8888);
		System.out.println("Ready Server...");
	}
	
	@Override
	public void run() {
		// Accept Client Connection...
		// ��� �޾ƾ� �Ѵ�.
		try {
			while(flag) {
				System.out.println("Ready Accept");
				Socket socket = 
						serverSocket.accept(); //������ ������ ������ ����� �ش�.
				new Receiver(socket).start(); //Ŭ���̾�Ʈ�� ������ Receiver�� ������ ����� �ش�.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	class Receiver extends Thread{  //Ŭ���̾�Ʈ �� �ϳ��� ����� ���� �� ��ó�� �޴� ��
		
		InputStream in; //First Client data get!
		DataInputStream din;
		OutputStream out;
		DataOutputStream dout;
		Socket socket; 
		String ip; //��� �� ���� IP
		
		public Receiver(Socket socket){ 
			// Thread �ȿ����� exception�� ������ ���� �� ����
			try {
				this.socket=socket;
				 
				System.out.println("������IP : "+socket.getInetAddress().getHostAddress());			
				in =socket.getInputStream();
				din =new DataInputStream(in);
				out= socket.getOutputStream();
				dout = new DataOutputStream(out);
				ip= socket.getInetAddress().getHostAddress();
				map.put(ip, dout);
				System.out.println("Connected Count"+map.size());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//�޼����� �޴� ���̴�.��
	
		@Override
		public void run() {
				//Ŭ���̾�Ʈ�� 1��� �����尡 1���� ������ �ǰ� ������ ä���� �̷�� ���Ƿ� while�� �������Ѵ�.
				try {
					while(rflag) {
						if(socket.isConnected() && din!=null & din.available()>0) {
							String str =din.readUTF(); //Ŭ���̾�Ʈ�� ä���� ���� utf�� �޾ƿ´�
							if(str !=null && str.equals("q")) { //�޾� �� ���� null�� �ƴϰ� q��� ���̸�
								map.remove(ip);//�����Ѵ�.
								System.out.println("Connection Count: "+map.size());
								break; //������
							}
						    System.out.print(socket.getInetAddress()+" ������ :");
			                System.out.println(str); //���� �ܼ�
			              //  sendAll("["+ip+"]"+str); �ȵ���̵忡�� ������ �Ϳ��� ������ ����
 						}
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally { //while ������ �������� ��� ������ ������ �Ѵ�.
					try {
						Thread.sleep(20);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(dout !=null) {
						try {
							dout.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(din !=null) {
						try {
							din.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(socket !=null) {
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
	public void sendAll(String msg) { //��ü ä��
		System.out.println(msg);
		Sender sender =new Sender();
		sender.setMeg(msg);
		sender.start(); //�������� ���� �޼����� �����Ѵ�
	}
	
	
	class Sender extends Thread{ //Send Message to All Clients
		String msg;
		public void setMeg(String msg) {
			this.msg=msg;
		}
		@Override
		public void run() {
			try {
				Collection<DataOutputStream> col = map.values();
				Iterator<DataOutputStream> it =col.iterator();
				while(it.hasNext()) {
					it.next().writeUTF(msg);
				}
			
			}catch(Exception e) {
			//	e.printStackTrace(); ������ ����� ����� ���̶� ������ ����� ���ڶ� ���ļ� ������ ���� ���� �ּ�
			}
		}
	}
	
	public void stopServer() {
			
		rflag=false; //������ �����ϱ� ����
		
	}
	
	
}