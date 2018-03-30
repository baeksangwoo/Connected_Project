package exam2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		ApplicationContext factory 
		   = new ClassPathXmlApplicationContext("exam2/hi.xml");
	
		String a=LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH")); // 2015-04-18 00:42:24

		int numInt = Integer.parseInt(a);
		
		if(numInt<12)
		{
			Greeting hihi = factory.getBean("morning", MorningGreetingImpl.class);
			hihi.greet();
			
		}
		else if(numInt>=12 && numInt<17)
		{
			Greeting hihi = factory.getBean("afternoon", AfternoonGreetingImpl.class);
			hihi.greet();
		}
		else
		{
			Greeting hihi = factory.getBean("evening", EveningGreetingImpl.class);
			hihi.greet();
		}
		
		((ClassPathXmlApplicationContext) factory).close();
	}

}
