package tcp4;

import java.util.Scanner;

public class Client {
	
	boolean flag= true;
	
	public void startClient() {
		Scanner scanner = new Scanner(System.in);
		while(flag) {
			System.out.println("Input Server...");
			String str = scanner.nextLine();
			
			if(str.equals("q")) {
				scanner.close();
				break;
			}
		}
		System.out.println("Stop Client!!");
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
