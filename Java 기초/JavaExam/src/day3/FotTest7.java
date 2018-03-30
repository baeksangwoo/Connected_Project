package day3;

public class FotTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 1, y = 10;
		
		for(; x <= 5&& y>= 5; x++,y--) //초기식은 필요없다면 생략해도 된다.
		{      // x,y 식을 연속으로 사용하려면 x,y논리 연산자로 구성해야함.			
			System.out.println("x="+x+",y="+y);
		}
		
		System.out.println();
		System.out.println("종료 : x="+x+",y="+y);
		
		
		
	}

}
