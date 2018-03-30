package day3;

public class ForLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = (int)((Math.random()*8)+3);
		int deco = (int)((Math.random()*3)+1);
		
		System.out.println(deco);
		System.out.println(count);
		

		if(deco==1)
		{
			for(int star=1;star<=count;star++)
			{
			System.out.print('*');
			}
			System.out.println();
		}
		
		else if(deco==2)
		{
			for(int dollar=1;dollar<=count;dollar++)
			{
			System.out.print('$');
			}
		}
		else
		{
			for(int s=1;s<=count;s++)
			{
			System.out.print('#');
			}
		}
		
			
		}
			
		
	
}
