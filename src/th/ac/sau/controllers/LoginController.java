package th.ac.sau.controllers;
import th.ac.sau.models.User;

public class LoginController {
	
	public Boolean Login(User user) {
		return user.login(user.getUsername(), user.getPassword());
	}
}
