package collection;

import java.util.*;

public class ProducTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeSet �� Product ��ü ����

		TreeSet<Product> set=new TreeSet<Product>();
		//HashSet<Product> set= new HashSet<Product>();	
		Iterator a=set.iterator(); 
		if(set.add(new Product("P100","TV",20000)))
		{
			System.out.println("���������� ����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
		}
	
		if(set.add(new Product("P200","Computer",10000)))
		{
			System.out.println("���������� ����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
		}
		
		if(set.add(new Product("P100","MP3",78900)))
		{
			System.out.println("���������� ����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
		}
		 
		if(set.add(new Product("P300","Audio",1000)))
		{
			System.out.println("���������� ����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
		}
		
		if(set.add(new Product("P400","MP3",1111718900)))
		{
			System.out.println("���������� ����Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("������ ID�� ��ǰ�� �̹� ����Ǿ� �ֽ��ϴ�.");
		}
		 
		System.out.println("��ǰ ID \t ��ǰ�� \t ����");
		System.out.println("--------------------------");
		
		Iterator<Product> it = set.iterator();
		while (it.hasNext()) {
			Product str=it.next();
			System.out.println(str);
		
		}		

		
		

	}

}
