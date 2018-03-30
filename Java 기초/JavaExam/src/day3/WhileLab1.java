package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random()*6+5);
		int i; int j=1;
		
		System.out.println("[ for 결과 ]");

		for(i=1;i<=num;i++)
		{
			System.out.println(i + " -> " +(i*i));
		}
		System.out.println("[ while 결과 ]");
		
		while(j<=10)
		{
			if(j<=num)
			{
				System.out.println(j + " -> " + (j*j));
				j++;
			}
			else
				break;
		}
		
	}

}
