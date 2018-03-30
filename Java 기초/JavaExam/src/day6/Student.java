package day6;

import java.io.Serializable;
public class Student implements Serializable { //접근 제어자가 없다 즉 같은 페키지 안에서 사용가능 
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
		System.out.println(name + "가" + project + "를 학습합니다.");
	}

	public void studentInfo() {
		System.out.println(name + ":" + age);
	}
}
