package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		실습2
		1. WhileLab2 이라는 클래스를 생성한다.
		2. 0부터 30사이의 난수를 추출한다.
		    추출된 숫자가 1이면 'A', 2 이면 'B', ... 26이면 'Z' 를 출력하는데
		    계속 난수 추출과 문자출력을 반복하다가 난수가 0이 추출되거나
		    27~30이 추출되면 반복을 끝낸다.
		    반복하는 동안 출력형식 :  	B(2)
		    			A(1)
					D(4)
					  :
		    마지막에는 "수행횟수는 x 번입니다"를 출력하고 종료한다.*/
		    
		
		int num;	
		char ch = 64;
		int count = 0;
		
		while (true)
		{
			num = (int)(Math.random()*31);
			
			if(num>=1 && num<=26)
			{
				System.out.println((char)(ch+num) + "(" + num+")");
				count++;
			}
			else
				break;
		}			
			
		System.out.println("수행횟수는 "+count+"번입니다.");
		
		
	
	}
		
}

