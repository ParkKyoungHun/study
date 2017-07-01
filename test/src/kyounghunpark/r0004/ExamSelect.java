package kyounghunpark.r0004;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class ExamSelect {
	Connection con;
	PreparedStatement ps;
	ExamSelect(){
		try{
			con = DBConn.getCon();
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public ArrayList<HashMap> selectUserInfo() throws SQLException{
		ArrayList<HashMap> userInfoList = new ArrayList<HashMap>();
		String sql = "select user_num, user_id, user_pwd, user_name, class_number, age from user_info";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int colCnt = rsmd.getColumnCount();
		while(rs.next()){
			HashMap hm = new HashMap();
			for(int i=1;i<=colCnt;i++){
				String name = rsmd.getColumnLabel(i);
				hm.put(name, rs.getString(name));
			}
			userInfoList.add(hm);
		}
		return userInfoList;
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
			ArrayList<HashMap> userInfoList = es.selectUserInfo();
			for(HashMap hm : userInfoList){
				System.out.println(hm);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
