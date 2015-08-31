package action.kirubha.com;

import com.opensymphony.xwork2.ActionSupport;
import service.kirubha.com.LoginService;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {

	public String userName;
	public String password;
	public static String DASHBOARD="dashboard";

	LoginService loginService = new LoginService();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {

		if (loginService.loginValidation(userName, password)) {
			return DASHBOARD;
		} else {
			return LOGIN;
		}
	}
}
