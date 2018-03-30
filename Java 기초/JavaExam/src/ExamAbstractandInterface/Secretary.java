package ExamAbstractandInterface;

public class Secretary extends Employee implements Bonus {

	public Secretary()
	{
		
	}
	
	public Secretary(String name, int number, String department , int salary)
	{
		super(name, number, department ,salary);
	}
	
	public double tax()
	{
		
		int s = this.getSalary();
		double d=s*0.1;
		s=(int)(s*0.9);
		this.setSalary(s);
		
		return d;
	}
	public void incentive(int pay)
	{
		int s =this.getSalary();
		s+=(int)(pay*0.8);
		this.setSalary(s);
	}
}
