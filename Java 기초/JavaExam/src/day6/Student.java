package day6;

import java.io.Serializable;
public class Student implements Serializable { //���� �����ڰ� ���� �� ���� ��Ű�� �ȿ��� ��밡�� 
	String name;
	int age;
	String project;

	public Student(String name, int age, String project) {
		super();
		this.name = name;
		this.age = age;
		this.project = project;
	}

	public Student() {
		super();
	}
	public void study() {
		System.out.println(name + "��" + project + "�� �н��մϴ�.");
	}

	public void studentInfo() {
		System.out.println(name + ":" + age);
	}
}
