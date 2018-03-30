package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*for(int dan=9; dan>=5;dan--)
		{
			System.out.print(dan + "´Ü :  " );
			
			for(int num=1; num<=9; num++)
			{
				System.out.print(dan + "x" + num + "=" + dan*num + "\t");
				
			}
			System.out.println();*/
		int dan = 9;
		int jjan;

		while(dan>=5)
		{
			System.out.print(dan + "´Ü :  " );
			
			jjan=1;
			
			while(jjan<=9)
			{
				
				System.out.print(dan + "x" + jjan + "=" +  dan*jjan + "\t" );
				jjan++;
			}
			System.out.println();
			dan--;
			
		}
		
	}
		
}


