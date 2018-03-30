package work;

public class SaleTV extends TV {
	
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SaleTV()
	{
		
	}
	public SaleTV(int price,String model, int size, int channel)
	{
		super(model, size, channel);
		this.price=price;
	}
	public void play()
	{
		System.out.printf("�Ǹ� TV ä�� %d���� ���θ� �÷��� �մϴ�.\n",getChannel());
	}
	public void sale()
	{
		System.out.printf("%s ���� ��ǰ�� �Ǹ��մϴ�. %,d �� ������ �ּ���. \n",this.getModel(),getPrice());
		
	}
	public String toString()
	{
		String s="�ǸŻ�ǰ���� : �𵨸�"+"("+ this.getModel() +")"+ ", ����" +"(" +String.format("%,d",getPrice())+"��"+")"+", ũ��"+"("+this.getSize()+")";
		return s;
	}
	
}
