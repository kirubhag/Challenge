package db.kirubha.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public ConnectionManager() {
		// TODO Auto-generated constructor stub
	}

	private static ConnectionManager instance = null;
	private final String dbUser = "root";
	private final String dbPassword = "root";
	private final String conString = "jdbc:mysql://localhost:8889/discover";
	private Connection con = null;

	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		return instance;
	};

	private boolean mysqlOpen() {
		try {
			con = DriverManager.getConnection(conString, dbUser, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public Connection mysqlConnect() {
		if (con == null) {
			if (mysqlOpen()) {
				System.out.println("Connected Successfully.");
				return con;
			} else {
				return con;
			}
		}
		return con;
	};

	public void mysqlClose() {
		System.out.println("Closing MYSQL Connection.");
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		con = null;
	};

}
