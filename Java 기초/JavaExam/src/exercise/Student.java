package exercise;

public class Student extends Human {

	
	private String number;
	private String major;
	
	 Student()
	{
		
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	Student(String name, int age , int height ,int weight, String number, String major)
	{
			super(name,age,height,weight);
			this.number=number;
			this.major=major;	
	}
	
	 public String printInformation()
	{	
		String Jump2;
		Jump2=super.printInformation()+number+major;
		return Jump2;
	}
	
}
