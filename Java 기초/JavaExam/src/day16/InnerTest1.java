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
			System.out.println("�ȵǾȵ�!");
		}
	}
}


public class InnerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Static_Inner.pr();
		new Outer.Static_Inner().er(); //static�� �ƴϴ� new�� ��ü ����
		Outer o = new Outer();
		o.pr();
		Outer.Inner i = o.new Inner();
		i.pr();
		
	}

}
