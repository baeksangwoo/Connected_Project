package ExamArrayList;

import java.util.ArrayList;

public class ListTest extends ConverList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3,5,6,7,8,9,0,5,9,5,6};
		
		ArrayList<Integer> d = new ConverList().ConverList(array);
		System.out.println(d);
		
		for(int i=0;i<d.size();i++)
		{
			System.out.printf("%d \n",d.get(i));
		}
	
		//�ڷ� ������ ũ�⸦ ������ ���� ArrayList<Integer> d ��� �����ϸ� 
		//d.size()�� �� ������ �ε����� ũ���̴�
		//list���� ���� ���������� d.get(���ϴ°�); �� ������Ѵ�.
		
		
	}

}
