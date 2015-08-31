package service.kirubha.com;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.kirubha.com.MySqlUtility;
import model.kirubha.com.UserModel;
import db.kirubha.com.ConnectionManager;

@SuppressWarnings("serial")
public class UserService extends MySqlUtility {
	boolean emailIdExists;

	public boolean addNewUser(UserModel userModel) throws SQLException {
		try {
			Class.forName(MySQLDriver);
			emailIdExists = isRecordExists("list",
					"email='" + userModel.getEmailId() + "'");
			if (!emailIdExists) {
				sql = "insert into list(name,email) values(?,?)";
				try {
					PreparedStatement smt = con.prepareStatement(sql);
					smt.setString(1, userModel.getUserName());
					smt.setString(2, userModel.getEmailId());

					smt.executeUpdate();
					ConnectionManager.getInstance().mysqlClose();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return emailIdExists;
	}

}
