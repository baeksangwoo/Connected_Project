package work;

public class Cargoplane extends Plane {

	Cargoplane() //this is ������ ������ �ּҸ� ���� ���ִ�.
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
