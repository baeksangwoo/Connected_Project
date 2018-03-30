package work;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Airplane�� Cargoplane ��ü ����
		Plane air =new Airplane("L747", 1000);
		Plane car=new Cargoplane("c40",1000);
		
		// ������ ��ü�� ���� ���
		 printTitle();
		 printInfo(air);
		 printInfo(car);
		// Airplane�� Cargoplane ��ü�� 100�� ���� �� ��ü ���� ���
		 air.flight(100);
		 car.flight(100);
		System.out.println();
		System.out.println("[100 ����]");
		 printTitle();
		 printInfo(air);
		 printInfo(car);
		 System.out.println();
		// Airplane�� Cargoplane ��ü�� 200 ���� �� ��ü ���� ���
		 air.refuel(200);
		 car.refuel(200);
		System.out.println("[200 ����]");
		 printTitle();
		 printInfo(air);
		 printInfo(car);
		 System.out.println();
	
	}
		public static void printInfo(Plane list) {
		// Plane ��ü�� ������ ���(��� ��� ����)
			
			System.out.println(list.getPlaneName() +"\t"+ list.getFuelSize());
			
		}
		public static void printTitle() {
		// Ÿ��Ʋ ���
			
			System.out.println("Plane\tfuelSize");
			System.out.println("----------------------");
		}
}
