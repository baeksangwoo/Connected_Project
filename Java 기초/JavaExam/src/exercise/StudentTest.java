package exercise;

public class StudentTest extends Student {
	public static void main(String args[]) {
	Student arrays [] = new Student[3];
	arrays[0]=new Student("ȫ�浿",20 ,171 ,81 ,"201101" ,"����");
	arrays[1]=new Student("��浿", 21 ,183, 72, "201102", "����");
	arrays[2]=new Student("�ڱ浿", 22, 175, 65, "201103", "�İ�");
	// Student ��ü�� 3�� �����Ͽ� �迭�� �ִ´�.
	// �迭�� �ִ� ��ü ������ printInformation()�� ȣ���Ͽ� ��� ��� �Ѵ�.
	for(Student d:arrays)
	{
		System.out.print(d.printInformation()+"\n");
	}
//	System.out.println(arrays[0].printInformation());
//	System.out.println(arrays[1].printInformation());
//	System.out.println(arrays[2].printInformation());
	
	}
}
