package ExamList;

import java.util.ArrayList;

public class ArrayListTse {

	public static void main(String args[]){
		
	ArrayList<String> list = new ArrayList<String>();
	list.add("����");
	list.add("����");
	list.add("���");
	
	list.add(2,"��");
	
	list.set(2, "����" );
	
	list.remove("����");
	
	list.add("����");
	System.out.println(list.size());
	
	System.out.println(list.get(2));
//	System.out.println(list.get(3));
	
	System.out.println(list.indexOf("����"));
	System.out.println(list.lastIndexOf("����"));
	}
	
}
