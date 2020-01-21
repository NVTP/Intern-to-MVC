package th.ac.sau.views;

import th.ac.sau.controllers.LoginController;
import th.ac.sau.models.User;

public class LoginView implements ClickListener{
	private TextBox username;
	private TextBox password;
	private Button btnLogin;
	private User user;
	
	public void getView() {
		System.out.println(" 1. Create Login Screen");
		username = new TextBox("username");
		password = new TextBox("password");
		btnLogin = new Button("Login");
		
	}
	
	public void setView() {
		System.out.println(" 2. User Fills Data");
		user = new User();
		username.setText("root");
		password.setText("1234");
		user.setUsername(username.getText());
		user.setPassword(password.getText());
	}

	@Override
	public void click() {
		System.out.println("===================");
		System.out.println("User Click Button");
		System.out.println("===================");
		// TODO Auto-generated method stub
		if (btnLogin.getName().equals("Login")) {
			LoginController loginController = new LoginController();
			if(loginController.Login(user)) {
				System.out.println("Login Successfully");
			}else {
				System.out.println("Login failed");
			}
		}
	}
	
}
