package day3;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("심플 구구단");
		
		int dan = (int)(Math.random()*9)+1; // 1~9사이의 난수를 추출
		
		System.out.print(dan + "단:");
		
		for(int num=1; num<=9; num++)
		{
			System.out.print(dan*num + "\t");
		}
		
			
	}

}
