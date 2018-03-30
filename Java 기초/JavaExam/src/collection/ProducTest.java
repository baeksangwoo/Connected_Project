package collection;

import java.util.*;

public class ProducTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeSet 에 Product 객체 저장

		TreeSet<Product> set=new TreeSet<Product>();
		//HashSet<Product> set= new HashSet<Product>();	
		Iterator a=set.iterator(); 
		if(set.add(new Product("P100","TV",20000)))
		{
			System.out.println("성공적으로 저장되었습니다.");
		}
		else
		{
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
	
		if(set.add(new Product("P200","Computer",10000)))
		{
			System.out.println("성공적으로 저장되었습니다.");
		}
		else
		{
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		
		if(set.add(new Product("P100","MP3",78900)))
		{
			System.out.println("성공적으로 저장되었습니다.");
		}
		else
		{
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		 
		if(set.add(new Product("P300","Audio",1000)))
		{
			System.out.println("성공적으로 저장되었습니다.");
		}
		else
		{
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		
		if(set.add(new Product("P400","MP3",1111718900)))
		{
			System.out.println("성공적으로 저장되었습니다.");
		}
		else
		{
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		 
		System.out.println("제품 ID \t 제품명 \t 가격");
		System.out.println("--------------------------");
		
		Iterator<Product> it = set.iterator();
		while (it.hasNext()) {
			Product str=it.next();
			System.out.println(str);
		
		}		

		
		

	}

}
