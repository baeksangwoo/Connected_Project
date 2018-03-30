package day2;

public class TypeTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		double num2 = num1;
				
		System.out.println(num1 + " : " + num2);
		
		num2 = 3.14 ;
		System.out.println(num2);
		
		num1 = (int) num2 ; // (int)강제 형변환 연산자
		System.out.println(num1 + " : " + num2);  // 형변환 연산자는 소수점을 그냥 날림
	
	}

}
