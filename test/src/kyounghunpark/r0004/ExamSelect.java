package kyounghunpark.r0004;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExamSelect {
	Connection con;
	PreparedStatement ps;
	ExamSelect(){
		try{
			con = DBConn.getCon();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void selectUserInfo() throws SQLException{
		String sql = "select * from user_info";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("user_name"));
		}
	}
	
	public void deleteUserInfo(){
		String sql = "delete from user_info";
	}
	
	public void updateUserInfo() throws SQLException{
		String sql = "update user_info";
		sql += " set user_name='흑길동'";
		sql += " where user_num=6";

		ps = con.prepareStatement(sql);
		int result = ps.executeUpdate();
		System.out.println(result + "갯수 만큼 수정 되었습니다.");
	}
	
	public void insertUserInfo(){
		String sql = "insert into user_info(user_id, user_pwd, user_name, class_number, age)";
	}

	public static void main(String[] args) {
		try {
			ExamSelect es = new ExamSelect();
			es.updateUserInfo();
			es.selectUserInfo();
			DBConn.closeCon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
