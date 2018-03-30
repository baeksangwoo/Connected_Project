package ExamList;

import java.util.ArrayList;

public class ArrayListTse {

	public static void main(String args[]){
		
	ArrayList<String> list = new ArrayList<String>();
	list.add("Æ÷µµ");
	list.add("µþ±â");
	list.add("»ç°ú");
	
	list.add(2,"¹°");
	
	list.set(2, "°¡µÂ" );
	
	list.remove("µþ±â");
	
	list.add("µþ±â");
	System.out.println(list.size());
	
	System.out.println(list.get(2));
//	System.out.println(list.get(3));
	
	System.out.println(list.indexOf("Æ÷µµ"));
	System.out.println(list.lastIndexOf("µþ±â"));
	}
	
}
