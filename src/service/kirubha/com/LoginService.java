package service.kirubha.com;

public class LoginService {

	public Boolean loginValidation(String userName, String password) {
		if (userName != null && password != null) {
			return true;
		} else {
			return false;
		}
	}
}
