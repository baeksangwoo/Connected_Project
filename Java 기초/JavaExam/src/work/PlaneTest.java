package work;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Airplane과 Cargoplane 객체 생성
		Plane air =new Airplane("L747", 1000);
		Plane car=new Cargoplane("c40",1000);
		
		// 생성된 객체의 정보 출력
		 printTitle();
		 printInfo(air);
		 printInfo(car);
		// Airplane과 Cargoplane 객체에 100씩 운항 후 객체 정보 출력
		 air.flight(100);
		 car.flight(100);
		System.out.println();
		System.out.println("[100 운항]");
		 printTitle();
		 printInfo(air);
		 printInfo(car);
		 System.out.println();
		// Airplane과 Cargoplane 객체에 200 주유 후 객체 정보 출력
		 air.refuel(200);
		 car.refuel(200);
		System.out.println("[200 주유]");
		 printTitle();
		 printInfo(air);
		 printInfo(car);
		 System.out.println();
	
	}
		public static void printInfo(Plane list) {
		// Plane 객체의 데이터 출력(출력 결과 참조)
			
			System.out.println(list.getPlaneName() +"\t"+ list.getFuelSize());
			
		}
		public static void printTitle() {
		// 타이틀 출력
			
			System.out.println("Plane\tfuelSize");
			System.out.println("----------------------");
		}
}
