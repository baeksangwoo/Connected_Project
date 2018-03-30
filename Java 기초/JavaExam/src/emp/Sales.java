package emp;

public class Sales extends Employee implements Bonus{

	public Sales()
	{
		
	}
	public Sales(String name, int number, String department, int salary)
	{
		super(name, number, department, salary);
	}
	public double tax()
	{
		double tax=this.getSalary();
		this.setSalary((int)tax*87/100); 
		tax=tax*13/100;
		return tax;
	}
	public void incentive(int pay){
		pay=pay*12/10;
		
		this.setSalary(getSalary()+pay);		
	}
}
