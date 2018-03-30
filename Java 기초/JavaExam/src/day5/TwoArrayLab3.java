package day5;

public class TwoArrayLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr [][] = {  {10,20,30,40,50}
						, {5,10,15}
						, {11,22,33,44}
						, {9,8,7,6,5,4,3,2,1}};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				sum += arr[i][j];
			}
			/*
			 * int[][] arr = new int[4][];
		arr[0] = new int[] { 10, 20, 30, 40, 50 };
		arr[1] = new int[] { 5, 10, 15 };
		arr[2] = new int[] { 11, 22, 33, 44 };
		arr[3] = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int num : arr[i]) {
				sum += num;
			}
			System.out.println(i+1+"행의 합은"+sum+"입니다.");
			sum = 0;
				}*/
			
			System.out.println(i+1/*앞에 덧셈은 그냥 연산, 뒤에 덧셈은 문자열 결합*/+"행의 합은 " + sum + " 입니다");
			sum=0;
		}

		
		
	}
	}

