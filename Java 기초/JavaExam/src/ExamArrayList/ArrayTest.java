package ExamArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class ArrayTest {

	
	public static void main(String[] args) {
		LinkedList<String> list =new LinkedList<String>();
		list.add("망고");
		list.add("맹고");
		list.add("싸꽝");
		list.add("쌰소");
		
		
		//아직도 외우지 못했다....
		Iterator<String> iterator1 = list.iterator();
	
		while(iterator1.hasNext())
		{
			String ne= iterator1.next();
			System.out.println(ne);
		}
		
		for(String str : list)//어드밴스  for문은
			
			//리스트에서 iterator 객체가 자동으로 얻어지고
			//그 객체에서 얻은 데이터가 str변수에 대입이된다.
		{
			System.out.println(str);
		}
	}
	//java에서 스택으로 사용가능 한것은 linked list이다.
}
