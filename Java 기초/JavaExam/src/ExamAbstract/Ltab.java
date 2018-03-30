package ExamAbstract;

public class Ltab extends Mobile  {
	
	
	
	public Ltab()
	{
		
	}
	
	public Ltab(String mobileName, int batterySize, String osType)
	{
		super(mobileName,batterySize,osType);
	}
	
	public void operate(int time)
	{
		int x=this.getBatterySize();
		
		x=x-time*10;
		this.setBatterySize(x);
	}
	
	public void charge(int time)
	{
		int x=this.getBatterySize();
		x=x+time*10;
		this.setBatterySize(x);
	}
}
