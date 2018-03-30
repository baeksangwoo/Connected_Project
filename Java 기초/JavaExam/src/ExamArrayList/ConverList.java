package ExamArrayList;

import java.util.ArrayList;

public class ConverList {

	public ArrayList<Integer> ConverList(int array[])
	{
		ArrayList<Integer> a =new ArrayList<Integer>(array.length);
		
		int dd[]={};
		
		
		for(int d=array.length-1;d>=0; d--)
		{
			a.add(array[d]);
		}
		return a;
	}
	
}
