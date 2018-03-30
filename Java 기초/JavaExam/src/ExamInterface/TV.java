package ExamInterface;

public class TV {
	private String model;
	private int channel;
	private int size;
	
	public TV()
	{
		
	}
	public TV(String model, int size ,int channel)
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
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void channelUp()
	{
		int a =this.getChannel();
		a++;
		this.setChannel(a);
		
	}
	public void channelDown()
	{
		int a =this.getChannel();
		a--;
		this.setChannel(a);
	}
	
	
}
