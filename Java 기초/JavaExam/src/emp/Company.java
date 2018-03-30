package emp;

import work.SaleTV;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Employee 배열에 객체들을 생성하여 저장한다.
		Employee a[]=new Employee[2];
		a[0]=new Secretary("Duke",1,"secretary",800);
		a[1]=new Sales("Tuxi",2,"sales",1200);
		
		printEmployee(a,false);
		
		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
		// 이 때는 세금을 출력하지 않는다.
		((Bonus)a[0]).incentive(100);
		
		//((Secretary)a[0]).incentive(100);
		((Sales)a[1]).incentive(100);
		
		System.out.println("");
		System.out.println("인센티브 100지급");
		System.out.println("");
		printEmployee(a,true);
		// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은
		// 다르다.
		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보
		// 와 세금을 출력한다.
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
		// 객체의 정보를 출력한다.
		// isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
		}
}
