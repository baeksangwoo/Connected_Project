package day3;

public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("            �������� �ܶ� 		   �������� �ܶ�");
		
		for(int dan=1; dan<10; dan++)
		{
			System.out.println("");
			System.out.print(dan + "�� : "); //9������
			
			for(int num=1; num<=9; num++) // 9������
			{	
				System.out.print(dan*num + "\t");  //81��
			}
			System.out.println(); //9�� ����
		}

	}

}
