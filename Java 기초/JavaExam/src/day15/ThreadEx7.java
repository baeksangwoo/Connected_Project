package day15;

import javax.swing.JOptionPane;

public class ThreadEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		
		
		String input =JOptionPane.showInputDialog("아무 값이나 치시오");
		System.out.println("입력한 값은 "+input+"입니다");	
	}

}
class ThreadEx7_1 extends Thread{
	public void run(){
		for(int i=19;i>0;i--)
		{
			System.out.println(i);
			try{
				Thread.sleep(100);
				
			}catch(Exception e)
			{
				
			}
		}
	}
}