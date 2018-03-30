package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
	
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},  // 0,0 -- 0,5
				{ 'R', 'X', 'X', 'X', 'X', 'X'},  // 1,0 -- 1,5  
				{ 'X', 'X', 'R', 'X', 'X', 'X'},  // 2,0 -- 2,5
				{ 'R', 'X', 'X', 'F', 'X', 'X'},  // 3,0 -- 3,5
				{ 'X', 'R', 'X', 'X', 'X', 'X'},  // 4,0 -- 4,5     // 왼쪽 대각선은 a,b 를 뺀 값이 같다.
				{ 'X', 'R', 'X', 'R', 'X', 'R'},  // 5,0 -- 5,5     // 오른쪽 대각선은 a,b 더한 값이 같음
				};
		 	
		 /* R은 토끼이고 F는 여우다
		 * 여우는 여우가 존재하는 위치에서 대각선과 
		 * 직선으로만 이동 가능하다. 
		 * 위와 같은 2차원 배열 데이터에서
		 * 토끼를 몇마리 잡겠는가?
		 */
		
		int catchNum = 0;
		
		int rows=0, cols = 0;   //rows는 3, 3 
		int sum=0, dif= 0;
		
		
		a:for (int i =0; i<play.length; i++)
		{
			for(int j =0; j<play.length; j++)
			{ 
				if(play[i][j]=='F')   //여우를 찾는다
				{
					rows = i ; cols = j;
					sum = i+j;
					dif = i-j;
				
					System.out.println("여우의 위치 : " + rows + ", "+ cols);
					
					break a;
				}
				
			}
			
		}
				
				for (int i = 0; i<play[rows].length; i++)
				{
					if(play[rows][i]=='R') {catchNum++;}  //행이동						
				} 
				for (int j = 0; j<play[cols].length; j++)
				{
					if(play[j][cols]=='R') {catchNum++;}   //열이동 						
				}
				
				for (int i=0; i<play.length; i++)
				{
					for (int j=0; j<play[i].length; j++)
					{
						if((i+j==sum)||(i-j==dif) && (play[i][j]=='R')) {catchNum++;}
					}
				}
				
		System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);		
	}
}


