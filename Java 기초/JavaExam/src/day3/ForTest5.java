package day3;

public class ForTest5 {

	public static void main(String[] args) {
		 

		
		int count = (int)((Math.random()*7)+1);
		for(int i=1; i<=count; i++)
		{
			System.out.println("^^");  
		}
		
		System.out.println("");  

		
		for(int line=1; line<6; line++)
		{
			for(int num=1; num<=line; num++) // 9번수행
			{	
				System.out.print('$');  //81번
			}
			System.out.println(); //9번 수행
		}
		
		System.out.println(); 
		
		char munja = 'A';
		for(int line=1; line<6; line++)
		{
			for(int num=1; num<=line; num++) // 9번수행
			{	
				System.out.print(munja++);  //81번
			}
		System.out.println(); //9번 수행
		}
		System.out.println(); //9번 수행

		char hangul = '가';
		for(int line=1; line<10; line++)
		{
			for(int num=1; num<=line; num++) // 9번수행
			{	
				System.out.print(hangul++);  //81번
			}
			System.out.println(); //9번 수행
		}

	}

}
