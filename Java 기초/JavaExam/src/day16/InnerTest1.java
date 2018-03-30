package day16;

class Outer{
	void pr(){
		System.out.println("Outer's pr() Method!!");
		
	}
	class Inner{
		void pr()
		{
			System.out.println("Inner's pr() Method!!");
		}
	}
	static class Static_Inner{ 
		static void pr(){
			System.out.println("Static_Inner's pr() Method!!");
		}
		void er()
		{
			System.out.println("안되안되!");
		}
	}
}


public class InnerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Static_Inner.pr();
		new Outer.Static_Inner().er(); //static이 아니니 new로 객체 생성
		Outer o = new Outer();
		o.pr();
		Outer.Inner i = o.new Inner();
		i.pr();
		
	}

}
