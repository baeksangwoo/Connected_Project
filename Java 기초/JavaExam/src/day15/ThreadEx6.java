package day15;

import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =JOptionPane.showInputDialog("아무 값이나 치시오");
		System.out.println("입력한 값은 "+input+"입니다");
		for(int i=19;i>0;i--)
		{
			System.out.println(i);
			try{
				Thread.sleep(1000);
				
			}catch(Exception e)
			{
				
			}
		}
	}

}
