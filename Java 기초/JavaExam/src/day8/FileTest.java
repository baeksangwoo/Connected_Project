package day8;
import java.io.File;
public class FileTest {
	public static void main(String[] args) {
		// �����Ϸ��� ���ϸ��̳� ���丮���� ǥ���Է�(Ű����)
		// ���� �޾� ó���ϵ��� �ҽ� ���� - Scanner
		File f = new File(
				"C:/unico/workspace/javaexam/src");
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("���丮�Դϴ�.");
			} else {
				System.out.println(f.length()+" ����Ʈ�� �����Դϴ�.");
			}
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}
