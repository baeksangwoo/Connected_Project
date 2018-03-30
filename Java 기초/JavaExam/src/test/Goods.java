package test;

public class Goods {

	
	String prodId; // ��ǰ ���̵� 
	String prodName; // ��ǰ �̸� 
	int price; // ��ǰ ���� 
	char asYn; // AS ���� ���� 

	// ������ �� ���� �����Ͻÿ�. 
	
	public Goods(String prodId, String proName , int price)
	{
		this.prodId=prodId;
		this.prodName=proName;
		this.price=price;	
		this.asYn='Y';
	}
	public Goods(String prodId, String proName , int price ,char asYn)
	{
		this.prodId=prodId;
		this.prodName=proName;
		this.price=price;
		this.asYn=asYn;
	}

	
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public char getAsYn() {
		return asYn;
	}
	public void setAsYn(char asYn) {
		this.asYn = asYn;
	}
	// getGoodsInfo() �޼��带 �����Ͻÿ�.
	public String getGoodsInfo()
		{
			char whi=this.getAsYn();
			String a;
			if(whi=='N')
			{
				a="�Ұ�";
			}
			else
			{
				a="����";
			}
			int d=this.getPrice();
			String str = String.format("%,d", d);
			
			return "��ǰID:"+this.getProdId()+", ��ǰ��: "+this.getProdName()+", ����: "
					+ ""+str+"��" +", AS���ɿ���: "+a;
			//��ǰID : PRD-0001, ��ǰ�� : ��ũ��ǻ��, ���� : 10,000��, AS���ɿ��� : �Ұ�
		}
}
