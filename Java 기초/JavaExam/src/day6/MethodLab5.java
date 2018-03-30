package day6;

public class MethodLab5 {

	public static void main(String[] args) {
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4);
		MethodTest5.printNumbers(r1);
		MethodTest5.printNumbers(r2);
		MethodTest5.printNumbers(r3);

	}

	public static int[] powerArray(int multiple) {
		int nature[] = new int[10];
		for (int i = 0; i < 10; i++)
			nature[i] = (i + 1) * multiple;
		return nature;
	}

}
