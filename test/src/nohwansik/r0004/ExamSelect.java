package nohwansik.r0004;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExamSelect {
	
	public static void main(String[] args) {
		try {
			Connection con = DBConn.getCon();
			String sql = "select * from user_info";
			PreparedStatement ps;
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("user_num") + ", " + rs.getString("user_id") + ", " + rs.getString("user_pwd"));
			}
			
			sql = "insert into user_info(user_id, user_pwd, user_name, class_number, age)";
			sql +="values('black', 'pass', '흙길동', 2, 100)";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			System.out.println(result);
			
			sql = "update user_info set user_pwd='pass' where user_num = 2";
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
			System.out.println(sql);
			
			sql = "delete from user_info where user_num=7;";
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("잘 됐는지 모르겠지만 작업 종료");
	}

}
