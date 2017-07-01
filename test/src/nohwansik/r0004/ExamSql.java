package nohwansik.r0004;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

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

	public ArrayList<HashMap> selectUserInfo() throws SQLException {
		ArrayList<HashMap> userInfoList = new ArrayList<HashMap>();
		String sql = "select * from user_info";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int colcnt = rsmd.getColumnCount();
		while (rs.next()) {
			HashMap hm = new HashMap();
			for(int i=1;i<=colcnt;i++){
				String name = rsmd.getColumnLabel(i);
				hm.put(name, rs.getString(name));
			}
			userInfoList.add(hm);
		}
		return userInfoList;
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
			ArrayList<HashMap> userInfoList = es.selectUserInfo();
			for(HashMap hm : userInfoList){
				System.out.println(hm);
			}
//			es.selectUserInfo();
//			es.updateUserInfo();
			DBConn.closeCon();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}