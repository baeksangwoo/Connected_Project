package day16;

class LocalTest{
	String name = "java";
	void pr(final String s){
		final int su =100;
		int num =1000;
		System.out.println(s+":"+su);
		class Local{    //로컬 클래스로 쓰이는 지역변수는 fianl로 설정한다.
			void pr(String Is){
				System.out.println("s: "+s);
				System.out.println("Is: "+Is);
				System.out.println(name);
				System.out.println(su);
			}
		}
	Local It=new Local();
	It.pr("Local Test");
	}
	
}


public class InnerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTest i = new LocalTest();
		i.pr("main call");
	}

}
