package anno01;

public class UserShow {
	private User user;

	public UserShow() {		
		super();
		System.out.println("������ ȣ��(no-args1)");
	}

	public UserShow(User user) {
		super();
		this.user = user;
		System.out.println("������ ȣ��(User-args2)");
	}

	public void setUser(User user) {
		System.out.println("setter ȣ��");
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserShow [user=" + user + "]";
	}

}
