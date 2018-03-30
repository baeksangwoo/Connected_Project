package mobile;

public class Otab extends Mobile {

	Otab(){
		
	}
	Otab(String mobileName,	int batterySize,String osType )
	{
		super(mobileName,batterySize,osType);
	}
	public void operate(int time)
	{
		int battery=super.getBatterySize();
		battery=battery-12*time;
		super.setBatterySize(battery);
	}
	public void charge(int time)
	{
		int battery=super.getBatterySize();
		battery=battery+8*time;
		super.setBatterySize(battery);
	}
}
