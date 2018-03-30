package work;

public class Cargoplane extends Plane {

	Cargoplane() //this is 생성자 생성자 주소를 가질 수있다.
	{
		
	}
	Cargoplane(String PlaneName,int fuelSize)
	{
		super(PlaneName,fuelSize);
	}
	
	public void flight(int distance)
	{
		int length;
		length=getFuelSize();
		length-=distance*5;
		setFuelSize(length);
	}
}
