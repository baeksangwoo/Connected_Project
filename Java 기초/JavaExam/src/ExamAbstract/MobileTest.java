package ExamAbstract;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile[] a =new Mobile[2];
		a[0]=new Ltab("Ltab",500 ,"ABC-01");
		a[1]=new Otab("Otab",1000, "XYZ-20");
		// CHECK POINT 배열을 만들지도 못했다.
		// 채워 넣지도 못했다.
		
		printMoblie(a);
		a[0].charge(10);
		a[1].charge(10);
		printMoblie(a);
		//Mobile a[] =new Mobile("Ltab",500 ,"ABC-01");
		a[0].operate(5);
		a[1].operate(5);
		printMoblie(a);
	}
	

	public static void printMoblie(Mobile[] mobile)
	{
		System.out.println("Mobile\tBattery\tOS");
		for(Mobile a : mobile)
		{
			System.out.println(a.getMobileName() +"\t"+a.getBatterySize()+"\t" +a.getOsType());
		}
	}
	
	public static void printTitle(){
		
	}
}
