package day10;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runtime r= Runtime.getRuntime(); //�ֱ��ִµ� ���� ���� �����ڸ� ���糵��
		r.exec("c:/windows/notepad.exe");
		//����ó��
		Runtime r1= Runtime.getRuntime(); //�ֱ��ִµ� ���� ���� �����ڸ� ���糵��
		Runtime r2= Runtime.getRuntime(); //�ֱ��ִµ� ���� ���� �����ڸ� ���糵��
		Runtime r3= Runtime.getRuntime(); //�ֱ��ִµ� ���� ���� �����ڸ� ���糵��
		
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);
	}

}
