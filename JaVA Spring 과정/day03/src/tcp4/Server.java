package tcp4;

import java.util.Scanner;

public class Server {
	
	boolean flag= true;
	
	public Server() {
		
	}
	
	public void startServer() {
		Scanner scanner = new Scanner(System.in);
		while(flag) {
			System.out.println("Input Server...");
			String str = scanner.nextLine();
			
			if(str.equals("q")) {
				scanner.close();
				break;
			}
		}
		System.out.println("Stop Server!!");
	}
	
	class Receiver extends Thread{ //받는 것 쓰레드
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}

	class Sender implements Runnable{ //보내는 것 쓰래드 

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
