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
		System.out.printf("대여 TV 채널 %d번의 프로를 플레이 합니다. \n",getChannel());
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void rent()
	{
		System.out.printf("%s 모델의 상품을 대여합니다. %,d 을 지불해 주세요. \n",this.getModel(),this.getPrice());	
	}
	public String toString()
	{
		String s="판매상품정보 : 모델명"+"("+ this.getModel() +")"+ ", 가격" +"(" +String.format("%,d",getPrice())+"원"+")"+", 크기"+"("+this.getSize()+")";
		return s;
	}
}
