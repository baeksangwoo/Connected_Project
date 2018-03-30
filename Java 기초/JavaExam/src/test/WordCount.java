package test;

import java.util.HashSet;
import java.util.Set;

public class WordCount {

	
	int countString(String text, boolean word)
	{
		int count = 0;
		int decount =0;
		// 기능 구현
		String go=text;
		
		String [] data = go.split(" ");
		
		HashSet<String> set = new HashSet<String>();
		
		for(int e=0;e<data.length; e++)
		{
			set.add(data[e]);
		}
			
		if(word == true)
		{	
			count=set.size();
		}
		else 
		{
			
			//중복을 줄이지말고 출력해라
			for(int i=0;i<data.length;i++)
			{
				count++;
			}
			
		}
		
		return count;
	}
	
}
