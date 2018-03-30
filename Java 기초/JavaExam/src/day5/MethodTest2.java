package day5;

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() 메서드 수행 시작");
		
	     // int aaa = 100; 리턴 값 없어서 에러 
		
		// printMsg(100); 메서드가 어떤 변수를 정의하지 않아서 에러가 발생함. 
		printMsg('A' , "호출1");    // 밑에서 char와 String을 받았기 때문에 위에 printMsg는 밑에 형식과 똑같이 셋팅해야함
		printMsg('B' , "호출2");
		printMsg('C' , "호출3");
		
		System.out.println("main() 메서드 수행 종료");
		
	}
		public static void printMsg(char deco, String msg) {   // char 하나와 string 형 하나를 무조건 받아줘야함   
			System.out.println(deco + "\t"+msg + "\t"+deco); 
		
		}
}
