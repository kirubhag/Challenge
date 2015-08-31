package db.kirubha.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.kirubha.com.ResponseHandler;

@SuppressWarnings("serial")
public class DBManager extends ResponseHandler {
	public static Connection con;
	public static ResultSet rs;
	public static String sql;
	public static String MySQLDriver = "com.mysql.jdbc.Driver";
	public static String AppId = "e1790462ca6aa07831984ea0d0b27f4c";
	public static String AppName = "Discover";

	public DBManager() {
		sql = null;
		con = ConnectionManager.getInstance().mysqlConnect();
	};

	public ResultSet selectWhere(String star, String tableName, String where)
			throws SQLException {
		con = ConnectionManager.getInstance().mysqlConnect();
		PreparedStatement smt = null;
		try {
			Class.forName(MySQLDriver);
			sql = "select " + star + " from " + tableName + " where " + where;
			System.out.println(sql);
			smt = con.prepareStatement(sql);
			rs = smt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("request_cnt"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return rs;

	}

	public static Connection getCon() {
		return con;
	}

	public static void setCon() {
		DBManager.con = ConnectionManager.getInstance().mysqlConnect();
	}
}
