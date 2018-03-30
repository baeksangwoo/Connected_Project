package day6;

public class MethodLab4 {

	public static void main(String[] args) {
		int result;
		result = maxNumArray(new int[] { 10, 20, 30 });
		System.out.print("가장 큰 값은 " + result + " 입니다.");
		System.out.println();
		result = maxNumArray(new int[] { 100, 500, 300, 200, 400 });
		System.out.print("가장 큰 값은 " + result + " 입니다.");
		System.out.println();
		result = maxNumArray(new int[] { 1, 10, 3, 4, 5, 8, 7, 6, 9, 2 });
		System.out.print("가장 큰 값은 " + result + " 입니다.");
		System.out.println();
	}

	public static int maxNumArray(int[] numbers) {
		int maxNum = 0;
		for (int i = 0; i < numbers.length; i++)
			if (numbers[i] > maxNum)
				maxNum = numbers[i];
		return maxNum;
	}

}
