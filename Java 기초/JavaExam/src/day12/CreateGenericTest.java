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
	void put(Object obj){//date ��ü�� ������ �� �ִ�. ������ object�� � ��ü�� ������ �����ϴ� �迭������
		this.obj = obj;
	}
	Object get() {
		return obj;//���� date��ü�� �ҷ��´ٸ� ��ȯ�� �ؾ��Ѵ�. object �ڼ��߿� date�� �����°Ŵ�. �θ𿡼� �ڽ��� ����ؾ��Ѵ�.
	} //java 5 generic �� �߰� �Ǿ���. <Generic> 
}



//Value3<Card> v = new Value3<Card>();
// Value3<String> v = new Value3<String>();

class Value3<MY> { //<> �ȿ� ���� ��Ī�� �߿����� �ʴ�. Ÿ���Ķ���ͷ� ������ ���� ���� ���̴�.
	MY obj; //�ɹ� ����
	void put(MY obj){ //�������� �ٲ�� � �Ķ���� ���� ������ ���� ���� 
		this.obj = obj; //�׶� �׶� �����׷� ���ϰڴ� ������ Ÿ���� �Ϲ�ȭ ��Ų���Ͽ� Generic�̶� �Ѵ�.
	}
	MY get() {
		return obj;
	}
}













