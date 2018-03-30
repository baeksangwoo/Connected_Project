package day7;

import java.util.ArrayList;

import day12.ConvertList;

public class ListTest   {

	public static void main(String[] args) {
		
		int array[]={3,4,2,5,2,3,6,7,5,7,9};
		ConvertList p =new ConvertList();
		ArrayList<Integer> result=p.convertList(array);
		for(int i=0; i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
	}
}
