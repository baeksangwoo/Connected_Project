package day15;

public class ThreadEx3 {

	public static void main(String[] args) {
	
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); //쓰래드가 새로 생성되지 않았다 그저 ThreadEx3_1  클래스의 run()이 호출되었을 뿐이다.
		//main 쓰레드의 호출 스택이여서 main이 포함이 되어있다.
		
	}
}

class ThreadEx3_1 extends Thread {
	
	public void run(){
		throwException();
	}
	public void throwException()
	{
		try{
			throw new Exception();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
