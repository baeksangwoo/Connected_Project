package day3;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num = 0;
		
		/*boolean flag = true;   //  while ���� ������ �����ϰ� ����� ������ flag�� true�� ����
		
		while(flag)
		{
			num = (int)(Math.random()*6)+1;
			if (num == 3)
			{
				System.out.println("�����մϴ�. ��÷!!" + "\n" +" ��ȣ : " +  num) ;
				flag = false; 
			}
			else 
			{
				System.out.println("�ƽ�����, Ż��!!" + "��ȣ : " +  num) ;
				System.out.println("�ٽ� ���? ") ;
				flag = false ;
			}
				
		}*/
		
		while(true)
		{
			num = (int)(Math.random()*6)+1;
			if (num == 3)
			{
				System.out.println("�����մϴ�. ��÷!!" + "\n" +" ��ȣ : " +  num) ;
			    break; 
			}
			else 
			{
				System.out.println("�ƽ�����, Ż��!!" +  "\n" +"��ȣ : " +  num) ;
				System.out.println("�ٽ� ���? ") ;
				break;
			}
				
		}
		
		
		
		
		
		
		

		
	}

}
