package kyounghunpark.r0004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	private static Connection con;

	public static Connection getCon() throws ClassNotFoundException, SQLException {
		if (con == null) {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.2/study", "root", "rnfma1");
		}
		System.out.println(con);
		return con;
	}

	public static void closeCon() throws SQLException {
		System.out.println(con);
		if (con != null) {
			con.close();
			con = null;
		}
	}
}
