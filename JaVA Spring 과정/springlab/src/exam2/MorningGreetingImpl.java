package exam2;

import org.springframework.stereotype.Component;

@Component("morning")   
public class MorningGreetingImpl implements Greeting {
	@Override
	public void greet(){
		System.out.println("상쾌한 아침되세요!");		
	}

}
