package day12;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTestNew {
	public static void main(String[] args)  {
		ArrayList<String> list =new ArrayList<String>();
		list.add("java");
		list.add("100");
		list.add("serlvet");
		list.add("jdbc");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		for(String s : list)
		{
			System.out.println(s);
		}
		System.out.println();
		
		Iterator<String> iter= list.iterator();//Ÿ�� �Ķ���͸� ���ؾ��Ѵ�.
		
		while(iter.hasNext())
		{
			String s =iter.next();
			System.out.println(s);
		}
	
	}
}
