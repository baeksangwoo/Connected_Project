package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		�ǽ�2
		1. WhileLab2 �̶�� Ŭ������ �����Ѵ�.
		2. 0���� 30������ ������ �����Ѵ�.
		    ����� ���ڰ� 1�̸� 'A', 2 �̸� 'B', ... 26�̸� 'Z' �� ����ϴµ�
		    ��� ���� ����� ��������� �ݺ��ϴٰ� ������ 0�� ����ǰų�
		    27~30�� ����Ǹ� �ݺ��� ������.
		    �ݺ��ϴ� ���� ������� :  	B(2)
		    			A(1)
					D(4)
					  :
		    ���������� "����Ƚ���� x ���Դϴ�"�� ����ϰ� �����Ѵ�.*/
		    
		
		int num;	
		char ch = 64;
		int count = 0;
		
		while (true)
		{
			num = (int)(Math.random()*31);
			
			if(num>=1 && num<=26)
			{
				System.out.println((char)(ch+num) + "(" + num+")");
				count++;
			}
			else
				break;
		}			
			
		System.out.println("����Ƚ���� "+count+"���Դϴ�.");
		
		
	
	}
		
}

