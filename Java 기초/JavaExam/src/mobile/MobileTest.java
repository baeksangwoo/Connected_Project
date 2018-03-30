package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile p[]=new Mobile[2];
		p[0]=new Ltab("Ltab",500, "ABC-01");
		p[1]=new Otab("Otab",1000,"XYZ-20");
		printTitle();
		printMobile(p); //호출
		p[0].charge(10);
		p[1].charge(10);
		System.out.println("[ 10분 충전 ]");
		printTitle();
		printMobile(p);
		p[0].operate(10);
		p[1].operate(10);
		System.out.println("[ 5분 통화 ]");
		printTitle();
		printMobile(p);
	}
	public static void printMobile(Mobile[] mobile) {
		for(Mobile st: mobile)
		System.out.println(st.getMobileName() +"\t"+ st.getBatterySize() +"\t"+ st.getOsType());
	}
	public static void printTitle() {
		System.out.println("Mobile \t Battery \t os ");
		System.out.println("------------------------");
	}

}
