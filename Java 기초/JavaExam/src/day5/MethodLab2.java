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

		if (num1-num2>0) System.out.println(num1 + "��" + num2 + "�� ���� "+ result + "�Դϴ�.");
		else if (num1-num2<0) System.out.println("num2 �� ũ��" + result);
		else System.out.println("num1�� num2 �� ����" + result);
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
	
