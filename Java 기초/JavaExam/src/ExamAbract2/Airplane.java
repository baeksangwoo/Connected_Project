package ExamAbract2;

public class Airplane extends Plane {

	public Airplane()
	{
		
	}
	public Airplane(String planeName, int fuelSize)
	{
		super(planeName, fuelSize);
	}
	
	public void flight(int distance)
	{
		int s=this.getFuelSize();
		s-=distance*3;
		this.setFuelSize(s);
	}
}
