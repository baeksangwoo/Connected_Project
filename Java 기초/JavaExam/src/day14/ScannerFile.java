package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("C:/iotest/data.txt"));
		int sum=0;
		int cnt =0;
		while(sc.hasNextInt())
		{
			sum+=sc.nextInt();
			cnt++;
		}
		System.out.println("sum="+sum);
		System.out.println("cnt="+cnt);
		System.out.printf("average=%.2f", (double)sum/cnt);
	}

}
