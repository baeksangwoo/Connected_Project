package day6;

public class MethodLab6 {

	public static void main(String[] args) {
		char[] a1 = { 'A', 'b', 'C' };
		char[] a2 = { 'a', 'b', 'c', 'D', 'E', 'F' };
		char[] a3 = { 'z', 'S', 'Z', 'S' };
		System.out.println("-------------");
		System.out.print("ȣ���� : ");
		System.out.println(a1); // char �迭�� �׳� �ָ��� ��µ�
		convertChar(a1);
		System.out.print("ȣ���� : ");
		System.out.println(a1);
		System.out.println("-------------");

		System.out.print("ȣ���� : ");
		System.out.println(a2);
		convertChar(a2);
		System.out.print("ȣ���� : ");
		System.out.println(a2);
		System.out.println("-------------");

		System.out.print("ȣ���� : ");
		System.out.println(a3);
		convertChar(a3);
		System.out.print("ȣ���� : ");
		System.out.println(a3);
		System.out.println("-------------");

	}

	public static void convertChar(char[] change) {
		for (int i = 0; i < change.length; i++) {
			if (change[i] < 97)
				change[i] += 32;
			else
				change[i] -= 32;

		}

	}

}
