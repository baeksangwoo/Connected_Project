package ExamArrayList;

import java.util.HashMap;

public class UseHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> a = new HashMap<String, Integer>(100);
		
		a.put("�ظ�", 10);
		Integer num= a.get("�ظ�");
		System.out.println(num);
		
		a.remove("�ظ�");
	}

}
