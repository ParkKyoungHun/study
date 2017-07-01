package nohwansik.r0004;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class ExamSelect3 {
	PreparedStatement ps;
	public void connectionDb(String sql) {
		try {
			Connection con = DBConn.getCon();
			ps = con.prepareStatement(sql);
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<HashMap> selectUserInfo() throws SQLException {
		ExamSelect3 es = new ExamSelect3();
		ArrayList<HashMap> userInfoList = new ArrayList<HashMap>();
		String sql = "select user_num, user_id, user_pwd, user_name, age, admin, board_admin from user_info";
		es.connectionDb(sql);
		ResultSet rs = es.ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int colCnt = rsmd.getColumnCount();
		while (rs.next()) {
			HashMap hm = new HashMap();
			for (int i = 1; i <= colCnt; i++) {
				String name = rsmd.getColumnLabel(i);
				hm.put(name, rs.getString(name));
			}
			userInfoList.add(hm);
		}
		return userInfoList;
	}

	public void deleteUserInfo() throws SQLException {
//		ExamSelect3 es = new ExamSelect3();
//		String sql = "delete from user_info where user_num=7;";
//		es.connectionDb(sql);
//		int result = ps.executeUpdate();
//		System.out.println(result + "갯수 만큼 삭제 되었습니다.");
	}

	public void updateUserInfo() throws SQLException {
		ExamSelect3 es = new ExamSelect3();
		String sql = "update user_info";
		sql += " set user_name='테스트1'";
		sql += " where user_num=16";
		es.connectionDb(sql);
		int result = es.ps.executeUpdate();
		System.out.println(result + "갯수 만큼 업데이트 되었습니다.");
	}

	public void insertUserInfo() throws SQLException {
		ExamSelect3 es = new ExamSelect3();
		String sql = "insert into user_info(user_id, user_pwd, user_name, age, admin, board_admin)";
		sql +="values('test2', 'test2', '테스트2', 100, 1, 1)";
		es.connectionDb(sql);
		int result = es.ps.executeUpdate();
		System.out.println(result + "갯수 만큼 추가 되었습니다.");
	}

	public static void main(String[] args) {
		try {
			ExamSelect3 es = new ExamSelect3();
			ArrayList<HashMap> userInfoList = es.selectUserInfo();
			for (HashMap hm : userInfoList) {
				System.out.println(hm);
			}
			es.insertUserInfo();
			es.updateUserInfo();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}