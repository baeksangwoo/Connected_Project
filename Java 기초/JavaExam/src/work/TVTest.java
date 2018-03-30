package work;

public class TVTest {
	public static void main(String args[]) {
	//	SaleTV, RentalTV 클래스의 객체를 각각 생성한다.
		TV d=new SaleTV(300000,"SALETV-1",40, 1);
		RentalTV s=new RentalTV(100000,"RENTALTV-10",42,1);
		
		d.channelUp();
		d.channelUp();
		// 두번 높임
		
		((RentalTV)s).channelDown();
		((RentalTV)s).channelDown();
		((RentalTV)s).channelDown();
		
		//SaleTV 객체는 채널을 두 개 높인다.
		//RentalTV 객체는 채널을 세 개 내린다.		
		printAllTV(d);
		printAllTV(s);
		printRentalTV(s); 
	//	각 객체에 대하여 printAllTV()을 호출한다.
		//Rentable 타입의 객체인 RentalTV 객체는 printRentalTV() 를 호출한다.
		}
		static void printAllTV(TV tv) {
			System.out.println(tv.toString());
		// 아규먼트로 전달된 객체의 toString() 을 호출하여 각 상품의 정보를 출력한다.
			if(tv instanceof SaleTV)
			{
				((SaleTV)tv).play();
				((SaleTV)tv).sale();
			}
			else
				((RentalTV)tv).play();
		// 아규먼트로 전달된 객체의 play() 를 호출한다.
		// tv 변수에 전달된 객체가 SaleTV 타입이면 sale() 메서드를 호출한다.
		}
		static void printRentalTV(Rentable tv) {
		// 아규먼트로 전달된 Rentable 객체의 rent() 메서드를 호출한다.
			((RentalTV)tv).rent();
		}
}
