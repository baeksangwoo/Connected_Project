package day2;

public class IfTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =(int)(Math.random()*10)+1 ;  // ³­¼ö ½Ä
		
		if(num % 2 == 0)
			System.out.println(num + " : Â¦¼ö");
		else
			System.out.println(num + " : È¦¼ö"); 
		System.out.println("¼öÇàÁ¾·á");
		
		
		if(num % 2 != 0)  
			System.out.println(num + " : È¦¼ö");
		else
			System.out.println(num + " : Â¦¼ö"); 
			
		System.out.println("¼öÇàÁ¾·á");
		
		
	}

}
