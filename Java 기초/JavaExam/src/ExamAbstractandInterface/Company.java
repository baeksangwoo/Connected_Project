package ExamAbstractandInterface;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee [] a= new Employee[2];
		a[0]=new Secretary("DUKE",1,"secrtary",800);
		a[1]=new Sales("Tuxi",2,"sales",1200);
		
		printEmployee(a,false);
		((Secretary)a[0]).incentive(100);
		((Sales)a[1]).incentive(100);
		
		printEmployee(a,true);
	}
	public static void printEmployee(Employee[] emp , boolean isTax)
	{
		if(isTax==false)
		{
			for(Employee e : emp)
			{
				System.out.println(e.getName()+ "\t"+e.getDepartment()+ "\t"+e.getSalary());
			}
			
		}
		else
		{
			for(Employee e : emp)
			{
				System.out.println(e.getName()+ "\t"+e.getDepartment()+ "\t"+e.getSalary()+"\t"+e.tax());
			}
			
		}
	}

}
