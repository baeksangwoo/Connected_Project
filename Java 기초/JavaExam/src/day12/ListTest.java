package day12;

import java.util.ArrayList;

public class ListTest   {

	public static void main(String[] args) {
		
		int array[]={3,4,2,5,2,3,6,7,5,7,9};
		ArrayList<Integer> result=new ConvertList().convertList(array);//한번만 사용할 꺼라면 이렇게 만든다.
		System.out.println(result);
		for(int i=0; i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
		
		//arrayList <자료구조> list와 같다.
	}
}
