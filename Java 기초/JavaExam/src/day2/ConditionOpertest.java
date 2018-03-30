package day2;

public class ConditionOpertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		실습 2 - if 문 사용 실습
		1. ConditionOperTest 라는 클래스를 생성한다.
		2. 1부터 5사이의 랜덤값을 추출한다.
		3. 추출된 값이 1이면 300 과 50 의 덧셈 연산을 처리한다.
		    추출된 값이 2이면 300 과 50 의 뺄셈 연산을 처리한다.
		    추출된 값이 3이면 300 과 50 의 곱센 연산을 처리한다.
		    추출된 값이 4이면 300 과 50 의 나눗셈 연산을 처리한다.
		    추출된 값이 5이면 300 과 50 의 나머지 연산을 처리한다.
		4. 출력 형식(단, 출력문장은 한 번만 구현한다.)
		    결과값 : XX
	*/	    
		    
		    int num = (int)(Math.random()*5+1);
		   
		    int result ;
		    
		    if(num==1)
		    {
		    	result = 300+50;
		    }
		    
		    else if(num==2)
		    {
		    	result = 300-50;
		    }
		    else if(num==3)
		    {
		    	result = 300*50;
		    }
		    else if(num==4)
		    {
		    	result = 300/50;
		    }
		    /*else if(num==5)
		    {
		    	result = 300/50;    -> 로 끝냈을 때 else 가 안나오는 이유, 
		    							result 값을 방만 만들고 초기화를 안해줘서
		    } */
		    else
		    {
		    	result = 300%50;
		    }
		    	System.out.println("결과값 : " + result );




		
	}

}
