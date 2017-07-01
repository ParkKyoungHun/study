package umwoosung.r0003;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	public  void selectUserInfo{
		String sql = "select *from user_info";
	}
	public  void deleteUserInfo{
		String sql = "select *from user_info";
	}
	public  void updateUserInfo{
		String sql = "select *from user_info";
		
	}
	public  void insertUserInfo{
		String sql = "select *from user_info";
		
	}
	
	

	public static void main(String[]args){
		try{
	}
		ExamSelect es = new ExamSelect();
		
	}
}
//		try{
//			Connection con = DBConn.getCon();
//			String sql = "select * from user_info";
//			PreparedStatement ps;//써놓은상태
//			ps = con.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery();//1.c+s+f9 누른게 이거.2.ResultSet 입력한 결과가 나오는창,
//			while(rs.next()){//while() ()안의 문구가 만족할떄까지 돈다.	//rs.next();//다음로우로 이동.
//			//rs.getString("user_num");//getString은 로우의 ()안에 있는 것만 가져온다.
//			System.out.println(rs.getString("user_num") +","+rs.getString("user_id") +","+rs.getString("user_name"));
//			}
			
//			sql = "insert user_info(user_id,user_pwd,user_name,class_number,age)";
//			sql += " values('red','red','적길동',1,1000);";
//			ps = con.prepareStatement(sql);
//			int result  = ps.executeUpdate();// affected rows의 갯수를 반영한다?
//			System.out.println(result +"개만큼 뭔가 반영됬다.");
			
//			sql = "delete from user_info where user_num = 2;";
//			ps = con.prepareStatement(sql);
//			int result1  = ps.executeUpdate();// affected rows의 갯수를 반영한다?
//			System.out.println(result1 +"개만큼 뭔가 반영됬다.");
			
//			sql = "update user_info set user_pwd='pass' where user_num=3";
//			ps = con.prepareStatement(sql);
//			int result1  = ps.executeUpdate();// affected rows의 갯수를 반영한다?
//			System.out.println(result1 +"개만큼 뭔가 반영됬다.");
//			
			
//		}catch(Exception e){
//				e.printStackTrace();
//			}
//		System.out.println("잘됐는지 몰라서 작업종료");
//	}
//}
