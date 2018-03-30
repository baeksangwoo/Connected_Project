package ExamArrayList;

import java.util.LinkedList;

public class FirstInFirstOutQuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> queue =new LinkedList<String>();
		queue.offer("사자");
		queue.offer("호랭이");
		queue.offer("악어");
		
	
		//큐로 쓰일때에는 offer로 먼저 밀어 넣고 
		// poll()로 땡겨서 처음부터 쓴다.
		
		while(!queue.isEmpty())
		{
			String d = queue.poll();
			System.out.println(d);
		}
		
	}
	

}
