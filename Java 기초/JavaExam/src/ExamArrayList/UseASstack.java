package ExamArrayList;

import java.util.LinkedList;

public class UseASstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		stack.addLast(2);
		stack.addLast(new Integer(224));
		stack.addLast(new Integer(3455));
		
		for(int i: stack)
		{
			System.out.println(i);
		}
		
		Integer OBJ =stack.getLast();
		System.out.println(OBJ);
		System.out.println(stack.getLast());
	//Stack�� �����͸� ������ ����
		
		for(int d: stack)
		{
			System.out.println(d);
		}
		
		while(!stack.isEmpty())
		{
			Integer num=stack.removeLast();
			System.out.println(num);
		}
		
		//�������� ����ϱ� ���ؼ��� 
		//LinkedList�� removeLast()�� �ؾ��Ѵ�.
		stack.removeLast();
	
	}

}
