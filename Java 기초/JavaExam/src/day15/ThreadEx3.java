package day15;

public class ThreadEx3 {

	public static void main(String[] args) {
	
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); //�����尡 ���� �������� �ʾҴ� ���� ThreadEx3_1  Ŭ������ run()�� ȣ��Ǿ��� ���̴�.
		//main �������� ȣ�� �����̿��� main�� ������ �Ǿ��ִ�.
		
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
