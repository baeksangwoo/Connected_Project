package day15;

import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input =JOptionPane.showInputDialog("�ƹ� ���̳� ġ�ÿ�");
		System.out.println("�Է��� ���� "+input+"�Դϴ�");
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
