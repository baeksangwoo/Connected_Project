package day9;

public class PolyTest {

	public static void main(String[] args) {

		printObjectInfo(new Object());
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new char[5]);
		printObjectInfo(new Integer(100));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new day6.Student());
		printObjectInfo(1000);
		printObjectInfo(2.12);
	}
	public static void printObjectInfo(Object o){
		//다형성?!
		// 어떤 객체냐에 따라 자손의 객체를 이용할 수 있다.
		//object의 의미 어떤 객채라도 와도 좋다!@
		//배열도 자바는 객체다
		//조상 유형의 자손도 참조할 수 있따.
		if(o instanceof String)
		{
			System.out.println("문자열 객체: "+
					o.toString()+"("+((String)o).length()+")");
		}
		else{
		System.out.println("전달된 객체의 클래스 명: "+
							o.getClass().getName());
		}
	
	}
}
