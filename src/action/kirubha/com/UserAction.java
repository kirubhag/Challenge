package action.kirubha.com;

import java.io.IOException;
import java.sql.SQLException;
import model.kirubha.com.UserModel;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings({ "serial", "rawtypes" })
public class UserAction extends UserModel implements ModelDriven {

	UserModel userModel = new UserModel();

	public UserModel getuserModel() {
		return userModel;
	}

	public void setuserModel(UserModel userModel) {
		this.userModel = userModel;
	}

	@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return userModel;
	}

	public String addUserDetails() throws IOException, SQLException {

		boolean emailIdExists = userModel.addNewUser(userModel);
		if (!emailIdExists) {
			responseObject.put(SUCCESS, Yes);
			responseObject.put(ERROR, No);
			responseObject.put(MSG, UserModelMsg1);
		} else {
			responseObject.put(SUCCESS, No);
			responseObject.put(ERROR, Yes);
			responseObject.put(MSG, UserModelError1);
		}
		sendResponse(responseObject, 200);

		return null;
	}

	public String getUserDetails() {
		System.out.println("From getuserModelDetails method."
				+ request.getParameter("emailID"));
		System.out.println("userModelName: " + userModel.getUserName()
				+ " emailID: " + userModel.getEmailId());
		return null;
	}

	public String execute() {
		return null;
	}

}
