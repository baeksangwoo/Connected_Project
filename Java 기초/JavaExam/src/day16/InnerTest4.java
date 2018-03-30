package day16;

interface Testable{ //인터페이스는 able을 뒤에 붙인다.
	final static String fs= "Interface Test";
			abstract void output(String s);
}


public class InnerTest4 {

	void pr(Testable o){
		o.output("Test");
		System.out.println(Testable.fs);
	}
	public static void main(String[] args) {
	System.out.println("Main Start!!@");
	InnerTest4 n = new InnerTest4();
	
	n.pr(new Testable(){	
		int su =100;
		public void output(String s){
			System.out.println("AnonyMous Class : "+s);
			System.out.println("Anonymous Class : "+su);
		}
	});
	
	}
	
	
}
