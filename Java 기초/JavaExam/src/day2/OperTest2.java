package day2;

public class OperTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su = 10;
		su += 10; // su = su +10 ; �� ����
		
		System.out.println(++su);  
		
		char ch1 = 'A';
		ch1++;
		System.out.println(ch1);
		System.out.println(ch1);
		
		ch1 += 5;
		System.out.println(ch1); // G
		
		ch1 = (char)(ch1 + 5);   // ���� �߻� ���� : char ���� ���׿����� �ϰ� ���� int ������ �ٲ�� ����.
								 // �׷��� �ٽ� ����ȯ�� �������. ���� ch1+5�� �� ()�ִ� ������ (ch1+5) �����
								 // char�� ����ȯ �ض�!! ��� �ǹ��̱� ����
								 // --> +  * / % 
		System.out.println(ch1); // 
		
	}

}
