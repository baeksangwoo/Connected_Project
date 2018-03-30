package day12;

import java.util.HashSet;

import java.util.*;

public class LottoSet {
	public static void main(String[] args) {	
	HashSet<Integer> d = new HashSet<Integer>();
	
	
		while(d.size()<10)
		{
		int tmp = (int) (Math.random() * 20) + 10;
		d.add(tmp);
		}
		
		
		Iterator<Integer> iterator=d.iterator();
		System.out.println(d);
		System.out.print("ø¿¥√¿« ∑Œ∂«: ");
		while(iterator.hasNext())
		{
				int arr=iterator.next();
				if(iterator.hasNext())
				System.out.print(arr+",");
				else
				System.out.print(arr);
	
		}
	}
}
