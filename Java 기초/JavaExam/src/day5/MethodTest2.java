package day5;

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main() �޼��� ���� ����");
		
	     // int aaa = 100; ���� �� ��� ���� 
		
		// printMsg(100); �޼��尡 � ������ �������� �ʾƼ� ������ �߻���. 
		printMsg('A' , "ȣ��1");    // �ؿ��� char�� String�� �޾ұ� ������ ���� printMsg�� �ؿ� ���İ� �Ȱ��� �����ؾ���
		printMsg('B' , "ȣ��2");
		printMsg('C' , "ȣ��3");
		
		System.out.println("main() �޼��� ���� ����");
		
	}
		public static void printMsg(char deco, String msg) {   // char �ϳ��� string �� �ϳ��� ������ �޾������   
			System.out.println(deco + "\t"+msg + "\t"+deco); 
		
		}
}
