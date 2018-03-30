package day5;

public class MethodLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num1=0, num2=0 ;
	int result ; 
	
	
	for(int i = 0; i<5;i++)
	{
		num1 = (int) (Math.random()*30)+1;
	    num2 = (int) (Math.random()*30)+1;
		
	    result = test(num1,num2);

		if (num1-num2>0) System.out.println(num1 + "와" + num2 + "의 차는 "+ result + "입니다.");
		else if (num1-num2<0) System.out.println("num2 가 크다" + result);
		else System.out.println("num1과 num2 가 같다" + result);
	}
	 
	}
	
	
	public static int test (int num1, int num2)
	{
			return num1-num2;
	}
		
		
		/*for(int i = 0; i<num; i++)
		{
			System.out.print(name);
		}
		System.out.println();*/
	}
	
