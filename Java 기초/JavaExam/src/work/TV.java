package work;

public class TV {

	private String model;
	private int size;	
	private int channel;
	
	TV()
	{
		
	}
	TV(String model, int size, int channel)
	{
		this.model=model;
		this.size=size;
		this.channel=channel;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public void channelUp()
	{
		int chanel1=this.getChannel();
		if(chanel1>=10)
		{
			chanel1=1;
		}
		else
		{
		chanel1+=1;
		this.setChannel(chanel1);
		}
	}
	public void channelDown()
	{
		int chanel1=this.getChannel();
		if(chanel1<=1){
			chanel1=10;
			this.setChannel(chanel1);
		}
		else
		{
		chanel1-=1;
		this.setChannel(chanel1);
		}
	}
}
