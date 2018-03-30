package day1;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char name1 = '조';
		char name2 = '규';
		char name3 = '석';
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
		
		// System.out.println(name1+name2+name3); 은 문자열이 아닌 코드 값으로 연산됨.
		
		System.out.println(""+name1+name2+name3);  // ""라는 null 값을 주면 문자열로 결합이 된다.
				
	}

}
