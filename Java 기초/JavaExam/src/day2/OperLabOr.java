package day2;

public class OperLabOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*�ǽ� 1- if �� ��� �ǽ� 

		1. OperLabAnd(&&�����ڻ��), OperLabOr(||�����ڻ��) 
		   �̶�� Ŭ������ ���� �ϳ��� �����Ѵ�.
		2. grade ��� ������ int Ÿ������ �����ϰ� 1 ���� 6 ������ ���ڸ� 
		   �����ϰ� �����Ѵ�.
		3. grade �� ���� 1 �Ǵ� 2 �Ǵ� 3�̸� ���� ����� ����Ѵ�.
		   "x �г��� ���г��Դϴ�."
		   grade �� ���� 4 �Ǵ� 5 �Ǵ� 6�̸� ���� ����� ����Ѵ�.
		   "x �г��� ���г��Դϴ�."*/
		
		int grade = (int)(Math.random()*6+1) ;  // ���� ��
				
		  if(grade==1||grade==2||grade==3)
		  {
			  System.out.println(grade + " �г��� ���г��Դϴ�");
		  }
		  else
		  {
			  System.out.println(grade + " �г��� ���г��Դϴ�");
		  }
		
	}

}
