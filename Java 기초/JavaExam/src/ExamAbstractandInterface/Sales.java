package ExamAbstractandInterface;

public class Sales extends Employee implements Bonus {

	public Sales()
	{
		
	}
	
	public Sales(String name, int number, String department , int salary)
	{
		super(name, number, department ,salary);
	}
	
	public double tax()
	{
		int s = this.getSalary();
		double d=s*0.13;
		s=(int)(s*0.87);
		this.setSalary(s);
		
		return d;
	}
	public void incentive(int pay)
	{
		int s =this.getSalary();
		s+=(int)(pay*1.2);
		this.setSalary(s);
	}
	
}
