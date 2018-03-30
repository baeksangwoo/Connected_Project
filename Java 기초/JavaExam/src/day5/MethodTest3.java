package day5;

public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() 메서드 수행 시작");
		
		int result = addNumber();
		result = addNumber(100,200);
		System.out.println("다른 결과값 : " + result);
		
		System.out.println("main() 메서드 수행 종료: "+ result);
		
		System.out.println("main() 메서드 수행 종료");
		
	}
		public static int addNumber() {  // 아래것과 다른거는 이름은 같지만 아규먼트가 있는것과 없는것의 차이에 따라 메서드가 다를 수 있다
			
			return 28+20;  
						
		}
		public static int addNumber(int n1, int n2) {   // 다른 이름의 메서드는 무제한 사용할 수 있다. 
			
			return n1+n2; 
		}
		public static int addNumber(int n1, int n2, int n3) {
			
			return n1+n2+n3;
		}
}

