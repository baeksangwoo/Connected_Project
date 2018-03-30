package springlab;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SalaryExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("springlab/salary.xml");
		
		Random ran=(java.util.Random)factory.getBean("random");
		
		int month = ran.nextInt(12)+1;
		
		int grade = factory.getBean("random",Random.class).nextInt(4)+1; //Random.class�� new�� ����.
		
		
		
		SalaryExpr sal;
		
		if(month%2==0){
			sal=(SalaryExpr)factory.getBean("even");
		}
		else{
			sal=(SalaryExpr)factory.getBean("odd");
		}

		System.out.println(month + "�� " + grade + "����� ������ " + sal.getSalary(grade) + "�Դϴ�.");
		factory.close();
	}

}
