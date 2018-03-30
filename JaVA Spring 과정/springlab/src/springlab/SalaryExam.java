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
		
		int grade = factory.getBean("random",Random.class).nextInt(4)+1; //Random.class는 new와 같다.
		
		
		
		SalaryExpr sal;
		
		if(month%2==0){
			sal=(SalaryExpr)factory.getBean("even");
		}
		else{
			sal=(SalaryExpr)factory.getBean("odd");
		}

		System.out.println(month + "월 " + grade + "등급의 월급은 " + sal.getSalary(grade) + "입니다.");
		factory.close();
	}

}
