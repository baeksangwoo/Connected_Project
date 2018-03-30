package work;

abstract public class Plane {
	private String PlaneName;
	private int fuelSize;
	
	public Plane()
	{
		
	}
	
	public Plane(String PlaneName,int fuelSize)
	{
		this.PlaneName=PlaneName;
		this.fuelSize=fuelSize;
	}

	public String getPlaneName() {
		return PlaneName;
	}

	public void setPlaneName(String planeName) {
		PlaneName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	public void refuel(int fuel)
	{
		this.fuelSize+=fuel;
	}
	abstract public void flight(int distance);
	
}
