package ExamAbstract;

public class Otab extends Mobile {

	
	
	public Otab()
	{
		
	}
	
	public Otab(String mobileName, int batterySize, String osType)
	{
		super(mobileName,batterySize,osType);
		
	}
	
	public void operate(int time)
	{
		int x=this.getBatterySize();
		x=x-time*12;
		this.setBatterySize(x);
	}
	
	public void charge(int time)
	{
		int x=this.getBatterySize();
		x=x+time*8;
		this.setBatterySize(x);
	}
	
}
