package ExamInterface;

public class RentalTV extends TV implements Rentable  {
	
	private int price;
	public RentalTV()
	{
		
	}
	public RentalTV(int price ,String model, int size ,int channel)
	{
		super(model,size,channel);
		this.price=price;
	}
	
	public void play()
	{
		System.out.printf("�뿩 TV ä�� %d���� ���θ� �÷��� �մϴ�."+"\n",this.getChannel());
	}
	public void rent()
	{
		System.out.printf(" %s���� ��ǰ�� �뿩�մϴ� %d�� �������ּ���."+"\n",this.getModel(),this.getPrice());
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString()
	{
		
		String s="\t�뿩��ǰ����: �𵨸�: "+this.getModel()+"\t ����:"+this.getPrice()+"\t ũ��: "+this.getSize()+"\n";
		return s;
	}
}
