package day2;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month =(int)(Math.random()*12)+1 ;  // 난수 식
		
		
		if (3<=month && month <=5 )
		{
			System.out.println(month +"월은 봄");
		}
		else if (6<=month && month <=8 )
		{
			System.out.println(month +"월은 여름");
		}
		else if (9<=month && month <=11 )
		{
			System.out.println(month +"월은 가을");
		}
		else
		{	
			System.out.println(month +"월은 겨울");
		}
		
	}

}
