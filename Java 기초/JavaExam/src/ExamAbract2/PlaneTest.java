package ExamAbract2;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane a =new Airplane("L747",1000);
		CargoPlane b= new CargoPlane("C40",1000);
		printInfo(a);
		printInfo(b);
		a.flight(100);
		b.flight(100);
		printInfo(a);
		printInfo(b);
		
		a.refuel(200);
		b.refuel(200);
		
		printInfo(a);
		printInfo(b);
		
		
	}

	public static void printInfo(Plane list)
	{
		System.out.println("\tPlane\tfuelSize");
		System.out.println("--------------------------");
		System.out.println("\t"+list.getPlaneName()+"\t"+ list.getFuelSize());
		
	}
	public static void pritTitle(){
		
	}
	
}
