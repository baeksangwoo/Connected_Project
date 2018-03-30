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
			result =1;//age�� ũ�� 1�� �ȴ� �ʰ� ��µȴ�.
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
		
		
		//System.out.println(set);//�콬�� ���� ������ ���� �ʴ´�. ����� ��ü�� tostring���� ��µǵ��� ����
		//println toString�� ���·� ���
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
//		//Person ��ü�� ������ �������� �������� �ʴ´�. ��? Ŭ�������� � ������ ������ �������� �Ǵ��ϴ��� �𸣱� �����δ�.
//		//������ �̸��� ���⶧���� �ֹε�Ϲ�ȣ�� Ȥ�� ���̵� ������� �����ϴ� ���� �� �ٸ��� ������
//		//��ü���� ������ �����̴� �ƴϴ��ϴ� ������ �ٸ���. 
//		//HashSet�� �Ǵ��� �Ҷ� equals() �� hashCode()�� ȣ���Ͽ� �Ǵ�
//		//���ο� ��ü�� ������ ��ü�� ó���� equals()�� ���� �״����� hashcode()�� ȣ���Ͽ� ���Ѵ�.
//		//�������� ���ǵ� equals�� hashcode�� ���� ���� �������� �������� �����ϴ� �Ǵ��Ѵ�.
//		//������ = �ڽ��� �ּҰ�
//		//���⼭�� new new �ϸ鼭 �ּҸ� ���� ���� ���̴�.
//		Person p1 =new Person("��ũ", 22);
//		Person p2 =new Person("��ũ", 22);
//		Person p3 =new Person("�ν�", 32);
//		
//		
//		System.out.println(p1.equals(p2));//p1�� �������� �Ͽ� �ƱԸ�Ʈ�� ���޵� p2�� Person���� ��
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p1.equals(new java.util.Date()));
//		System.out.println(p3.hashCode());
//		System.out.println(p1.equals(p3));//p1�� �������� �Ͽ� �ƱԸ�Ʈ�� ���޵� p2�� Person���� ��
//		Person p4 = p1;
//		System.out.println(p1.equals(p4));
//		//�������� ���ƾ��� ���� ��ä
	}
}
