package day3;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���� ������");
		
		int dan = (int)(Math.random()*9)+1; // 1~9������ ������ ����
		
		System.out.print(dan + "��:");
		
		for(int num=1; num<=9; num++)
		{
			System.out.print(dan*num + "\t");
		}
		
			
	}

}
