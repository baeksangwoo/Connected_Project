package collection;

public class Product implements Comparable<Product> {

	private String productID;
	private String productName;
	private int productPrice;

	public Product(String productID,String productName, int productPrice)
	{
		this.productID=productID;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Product)
		{
			Product tmp =(Product)obj;
			return productID.equals(tmp.productID);
		}
		return false;
	}
	public int hashCode()
	{
		return productID.hashCode();
	}
	public String toString()
	{
		return productID+"\t"+productName+"\t"+productPrice;
	}
	
	//가격을 가지고 내림차순의 정렬을 할 수 있게 기능을 추가한다.
	//Comparable 을 추가 상속한다.
	//compareTo() 메소드를 오버라이딩한다.
	@Override
	public int compareTo(Product p) {
		
		int result=0;
		if(productPrice>p.productPrice)
			result =0;//age가 크면 1이 된다 늦게 출력된다.
		
		else if(productPrice<p.productPrice)
			result=1;
	
		// TODO Auto-generated method stub
		return result;
		// TODO Auto-generated method stub
	}
	

}
