package day2;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =(int)(Math.random()*10)+1 ;  // ���� ��
		
		if(num % 2 == 0)
			System.out.println(num + " : ¦��");
		else
			System.out.println(num + " : Ȧ��"); 
		System.out.println("��������");
		
		
		if(num % 2 != 0)  
			System.out.println(num + " : Ȧ��");
		else
			System.out.println(num + " : ¦��"); 
			
		System.out.println("��������");
		
		
	}

}
