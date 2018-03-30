package day13;
import java.util.*;

class Person implements Comparable <Person>{
	
	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object obj)
	{
		System.out.println("HI");
		if(obj instanceof Person)
		{
			Person tmp =(Person)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode()+ age;
	}
	public String toString()
	{
		return name+":"+age;
	}
	@Override
	public int compareTo(Person p) {
		int result=-1;
		if(age>p.age)
			result =1;//age가 크면 1이 된다 늦게 출력된다.
		// TODO Auto-generated method stub
		return result;
	}
}
public class HashSetEx {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		TreeSet<Person> set=new TreeSet<Person>();
	//	HashSet<Person> set= new HashSet<Person>();
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		set.add(new Person("Tom",20));
		set.add(new Person("jerry",30));
		set.add(new Person("rrr",20));
		set.add(new Person("Tom",20));
		set.add(new Person("Tom",20));
		set.add(new Person("Tom",20));
		set.add(new Person("Tom",20));
		
		
		//System.out.println(set);//헤쉬는 같은 놈으로 보지 않는다. 저장된 객체에 tostring으로 출력되도록 만듬
		//println toString의 형태로 출력
//		
		Object ary[]=set.toArray();
		for(Object d : ary){
			System.out.print(d+",");
		}
		System.out.println();
			Arrays.sort(ary);
			
		for(Object d :ary)
		{
			System.out.print(d+"\t");
		}
		
//		int[] ary1={10,2,7,15,9,20,3};
//		for(int d : ary1){
//			System.out.print(d+",");
//		}
//		System.out.println();
//			Arrays.sort(ary1);
//			
//		for(int d :ary1)
//		{
//			System.out.print(d+",");
//		}
//		
//		//Person 객체를 동일한 내용으로 간주하지 않는다. 왜? 클래스마다 어떤 값으로 동일한 내용인지 판단하는지 모르기 때문인다.
//		//동일한 이름이 많기때문에 주민등록번호로 혹은 아이디 사번으로 구분하는 것이 다 다르기 때문에
//		//객체마다 동일한 내용이다 아니다하는 기준이 다르다. 
//		//HashSet은 판단을 할때 equals() 와 hashCode()를 호출하여 판단
//		//새로운 객체와 기존의 객체의 처음엔 equals()를 먼저 그다음엔 hashcode()를 호출하여 비교한다.
//		//오브젝에 정의된 equals와 hashcode가 같을 경우는 참조값이 같을때만 동일하다 판단한다.
//		//참조값 = 자신의 주소값
//		//여기서는 new new 하면서 주소를 새로 만든 것이다.
//		Person p1 =new Person("듀크", 22);
//		Person p2 =new Person("듀크", 22);
//		Person p3 =new Person("턱시", 32);
//		
//		
//		System.out.println(p1.equals(p2));//p1을 기준으로 하여 아규먼트로 전달된 p2의 Person형을 비교
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p1.equals(new java.util.Date()));
//		System.out.println(p3.hashCode());
//		System.out.println(p1.equals(p3));//p1을 기준으로 하여 아규먼트로 전달된 p2의 Person형을 비교
//		Person p4 = p1;
//		System.out.println(p1.equals(p4));
//		//참조값이 같아야지 동일 객채
	}
}
