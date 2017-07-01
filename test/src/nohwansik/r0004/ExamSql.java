package nohwansik.r0004;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ExamSql {
	Connection con;
	PreparedStatement ps;

	ExamSql() {
		try {
			con = DBConn.getCon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectUserInfo() throws SQLException {
		String sql = "select * from user_info";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int colcnt = rsmd.getColumnCount();
		while (rs.next()) {
			for(int i=1;i<=colcnt;i++){
				String name = rsmd.getColumnLabel(i);
				System.out.print(rs.getString(name)+",");
			}
			System.out.println();
		}
	}

	public void deleteUserInfo() {
		String sql = "insert into user_info(user_id, user_pwd, user_name, class_number, age)";
	}

	public void updateUserInfo() throws SQLException {
		String sql = "update user_info set user_pwd='pass' where user_num = 2";

		ps = con.prepareStatement(sql);
		int result = ps.executeUpdate();
		System.out.println(result);
	}

	public void insertUserInfo() {
		String sql = "delete from user_info where user_num=4;";
	}

	public static void main(String[] args) {

		try {
			ExamSql es = new ExamSql();
			es.selectUserInfo();
//			es.updateUserInfo();
			DBConn.closeCon();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}