package day2;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = (int)(Math.random()*101) ;  // ���� ��
		
		
		if(90<=score && score<=100)
		{
			System.out.println(score + " : A���");
		}
		else if(80<=score && score<=89)
		{
			System.out.println(score + " : B���");
		}
		else if(70<=score && score<=79)
		{
			System.out.println(score + " : C���");
		}
		else if(60<=score && score<=69)
		{
			System.out.println(score + " : D���");
		}
		else 
		{
			System.out.println(score + " : F���");
		}
		
		System.out.println("");
		System.out.println("��������");
		
	}

}
