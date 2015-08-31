package util.kirubha.com;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import db.kirubha.com.ConnectionManager;

@SuppressWarnings("serial")
public class MySqlUtility extends DefaultStrings {

	String recordCount = null;

	public boolean isRecordExists(String tableName, String cond)
			throws SQLException {
		sql = "select count(*) as record_count from " + tableName + " where "
				+ cond;
		con = ConnectionManager.getInstance().mysqlConnect();
		PreparedStatement smt = null;
		try {
			Class.forName(MySQLDriver);
			// System.out.println(sql);
			smt = con.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next()) {
				recordCount = rs.getString("record_count");
				// System.out.println("recordCount: " + recordCount);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		if (recordCount.equals("0")) {
			return false;
		} else {
			return true;
		}
	}
}
