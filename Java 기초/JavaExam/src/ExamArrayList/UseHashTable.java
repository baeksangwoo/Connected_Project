package ExamArrayList;

import java.util.HashMap;

public class UseHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> a = new HashMap<String, Integer>(100);
		
		a.put("해리", 10);
		Integer num= a.get("해리");
		System.out.println(num);
		
		a.remove("해리");
	}

}
