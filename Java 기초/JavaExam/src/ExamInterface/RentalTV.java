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
		System.out.printf("대여 TV 채널 %d번의 프로를 플레이 합니다."+"\n",this.getChannel());
	}
	public void rent()
	{
		System.out.printf(" %s모델의 상품을 대여합니다 %d를 지불해주세요."+"\n",this.getModel(),this.getPrice());
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString()
	{
		
		String s="\t대여상품정보: 모델명: "+this.getModel()+"\t 가격:"+this.getPrice()+"\t 크기: "+this.getSize()+"\n";
		return s;
	}
}
