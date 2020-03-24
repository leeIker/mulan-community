package huijingyuan.mulan.model;

public class User {
	private int id;
	private String user_name;
	private String user_password;
	private String user_token;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_token() {
		return user_token;
	}
	public void setUser_token(String user_token) {
		this.user_token = user_token;
	}
	public User(int id, String user_name, String user_password, String user_token) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_token = user_token;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_name=" + user_name + ", user_password=" + user_password + ", user_token="
				+ user_token + "]";
	}
	
}
