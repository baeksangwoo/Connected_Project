package t3;

import java.util.Scanner;

class Receiver implements Runnable {
	
	String cmd;
	
    public void setCmd(String cmd) {
    	cmd = this.cmd;
    }

   @Override
   public void run() {
      while (true) {
         if(cmd !=null && cmd.equals("s")) {
        	 for(int i=0;i<=30;i++) {
	        	 System.out.println(i);
	 	         try {
	 	            Thread.sleep(300);
	 	         } catch (InterruptedException e) {
	 	            e.printStackTrace();
	 	         }
        	 }
         }
      }
   }
}


public class t3 {
	
	public static void main(String[] args) {
		Receiver r =new Receiver();
		Thread t = new Thread(r);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Cmd");
		String cmd = sc.nextLine();
		r.setCmd(cmd.trim());
		System.out.println("Main");
		
		
	}
	
	
}
