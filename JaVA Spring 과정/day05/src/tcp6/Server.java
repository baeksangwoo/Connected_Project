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
	boolean rflag = true; //receive에서 채팅을 계속해서 돌리는 것
	//ArrayList<DataOutputStream>list = new ArrayList<>(); 해쉬맵을 안쓸때
	
	HashMap<String, DataOutputStream> map= new HashMap(); //어떠한 IP의 output이 있는가가 value
	
	public Server() throws IOException {
		//Create ServerSocket...
		serverSocket =new ServerSocket(8888);
		System.out.println("Ready Server...");
	}
	
	@Override
	public void run() {
		// Accept Client Connection...
		// 계속 받아야 한다.
		try {
			while(flag) {
				System.out.println("Ready Accept");
				Socket socket = 
						serverSocket.accept(); //소켓이 들어오면 소켓을 만들어 준다.
				new Receiver(socket).start(); //클라이언트가 들어오면 Receiver를 새로이 만들어 준다.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	class Receiver extends Thread{  //클라이언트 당 하나씩 만들어 지는 것 맨처음 받는 것
		
		InputStream in; //First Client data get!
		DataInputStream din;
		OutputStream out;
		DataOutputStream dout;
		Socket socket; 
		String ip; //들어 온 곳의 IP
		
		public Receiver(Socket socket){ 
			// Thread 안에서는 exception을 밖으로 던질 수 없다
			try {
				this.socket=socket;
				 
				System.out.println("접속자IP : "+socket.getInetAddress().getHostAddress());			
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
		}//메세지를 받는 것이다.ㅈ
	
		@Override
		public void run() {
				//클라이언트가 1명당 쓰레드가 1개가 생성이 되고 끝없이 채팅이 이루어 지므로 while로 돌려야한다.
				try {
					while(rflag) {
						if(socket.isConnected() && din!=null & din.available()>0) {
							String str =din.readUTF(); //클라이언트가 채팅한 것을 utf로 받아온다
							if(str !=null && str.equals("q")) { //받아 온 값이 null이 아니고 q라는 것이면
								map.remove(ip);//삭제한다.
								System.out.println("Connection Count: "+map.size());
								break; //나가자
							}
						    System.out.print(socket.getInetAddress()+" 접속자 :");
			                System.out.println(str); //서버 콘솔
			              //  sendAll("["+ip+"]"+str); 안드로이드에서 보내는 것에서 구현할 예정
 						}
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}finally { //while 루프가 나갔을때 모든 정보를 지워야 한다.
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
	public void sendAll(String msg) { //전체 채팅
		System.out.println(msg);
		Sender sender =new Sender();
		sender.setMeg(msg);
		sender.start(); //센더에서 받은 메세지를 시작한다
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
			//	e.printStackTrace(); 나가는 사람이 남기는 것이랑 들어오는 사람의 문자랑 겹쳐서 오류가 나니 여긴 주석
			}
		}
	}
	
	public void stopServer() {
			
		rflag=false; //서버를 종료하기 위해
		
	}
	
	
}