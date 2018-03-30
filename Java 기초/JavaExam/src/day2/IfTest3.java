package day2;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = (int)(Math.random()*101) ;  // 난수 식
		
		
		if(90<=score && score<=100)
		{
			System.out.println(score + " : A등급");
		}
		else if(80<=score && score<=89)
		{
			System.out.println(score + " : B등급");
		}
		else if(70<=score && score<=79)
		{
			System.out.println(score + " : C등급");
		}
		else if(60<=score && score<=69)
		{
			System.out.println(score + " : D등급");
		}
		else 
		{
			System.out.println(score + " : F등급");
		}
		
		System.out.println("");
		System.out.println("수행종료");
		
	}

}
