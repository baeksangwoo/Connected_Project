package mobile;

public class Ltab extends Mobile {

	Ltab(){
		
	}
	Ltab(String mobileName,	int batterySize,String osType )
	{
		super(mobileName,batterySize,osType);
	}
	public void operate(int time)
	{
		int battery=super.getBatterySize();
		battery=battery-10*time;
		super.setBatterySize(battery);
	}
	public void charge(int time)
	{
		int battery=super.getBatterySize();
		battery=battery+10*time;
		super.setBatterySize(battery);
	}
}
