package day3;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("            구구단을 외라 		   구구단을 외라");
		
		for(int dan=1; dan<10; dan++)
		{
			System.out.println("");
			System.out.print(dan + "단 : "); //9번수행
			
			for(int num=1; num<=9; num++) // 9번수행
			{	
				System.out.print(dan*num + "\t");  //81번
			}
			System.out.println(); //9번 수행
		}

	}

}
