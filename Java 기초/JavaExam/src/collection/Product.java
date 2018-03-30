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
	
	//������ ������ ���������� ������ �� �� �ְ� ����� �߰��Ѵ�.
	//Comparable �� �߰� ����Ѵ�.
	//compareTo() �޼ҵ带 �������̵��Ѵ�.
	@Override
	public int compareTo(Product p) {
		
		int result=0;
		if(productPrice>p.productPrice)
			result =0;//age�� ũ�� 1�� �ȴ� �ʰ� ��µȴ�.
		
		else if(productPrice<p.productPrice)
			result=1;
	
		// TODO Auto-generated method stub
		return result;
		// TODO Auto-generated method stub
	}
	

}
