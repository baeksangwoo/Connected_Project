package day2;

public class ConditionOpertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		�ǽ� 2 - if �� ��� �ǽ�
		1. ConditionOperTest ��� Ŭ������ �����Ѵ�.
		2. 1���� 5������ �������� �����Ѵ�.
		3. ����� ���� 1�̸� 300 �� 50 �� ���� ������ ó���Ѵ�.
		    ����� ���� 2�̸� 300 �� 50 �� ���� ������ ó���Ѵ�.
		    ����� ���� 3�̸� 300 �� 50 �� ���� ������ ó���Ѵ�.
		    ����� ���� 4�̸� 300 �� 50 �� ������ ������ ó���Ѵ�.
		    ����� ���� 5�̸� 300 �� 50 �� ������ ������ ó���Ѵ�.
		4. ��� ����(��, ��¹����� �� ���� �����Ѵ�.)
		    ����� : XX
	*/	    
		    
		    int num = (int)(Math.random()*5+1);
		   
		    int result ;
		    
		    if(num==1)
		    {
		    	result = 300+50;
		    }
		    
		    else if(num==2)
		    {
		    	result = 300-50;
		    }
		    else if(num==3)
		    {
		    	result = 300*50;
		    }
		    else if(num==4)
		    {
		    	result = 300/50;
		    }
		    /*else if(num==5)
		    {
		    	result = 300/50;    -> �� ������ �� else �� �ȳ����� ����, 
		    							result ���� �游 ����� �ʱ�ȭ�� �����༭
		    } */
		    else
		    {
		    	result = 300%50;
		    }
		    	System.out.println("����� : " + result );




		
	}

}
