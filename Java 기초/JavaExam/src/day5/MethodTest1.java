package day5;

public class MethodTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() 메서드 수행 시작");
		
	     // int aaa = 100; 리턴 값 없어서 에러 
		
		// printMsg(100); 메서드가 어떤 변수를 정의하지 않아서 에러가 발생함. 
		printMsg();
		printMsg();
		printMsg();
		
		System.out.println("main() 메서드 수행 종료");
		
	}
		public static void printMsg() {   // 매개변수 없고 리턴값도 없음. printMsg라는 애는   
			System.out.println("자바언어를 학습합니다"); 
		
		}
}
