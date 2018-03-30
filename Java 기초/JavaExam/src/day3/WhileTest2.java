package day3;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num = 0;
		
		/*boolean flag = true;   //  while 문을 무조건 수행하게 만드는 변수로 flag를 true로 셋팅
		
		while(flag)
		{
			num = (int)(Math.random()*6)+1;
			if (num == 3)
			{
				System.out.println("축하합니다. 당첨!!" + "\n" +" 번호 : " +  num) ;
				flag = false; 
			}
			else 
			{
				System.out.println("아쉬워요, 탈락!!" + "번호 : " +  num) ;
				System.out.println("다시 고고? ") ;
				flag = false ;
			}
				
		}*/
		
		while(true)
		{
			num = (int)(Math.random()*6)+1;
			if (num == 3)
			{
				System.out.println("축하합니다. 당첨!!" + "\n" +" 번호 : " +  num) ;
			    break; 
			}
			else 
			{
				System.out.println("아쉬워요, 탈락!!" +  "\n" +"번호 : " +  num) ;
				System.out.println("다시 고고? ") ;
				break;
			}
				
		}
		
		
		
		
		
		
		

		
	}

}
