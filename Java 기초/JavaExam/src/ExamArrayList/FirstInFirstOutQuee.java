package ExamArrayList;

import java.util.LinkedList;

public class FirstInFirstOutQuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> queue =new LinkedList<String>();
		queue.offer("����");
		queue.offer("ȣ����");
		queue.offer("�Ǿ�");
		
	
		//ť�� ���϶����� offer�� ���� �о� �ְ� 
		// poll()�� ���ܼ� ó������ ����.
		
		while(!queue.isEmpty())
		{
			String d = queue.poll();
			System.out.println(d);
		}
		
	}
	

}
