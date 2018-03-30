package test;

public class Goods {

	
	String prodId; // 상품 아이디 
	String prodName; // 상품 이름 
	int price; // 상품 가격 
	char asYn; // AS 가능 여부 

	// 생성자 두 개를 구현하시오. 
	
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
	// getGoodsInfo() 메서드를 구현하시오.
	public String getGoodsInfo()
		{
			char whi=this.getAsYn();
			String a;
			if(whi=='N')
			{
				a="불가";
			}
			else
			{
				a="가능";
			}
			int d=this.getPrice();
			String str = String.format("%,d", d);
			
			return "상품ID:"+this.getProdId()+", 상품명: "+this.getProdName()+", 가격: "
					+ ""+str+"원" +", AS가능여부: "+a;
			//상품ID : PRD-0001, 상품명 : 듀크컴퓨터, 가격 : 10,000원, AS가능여부 : 불가
		}
}
