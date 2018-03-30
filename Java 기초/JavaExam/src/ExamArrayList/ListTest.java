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
	
		//자료 구조의 크기를 얻어오는 것은 ArrayList<Integer> d 라고 정의하면 
		//d.size()가 그 구조의 인덱스의 크기이다
		//list에서 값을 가져오려면 d.get(원하는곳); 을 적어야한다.
		
		
	}

}
