package anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SystemEnvironmentPropertySource;

public class UserMain {

	public static void main(String[] args) {
		ApplicationContext factory 
		    = new ClassPathXmlApplicationContext("anno01/bean.xml");
		
		//UserShow ob=factory.getBean("myProcess0", UserShow.class);
		//System.out.println(ob.toString());		
		
		//UserShow ob1=factory.getBean("myProcess2",UserShow.class);
		//System.out.println(ob1.toString());		
		
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
