package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CUD {
	
	// CRUD
	// 모든 프로그램은 CRUD가 있다
	
	// C : Create (INSERT)
	// R : Read (LELECT)
	// U : Update (UPDATE)
	// D : Delete (DELETE)
	
	// JDBC에서 SELECT를 하면 ResultSet이 반환된다
	// 그외 INSERT, UPDATE, DELETE는 적용된 행이 반환 됨
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234"
			);
			PreparedStatement pstmt = 
					conn.prepareStatement("INSERT INTO coffees VALUES (empp_seq.nextval, ?, ?)");
			
			pstmt.setString(1, "카페라떼");
			pstmt.setInt(2, 3200);
			
			//pstmt.executeQuery()
			// ResultSet이 반환될 법한 쿼리(SELECT)를 실행시킬 때 사용
			
			//pstmt.executeUpdate()
			// DML인 INSERT, UPDATE, DELETE 또는 반환되는 값이 없는 DDL같은 쿼리문을 사용
			
			int row = pstmt.executeUpdate();
			
			System.out.printf("%d 행이 변경되었습니다.\n", row);
			
			if (pstmt != null) pstmt.close();
			if (conn != null) conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
