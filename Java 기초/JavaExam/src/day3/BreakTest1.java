package day3;

public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("            구구단을 외라 		   구구단을 외라");
		
		abc: for(int dan=1; dan<10; dan++)   //abc 라벨을 통해 중첩된 반복문 안에서 한번에 여러개를 빠져 나올 수 있다.
		{
			System.out.println("");
			System.out.print(dan + "단 : "); //9번수행
			
			for(int num=1; num<=9; num++) // 9번수행
			{	
				if(dan*num >30)
					break abc;
				System.out.print(dan*num + "\t");  //81번
			}
			System.out.println(); //9번 수행
		}

	}

}
