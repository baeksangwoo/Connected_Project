package day2;

public class OperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su = 10;
		su += 10; // su = su +10 ; 과 같음
		
		System.out.println(++su);  
		
		char ch1 = 'A';
		ch1++;
		System.out.println(ch1);
		System.out.println(ch1);
		
		ch1 += 5;
		System.out.println(ch1); // G
		
		ch1 = (char)(ch1 + 5);   // 에러 발생 이유 : char 형은 이항연산을 하고 나면 int 형으로 바뀌기 때문.
								 // 그래서 다시 형변환을 해줘야함. 따라서 ch1+5에 도 ()넣는 이유는 (ch1+5) 계산후
								 // char로 형변환 해라!! 라는 의미이기 때문
								 // --> +  * / % 
		System.out.println(ch1); // 
		
	}

}
