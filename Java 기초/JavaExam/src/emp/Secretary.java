package emp;

public class Secretary extends Employee implements Bonus{

	public  Secretary()
	{
		
	}
	public Secretary(String name, int number, String department, int salary)
	{
		super(name, number, department, salary);
	}
	public double tax()
	{
		double tax=this.getSalary();
		this.setSalary((int)tax*9/10); 
		tax=tax/10;
		return tax;
	}
	public void incentive(int pay){
		pay=pay*8/10;
		this.setSalary(getSalary()+pay);		
	}
}
