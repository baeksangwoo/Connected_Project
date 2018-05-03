package tcp6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
		
	   String address = "70.12.114.148";
	   Socket socket;
	   Scanner scanner;
	   boolean cflag = true;
	   boolean flag = true;
	   
		@Override
		public void run() { //안드로이드에서는 쓰레드를 쓰기 때문에 이걸 넣었다.
		      while (cflag) {
		         try {
		            socket = new Socket(address, 8888);
		            System.out.println("Connected Server ..");
		            cflag = false;
		            break;
		         } catch (IOException e) {
		            System.out.println("Retry ..");
		            try {
		               Thread.sleep(1000);
		            } catch (InterruptedException e1) {
		               // TODO Auto-generated catch block
		               e1.printStackTrace();
		            }
		         }
		      }
		      //After Client.. 커넥티드가 실행된뒤 이것이 실행된다.
		    
		      try {
				new Receiver(socket).start(); //소켓이 만들어 졌으니 받아서 처리할 준비
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	   
	   public Client() { // throws UnknownHostException, IOException

	   }

	   public void sednMsg(String msg) { //안드로이드에서는 여기다 메세지를 만들 것이다.
		   try {
			Sender sender = new Sender(socket);
			sender.setSendMsg(msg);
			new Thread(sender).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		   
		   
	   }
	   

	   class Sender implements Runnable {
	      Socket socket;
	      OutputStream out;
	      DataOutputStream outw;
	      String sendMsg;

	      public Sender(Socket socket) throws IOException {
	         this.socket = socket;
	         out = socket.getOutputStream();
	         outw = new DataOutputStream(out);
	      }

	      public void setSendMsg(String sendMsg) {
	         this.sendMsg = sendMsg;
	      }

	      @Override
	      public void run() {
	         try {
	            if (outw != null) {
	               outw.writeUTF(sendMsg);
	            }

	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }

	   class Receiver extends Thread {
	      Socket socket;
	      InputStream in;
	      DataInputStream inr;

	      public Receiver(Socket socket) throws IOException {
	         this.socket = socket;
	         in = socket.getInputStream();
	         inr = new DataInputStream(in);
	      }

	      @Override
	      public void run() {
	    	  try {
	    	  while (flag && inr != null) {
	            
	               String str = inr.readUTF();
	               System.out.println(str);
	               if (str.trim().equals("q")) {
	                  inr.close();
	                  break;
	               }
	            }
	         }catch(Exception e) {
	        	 e.printStackTrace();
	         }finally {
	        	 if(inr != null) {
		   	    	  try {
						inr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	 }
	         }

	      }
	   }

	   public void stopClient() {
		   try {
	            Thread.sleep(100);
	            flag=false;
	            if(socket!=null) {
	            socket.close();
	            }
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	   }
}
