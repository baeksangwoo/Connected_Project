package emp;

import work.SaleTV;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee �迭�� ��ü���� �����Ͽ� �����Ѵ�.
		Employee a[]=new Employee[2];
		a[0]=new Secretary("Duke",1,"secretary",800);
		a[1]=new Sales("Tuxi",2,"sales",1200);
		
		printEmployee(a,false);
		
		// printEmployee() �޼��带 ȣ���Ͽ� Employee �迭�� ��ü�� ������ ����Ѵ�.
		// �� ���� ������ ������� �ʴ´�.
		((Bonus)a[0]).incentive(100);
		
		//((Secretary)a[0]).incentive(100);
		((Sales)a[1]).incentive(100);
		
		System.out.println("");
		System.out.println("�μ�Ƽ�� 100����");
		System.out.println("");
		printEmployee(a,true);
		// ��� �������� �μ�Ƽ��� 100�� �����Ѵ�.(������ ���� ����Ǵ� �μ�Ƽ�� �ݾ���
		// �ٸ���.
		// printEmployee() �޼��带 ȣ���Ͽ� Employee �迭�� ��ü�� ����
		// �� ������ ����Ѵ�.
		}
		public static void printEmployee(Employee[] emp, boolean isTax) {
			if(isTax==false){
			System.out.println("name\t\tdepartment\t\tsalary");
			System.out.println("-----------------------------------------------");
			System.out.println(emp[0].getName()+"\t\t"+emp[0].getDepartment()+"\t\t"+emp[0].getSalary());
			System.out.println(emp[1].getName()+"\t\t"+emp[1].getDepartment()+"\t\t\t"+emp[1].getSalary());
			}
			else
			{
				System.out.println("name\t\tdepartment\t\tsalary\t\ttax");
				System.out.println("-----------------------------------------------");
				System.out.println(emp[0].getName()+"\t\t"+emp[0].getDepartment()+"\t\t"+emp[0].getSalary()+"\t\t"+((Secretary)emp[0]).tax());
				System.out.println(emp[1].getName()+"\t\t"+emp[1].getDepartment()+"\t\t\t"+emp[1].getSalary()+"\t\t"+((Sales)emp[1]).tax());
			}
		// ��ü�� ������ ����Ѵ�.
		// isTax �� ��/���� ���ο� ���� �ؽ� ��� ���θ� �����Ͽ� ó���Ѵ�.
		}
}
