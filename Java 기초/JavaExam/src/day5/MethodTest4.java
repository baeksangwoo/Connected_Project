package day5;

public class MethodTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() 메서드 수행 시작");
		
		//int result = addNumber();   // 에드넘버를 호출할 때 아규먼트 없이 호출함.
		
		char result = (char)addNumber();  // char형에 넣으려면 형 변환이 필요하다
		
				
		/*System.out.println("호출 결과값1 : " + addNumber());
		System.out.println("호출 결과값2 : " + addNumber());
		System.out.println("호출 결과값3 : " + addNumber());  이렇게 출력하면 메서드를 3번 불러와야 하기 때문에 메모리 사용이 커짐
															  따라서 1번만 스고 싶다면 어떤 변수를 설정하고 그 변수 값을 계속 불러오는게 더 효율적
		*/
		System.out.println("호출 결과값2 : " + result);
		System.out.println("호출 결과값2 : " + result);
		System.out.println("호출 결과값2 : " + result);
		System.out.println("main() 메서드 수행 종료: "+ result);
		
		System.out.println("main() 메서드 수행 종료");
		
	}
		public static int addNumber() {   //  int addNumber 메서드를 정의해서 그 값의 반환 값을 10+20;으로 정의
										// int 값은 return 값에 따라 정의 ??? 다시 확인 해봐야 할 듯....
			return 13+20;  //  char 형은 return 값의 결과를  ascii 로 받아서 받은 결과에 따라 출력 내용이 다르다.
						
		}
}
