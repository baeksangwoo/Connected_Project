package day3;

public class BreakTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("            �������� �ܶ� 		   �������� �ܶ�");
		
		abc: for(int dan=1; dan<10; dan++)   //abc ���� ���� ��ø�� �ݺ��� �ȿ��� �ѹ��� �������� ���� ���� �� �ִ�.
		{
			System.out.println("");
			System.out.print(dan + "�� : "); //9������
			
			for(int num=1; num<=9; num++) // 9������
			{	
				if(dan*num >30)
					break abc;
				System.out.print(dan*num + "\t");  //81��
			}
			System.out.println(); //9�� ����
		}

	}

}
