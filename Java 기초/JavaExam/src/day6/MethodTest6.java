package day6;

import day5.MethodLab3;

public class MethodTest6 {

	public static void main(String[] args) {
		int[] ary = { 1, 2, 3, 4, 5 };
		System.out.println(ary);
		MethodTest5.printNumbers(ary);
		updateArray(ary);
		MethodTest5.printNumbers(ary);

	}

	public static void updateArray(int[] ary) {
		System.out.println(ary);
		for (int i = 0; i < ary.length; i++)
			ary[i] *= 10;
	}

	public static void printNumbers(int nums[]) {
		if (nums.length == 0) {
			System.out.println("���Ұ� ��������!!");
			return;
		}
		for (int num : nums)
			System.out.print(num + " ");
		System.out.println();
		// return; ������ ���� �̹Ƿ� �Ǹ����� return���� ��������
	}

}
