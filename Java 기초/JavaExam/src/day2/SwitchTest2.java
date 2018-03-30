package day2;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month =(int)(Math.random()*12)+1 ;  // 난수 식
		
		
		switch (month)
		{
		case 3 : 
		case 4 : 
		case 5 : 
		   System.out.println(month +"월은 봄");
		   break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month +"월은 여름");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month +"월은 가을");
			break;
			default :
			System.out.println(month +"월은 겨울");
		}
				
	}

}
