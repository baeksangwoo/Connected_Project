package ExamLinkelistTeste;

import java.util.Iterator;
import java.util.LinkedList;



public class LInketsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("»ó¤·");
		list.add("¸®Ä¡");
		
		list.add(2,"dfdf");
		System.out.println(list);
		
		Iterator<String> iterator =list.iterator();
		
		while(iterator.hasNext())
		{
			
			
			String str=iterator.next();
			System.out.println(str);
		}
		
		
	}

}
