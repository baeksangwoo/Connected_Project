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
		public void run() { //�ȵ���̵忡���� �����带 ���� ������ �̰� �־���.
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
		      //After Client.. Ŀ��Ƽ�尡 ����ȵ� �̰��� ����ȴ�.
		    
		      try {
				new Receiver(socket).start(); //������ ����� ������ �޾Ƽ� ó���� �غ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	   
	   public Client() { // throws UnknownHostException, IOException

	   }

	   public void sednMsg(String msg) { //�ȵ���̵忡���� ����� �޼����� ���� ���̴�.
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
