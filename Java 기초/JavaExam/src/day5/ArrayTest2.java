package day5;
public class ArrayTest2 {
	public static void main(String[] args) {
		int score[ ] = new int[5];
		for(int data:score)
			System.out.println(data);  // for문을 위와 같이 작성하면 아래와 같다.(enhanced for)

		/*System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);*/
		
		score[0] = 100;
		score[1] = 200;
		score[2] = 300;
		score[3] = 400;
		score[4] = 500;
		
		for(int data:score)
			System.out.print(data +"\t");
		
		for(int data:score)
			System.out.println(++data);
		    

		
		System.out.println(++score[0]);
		System.out.println(++score[1]);
		System.out.println(++score[2]);
		System.out.println(++score[3]);
		System.out.println(++score[4]);	
	}
}








