package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
	
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},  // 0,0 -- 0,5
				{ 'R', 'X', 'X', 'X', 'X', 'X'},  // 1,0 -- 1,5  
				{ 'X', 'X', 'R', 'X', 'X', 'X'},  // 2,0 -- 2,5
				{ 'R', 'X', 'X', 'F', 'X', 'X'},  // 3,0 -- 3,5
				{ 'X', 'R', 'X', 'X', 'X', 'X'},  // 4,0 -- 4,5     // ���� �밢���� a,b �� �� ���� ����.
				{ 'X', 'R', 'X', 'R', 'X', 'R'},  // 5,0 -- 5,5     // ������ �밢���� a,b ���� ���� ����
				};
		 	
		 /* R�� �䳢�̰� F�� �����
		 * ����� ���찡 �����ϴ� ��ġ���� �밢���� 
		 * �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		
		int catchNum = 0;
		
		int rows=0, cols = 0;   //rows�� 3, 3 
		int sum=0, dif= 0;
		
		
		a:for (int i =0; i<play.length; i++)
		{
			for(int j =0; j<play.length; j++)
			{ 
				if(play[i][j]=='F')   //���츦 ã�´�
				{
					rows = i ; cols = j;
					sum = i+j;
					dif = i-j;
				
					System.out.println("������ ��ġ : " + rows + ", "+ cols);
					
					break a;
				}
				
			}
			
		}
				
				for (int i = 0; i<play[rows].length; i++)
				{
					if(play[rows][i]=='R') {catchNum++;}  //���̵�						
				} 
				for (int j = 0; j<play[cols].length; j++)
				{
					if(play[j][cols]=='R') {catchNum++;}   //���̵� 						
				}
				
				for (int i=0; i<play.length; i++)
				{
					for (int j=0; j<play[i].length; j++)
					{
						if((i+j==sum)||(i-j==dif) && (play[i][j]=='R')) {catchNum++;}
					}
				}
				
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}


