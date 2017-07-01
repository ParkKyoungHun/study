package kohyeryeon.r0004;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;

public class ExamSelect {
	
	Connection con;
	PreparedStatement ps; //PreparedStatement 흰 판
	HashMap<String,String> hm = new HashMap<String,String>();
	
	public void getSelect(){
		try{
			con = DBConn.getCon();
			String sql = "select user_num,user_id,user_pwd,user_name,class_number,user_age from user_info";
			ps = con.prepareStatement(sql);
			//ps.executeQuery();  //컨트롤쉬프트에프구를 누르는 명령어
			ResultSet rs = ps.executeQuery();//ResultSet rs 실행한 결과를 넣음
			//ResultSet rs 컬럼정보를 읽는다!
			ResultSetMetaData rsmd = rs.getMetaData(); 
			//MetaData란 데이터를 정의할수있는, 구분지을수있는 데이터! 
			int colCnt = rsmd.getColumnCount();
			//내가 위에 써준 num,id,pwd,name,number,age 총 6개!
			while(rs.next()){ //만족할떄까지 이므로 로우가 없을때까지 돈다.
				for(int i=1;i<=colCnt;i++){
					String colList = rsmd.getColumnLabel(i);
					System.out.print(rs.getString(colList)+",");
				}//getString(id)은 id안에잇는 값 blue를 가져온다. 
				System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("출력되지 않았어! 무슨 문제가 있나봐!");
		}
	}
	
	public void getInsert(){
		try{
			con = DBConn.getCon();
			String sql = "insert into user(id, pwd, name, age)";
			sql += " values('red','red','홍길동','26')";
			ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			String name = rsmd.getColumnName(1);
			while(rs.next()){
				System.out.println(name + "," + rsmd.getColumnCount() + "," + rs.getString(name)+"개 가 등록됬어");
			}
			System.out.println("잘실행됫엉!");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("등록되지 않았는걸!");
		}
	}
	
public void getUpdate(){
		try{
			con = DBConn.getCon();
			String sql = "update user_info set user_pwd='pass'";
			sql	+=" where user_name='홍길동'";
			
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			System.out.println(result + "개 가 업데이트됬어!");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("업데이트가 되지 않았는걸!");
		}
	}
	
	public void getDelete(){
		try{
			con = DBConn.getCon();
			String sql ="delete from user_info";
			sql+=" where user_name='홍길동'";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			System.out.println(result + "개 가 지워졌어!");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("지워지지 않았는걸!");
		}
	}	
	
	
	public static void main(String[] args){
//			rs.next(); //첫번째 로우로 넘어옴. 또쓰면 두번째 로우로 넘어간다.
//			rs.getString("user_id");
//			rs.getString("user_pwd");
//			rs.getString("user_name");
//			System.out.println(rs.getString("user_id") +","+ rs.getString("user_pwd") +","+ rs.getString("user_name"));
		ExamSelect es = new ExamSelect();
		
//		es.getInsert();
//		es.getUpdate();
//		es.getDelete();
		es.getInsert();
		
		System.out.println("잘됫는지는 모르겟지만 작업종료!");
	}

}
