package day5;

public class MethodTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() �޼��� ���� ����");
		
		//int result = addNumber();   // ����ѹ��� ȣ���� �� �ƱԸ�Ʈ ���� ȣ����.
		
		char result = (char)addNumber();  // char���� �������� �� ��ȯ�� �ʿ��ϴ�
		
				
		/*System.out.println("ȣ�� �����1 : " + addNumber());
		System.out.println("ȣ�� �����2 : " + addNumber());
		System.out.println("ȣ�� �����3 : " + addNumber());  �̷��� ����ϸ� �޼��带 3�� �ҷ��;� �ϱ� ������ �޸� ����� Ŀ��
															  ���� 1���� ���� �ʹٸ� � ������ �����ϰ� �� ���� ���� ��� �ҷ����°� �� ȿ����
		*/
		System.out.println("ȣ�� �����2 : " + result);
		System.out.println("ȣ�� �����2 : " + result);
		System.out.println("ȣ�� �����2 : " + result);
		System.out.println("main() �޼��� ���� ����: "+ result);
		
		System.out.println("main() �޼��� ���� ����");
		
	}
		public static int addNumber() {   //  int addNumber �޼��带 �����ؼ� �� ���� ��ȯ ���� 10+20;���� ����
										// int ���� return ���� ���� ���� ??? �ٽ� Ȯ�� �غ��� �� ��....
			return 13+20;  //  char ���� return ���� �����  ascii �� �޾Ƽ� ���� ����� ���� ��� ������ �ٸ���.
						
		}
}
