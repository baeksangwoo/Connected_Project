package springlab;

public class SalaryExpr {
	int bonus;
	SalaryExpr() {
		this(0);
		//this.bonus=0;
		//this(0)는 대입을 하지 않겠다는 말이 된다.
		
	}
	SalaryExpr(int bonus) {
		this.bonus = bonus;
	}
	int getSalary(int grade) {
		int salary = 0;
		switch (grade) {
		case 1:
			salary = bonus + 100;
			break;
		case 2:
			salary = bonus + 90;
			break;
		case 3:
			salary = bonus + 80;
			break;
		case 4:
			salary = bonus + 70;
			break;
		default:
			salary = bonus;			
		}
		return salary;
	}
}
