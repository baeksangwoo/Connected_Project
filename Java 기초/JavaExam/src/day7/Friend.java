package day7;

public class Friend extends Person{
	private String phoneNum;
	private String email;
	public Friend(String name,String phoneNum, String email){
		super(name);
		this.phoneNum=phoneNum;
		this.email=email;
	}
	public String getInfo(){
		return super.getInfo()+"\t"+phoneNum+"\t"+email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
 class Person{
	private String name;
	Person(String name){
		this.name=name;
	}
	public String getInfo(){
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
