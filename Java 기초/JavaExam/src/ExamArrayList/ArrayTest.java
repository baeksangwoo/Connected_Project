package ExamArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayTest {

	
	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("����");
		list.add("�Ͱ�");
		list.add("�β�");
		list.add("�X��");
		
		
		//������ �ܿ��� ���ߴ�....
		Iterator<String> iterator1 = list.iterator();
	
		while(iterator1.hasNext())
		{
			String ne= iterator1.next();
			System.out.println(ne);
		}
		
		for(String str : list)//���꽺  for����
			
			//����Ʈ���� iterator ��ü�� �ڵ����� �������
			//�� ��ü���� ���� �����Ͱ� str������ �����̵ȴ�.
		{
			System.out.println(str);
		}
	}
	//java���� �������� ��밡�� �Ѱ��� linked list�̴�.
}
