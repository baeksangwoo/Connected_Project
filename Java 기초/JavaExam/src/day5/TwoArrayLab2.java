package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arr[][] = {
				{'B','C','A','A'},
				{'C','C','B','B'},
				{'D','A','A','D'}
				};
				
		int arr1[] = new int [4];             // ������ ����ϴ°͵� �̸��� �� ��� �����ؾ� �Ѵ�.
		arr1 [0] ='a';
	
		int su1=0,su2=0,su3=0,su4= 0;
		
		for(int i=0;i<arr.length;i++){         // length �� ������ ���� ���� ���Ѵ�.
			for(int j=0;j<arr.length+1;j++)
			{
				if (arr[i][j]=='A') {++su1;}
				else if(arr[i][j]=='B') {++su2;}
				else if(arr[i][j]=='C') {++su3;}
				else if (arr[i][j]=='D') {++su4;}
				
			}
			
		}
		
		System.out.println("A�� " + su1 + " �� �Դϴ�.");
		System.out.println("B�� " + su2 + " �� �Դϴ�.");
		System.out.println("C�� " + su3 + " �� �Դϴ�.");
		System.out.println("D�� " + su4 + " �� �Դϴ�.");
				
		
	}

}
