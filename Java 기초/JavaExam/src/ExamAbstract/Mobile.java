package ExamAbstract;

public abstract  class  Mobile  {
	
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile(){
		
	}
	
	public Mobile(String mobileName, int batterySize, String osType)
	{
		this.mobileName=mobileName;
		this.batterySize=batterySize;
		this.osType=osType;
	}

	abstract public void operate(int time);
	abstract public void charge(int time);

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
	
}
