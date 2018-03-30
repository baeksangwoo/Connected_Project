package ExamAbract2;

public class CargoPlane extends Plane {

	public CargoPlane()
	{
		
	}
	public CargoPlane(String planeName, int fuelSize)
	{
		super(planeName, fuelSize);
	}
	
	public void flight(int distance)
	{
		int s=this.getFuelSize();
		s-=distance*5;
		this.setFuelSize(s);
	}
	
}
