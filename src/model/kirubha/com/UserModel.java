package model.kirubha.com;

import service.kirubha.com.UserService;

@SuppressWarnings("serial")
public class UserModel extends UserService {
	public String userName;
	public String emailId;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
