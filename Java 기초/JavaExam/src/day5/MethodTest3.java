package day5;

public class MethodTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() �޼��� ���� ����");
		
		int result = addNumber();
		result = addNumber(100,200);
		System.out.println("�ٸ� ����� : " + result);
		
		System.out.println("main() �޼��� ���� ����: "+ result);
		
		System.out.println("main() �޼��� ���� ����");
		
	}
		public static int addNumber() {  // �Ʒ��Ͱ� �ٸ��Ŵ� �̸��� ������ �ƱԸ�Ʈ�� �ִ°Ͱ� ���°��� ���̿� ���� �޼��尡 �ٸ� �� �ִ�
			
			return 28+20;  
						
		}
		public static int addNumber(int n1, int n2) {   // �ٸ� �̸��� �޼���� ������ ����� �� �ִ�. 
			
			return n1+n2; 
		}
		public static int addNumber(int n1, int n2, int n3) {
			
			return n1+n2+n3;
		}
}

