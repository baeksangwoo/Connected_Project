package day11;
import java.util.Random;

class TestException extends Exception{
	TestException(String message){
		super(message);
	}
}
public class ExceptionTest3 {
	public static void main(String[] args){
	
		System.out.println("Main() 수행시작");
		a();
		
		System.out.println("Main() 수행종료");
		
	}
	static void a(){
		System.out.println("a() 수행시작");
		try{
			b();
		}catch(TestException e)
		{
			//System.out.println("오류 발생: "+e.getMessage());
			//return;
			//e.printStackTrace();
			System.exit(0); //죽여부려
		}
		System.out.println("a() 수행 종료");
	}
	static void b() throws TestException{
		System.out.println("b()수행시작");
		c();
		System.out.println("b() 수행종료");
	}
	static void c() throws TestException{
		System.out.println("c() 수행시작");
		boolean flag= new Random().nextBoolean();
	if(flag)
	{
		throw new TestException("<<::::::테스트로 예외 발생 시킴");
	}else{
		System.out.println(">_< : 뀨우우웅");
		
	}
	System.out.println("c() 수행종료");
	
	}
}
