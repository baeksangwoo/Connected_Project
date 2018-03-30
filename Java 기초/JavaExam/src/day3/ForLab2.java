package day3;

public class ForLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int numOdd = 1;
			int numEven = 1;
		
		for(int gop=5; gop<=20;gop++)
		{
			if(gop%2==0)
			{
				numEven *= gop;
			}
			else
			{
				numOdd *= gop;	
			}
		}
			System.out.println("Â¦¼öÀÇ °ö : " + numEven);
			System.out.println("È¦¼öÀÇ °ö : " + numOdd);
			
			
	}
}
