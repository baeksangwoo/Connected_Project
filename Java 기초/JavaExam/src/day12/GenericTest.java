package day12;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {
	public static void main(String[] args)  {
		ArrayList list =new ArrayList();
		list.add("java");
		list.add(100);
		list.add("serlvet");
		list.add("jdbc");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		for(Object value : list)
		{
			String s=(String)value; //string �� ��ȯ STring�� �ִ� ������ ���� ����
			System.out.println(s);
		}
		System.out.println();
		
		Iterator iter= list.iterator();
		
		while(iter.hasNext())
		{
			String s =(String)iter.next();
			System.out.println(s);
		}
	
	}
}
