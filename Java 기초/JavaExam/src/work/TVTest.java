package work;

public class TVTest {
	public static void main(String args[]) {
	//	SaleTV, RentalTV Ŭ������ ��ü�� ���� �����Ѵ�.
		TV d=new SaleTV(300000,"SALETV-1",40, 1);
		RentalTV s=new RentalTV(100000,"RENTALTV-10",42,1);
		
		d.channelUp();
		d.channelUp();
		// �ι� ����
		
		((RentalTV)s).channelDown();
		((RentalTV)s).channelDown();
		((RentalTV)s).channelDown();
		
		//SaleTV ��ü�� ä���� �� �� ���δ�.
		//RentalTV ��ü�� ä���� �� �� ������.		
		printAllTV(d);
		printAllTV(s);
		printRentalTV(s); 
	//	�� ��ü�� ���Ͽ� printAllTV()�� ȣ���Ѵ�.
		//Rentable Ÿ���� ��ü�� RentalTV ��ü�� printRentalTV() �� ȣ���Ѵ�.
		}
		static void printAllTV(TV tv) {
			System.out.println(tv.toString());
		// �ƱԸ�Ʈ�� ���޵� ��ü�� toString() �� ȣ���Ͽ� �� ��ǰ�� ������ ����Ѵ�.
			if(tv instanceof SaleTV)
			{
				((SaleTV)tv).play();
				((SaleTV)tv).sale();
			}
			else
				((RentalTV)tv).play();
		// �ƱԸ�Ʈ�� ���޵� ��ü�� play() �� ȣ���Ѵ�.
		// tv ������ ���޵� ��ü�� SaleTV Ÿ���̸� sale() �޼��带 ȣ���Ѵ�.
		}
		static void printRentalTV(Rentable tv) {
		// �ƱԸ�Ʈ�� ���޵� Rentable ��ü�� rent() �޼��带 ȣ���Ѵ�.
			((RentalTV)tv).rent();
		}
}
