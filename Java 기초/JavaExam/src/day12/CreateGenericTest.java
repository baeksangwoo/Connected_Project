package day12;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
	 
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o2.get(); 
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<String>();		
		o3.put("abc");
		String s3 = o3.get(); 
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();		
		o4.put(new Date());
		Date s4 = o4.get(); 
		System.out.println(s4);	
	}
}
class Value1 {
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}



class Value2 {
	Object obj;
	void put(Object obj){//date 객체를 저장할 수 있다. 변수가 object는 어떤 객체도 전달이 가능하다 배열까지도
		this.obj = obj;
	}
	Object get() {
		return obj;//만약 date객체를 불러온다면 변환을 해야한다. object 자손중에 date를 가져온거다. 부모에서 자식은 명시해야한다.
	} //java 5 generic 이 추가 되었다. <Generic> 
}



//Value3<Card> v = new Value3<Card>();
// Value3<String> v = new Value3<String>();

class Value3<MY> { //<> 안에 들어가는 명칭은 중요하지 않다. 타입파라미터로 적당한 값을 받을 것이다.
	MY obj; //맴버 변수
	void put(MY obj){ //동적으로 바뀐다 어떤 파라메터 값이 들어오는 가에 따라 
		this.obj = obj; //그때 그때 동저그로 정하겠다 데이터 타입을 일반화 시킨다하여 Generic이라 한다.
	}
	MY get() {
		return obj;
	}
}













