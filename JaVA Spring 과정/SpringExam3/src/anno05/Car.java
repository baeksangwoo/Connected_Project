package anno05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("carTire")   //�⺻�� : car
public class Car {
	@Autowired(required=false)
	private Tire tire;

	public Car() {
		super();
	}

	public Car(Tire tire) {
		super();
		this.tire = tire;
	}
	
	public void drive(){
		System.out.println(tire.getBrand() + "�� ������� ���� �ڵ���");
	}
}


