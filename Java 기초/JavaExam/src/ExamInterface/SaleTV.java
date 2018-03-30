package ExamInterface;

public class SaleTV extends TV {

	private int price;
	public SaleTV()
	{
		
	}
	public SaleTV(int price,String model, int size ,int channel)
	{
		super(model,size,channel);
		this.price=price;
	}
	
	public void play()
	{
		System.out.printf("�Ǹ� TV ä�� %d���� ���θ� �÷��� �մϴ�."+"\n",this.getChannel());
	}
	public void sale()
	{
		System.out.printf(" %s���� ��ǰ�� �Ǹ��մϴ� %d�� �������ּ���."+"\n",this.getModel(),this.getPrice());
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString()
	{
		String s="\t�ǸŻ�ǰ����: �𵨸�: "+this.getModel()+"\t ����:"+this.getPrice()+"\t ũ��: "+this.getSize()+"\n";
		return s;
	}
}
