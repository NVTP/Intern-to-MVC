package th.ac.sau.models;

public class User {
	private String username;
	private String password;
	
	public Boolean login(String username, String password) {
		if(username.equals("root")
				&& password.equals("1234")) 
			return true;
		else
			return false;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
