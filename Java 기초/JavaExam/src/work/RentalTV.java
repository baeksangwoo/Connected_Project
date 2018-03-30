package work;

public class RentalTV extends TV implements Rentable {
	
	private int price;
	
	public RentalTV()
	{
		
	}
	public RentalTV(int price,String model, int size, int channel)
	{
		super(model, size, channel);
		this.price=price;
	}
	public void play()
	{
		System.out.printf("�뿩 TV ä�� %d���� ���θ� �÷��� �մϴ�. \n",getChannel());
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void rent()
	{
		System.out.printf("%s ���� ��ǰ�� �뿩�մϴ�. %,d �� ������ �ּ���. \n",this.getModel(),this.getPrice());	
	}
	public String toString()
	{
		String s="�ǸŻ�ǰ���� : �𵨸�"+"("+ this.getModel() +")"+ ", ����" +"(" +String.format("%,d",getPrice())+"��"+")"+", ũ��"+"("+this.getSize()+")";
		return s;
	}
}
