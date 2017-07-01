package umwoosung.r0003;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	private static Connection con;

	public static Connection getCon() throws ClassNotFoundException, SQLException{
		if(con == null){
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/study","root","Slalfkf11!");
			}
		return con;
	}

	public static void closeCon() throws SQLException {
		if (con != null) {
			con.close();
			con = null;
		}
	}
}
