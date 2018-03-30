package day1;

public class TypeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(7777777777); // 2의 31-1 값보다 큰 숫자라서 int 범위를 벗어나서 실행이 안됨 7, 9개 쓴것
		System.out.println(7777777777L);  // L을 붙여주면서 Long 형으로 쓰라고 명령.
		
		// System.out.println(true+1); 자바는 타입을 잘 지키는 언어이고, true는 논리형 언어라 오류 발생
		
		System.out.println(10+1);
		System.out.println("10"+1);  // 문자열 결합
		// + 연산자 (덧셈, 문자열 결합)
		System.out.println("곱셈결과 : "+10*2);
		System.out.println("바"+"보");
		System.out.print("곱셈결과 : ");  // println은 출력하고 다음으로 바꿔라, print는 출력만 해라
		System.out.println(10*2);
		
		System.out.println("덧셈결과 : " + 10+2);		
		//System.out.println("곱셈결과 : "+10*2); 차이점은 연산자 우선순위 때문에 덧셈결과에서는 +10이 문자열로 변형됨
		System.out.println("덧셈결과 : " + (10+2));
		System.out.println("나눗셈결과 : " + 10/2);
		System.out.println("뺄셈결과 : " + (10-2));
		System.out.println('1'+0+2);

	}

}

