package work;

public class Airplane extends Plane{

	Airplane()
	{
		
	}
	Airplane(String PlaneName,int fuelSize)
	{
		super(PlaneName,fuelSize);
		
	}
	
	public void flight(int distance)
	{
		int length;
		length=getFuelSize();//super.getFuelSize();
		length-=distance*3;
		setFuelSize(length);
	}
}
