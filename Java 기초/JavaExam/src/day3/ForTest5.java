package day3;

public class ForTest5 {

	public static void main(String[] args) {
		 

		
		int count = (int)((Math.random()*7)+1);
		for(int i=1; i<=count; i++)
		{
			System.out.println("^^");  
		}
		
		System.out.println("");  

		
		for(int line=1; line<6; line++)
		{
			for(int num=1; num<=line; num++) // 9������
			{	
				System.out.print('$');  //81��
			}
			System.out.println(); //9�� ����
		}
		
		System.out.println(); 
		
		char munja = 'A';
		for(int line=1; line<6; line++)
		{
			for(int num=1; num<=line; num++) // 9������
			{	
				System.out.print(munja++);  //81��
			}
		System.out.println(); //9�� ����
		}
		System.out.println(); //9�� ����

		char hangul = '��';
		for(int line=1; line<10; line++)
		{
			for(int num=1; num<=line; num++) // 9������
			{	
				System.out.print(hangul++);  //81��
			}
			System.out.println(); //9�� ����
		}

	}

}
