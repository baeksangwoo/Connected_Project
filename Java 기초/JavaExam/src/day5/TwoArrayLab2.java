package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[][] = {
				{'B','C','A','A'},
				{'C','C','B','B'},
				{'D','A','A','D'}
				};
				
		int arr1[] = new int [4];             // 변수명 사용하는것도 이름을 잘 적어서 생각해야 한다.
		arr1 [0] ='a';
	
		int su1=0,su2=0,su3=0,su4= 0;
		
		for(int i=0;i<arr.length;i++){         // length 는 무조건 행의 값을 말한다.
			for(int j=0;j<arr.length+1;j++)
			{
				if (arr[i][j]=='A') {++su1;}
				else if(arr[i][j]=='B') {++su2;}
				else if(arr[i][j]=='C') {++su3;}
				else if (arr[i][j]=='D') {++su4;}
				
			}
			
		}
		
		System.out.println("A는 " + su1 + " 개 입니다.");
		System.out.println("B는 " + su2 + " 개 입니다.");
		System.out.println("C는 " + su3 + " 개 입니다.");
		System.out.println("D는 " + su4 + " 개 입니다.");
				
		
	}

}
