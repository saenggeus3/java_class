package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataTest {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234"
			);
			
			String sql = "SELECT * FROM employees";
			
			PreparedStatement pstmt = 
					conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			// 쿼리문으로 가져온 ResultSet에대한 정보 목록 객체
			ResultSetMetaData rsmd = rs.getMetaData();
			
			for (int i = 1; i < rsmd.getColumnCount(); i++) {
				System.out.println(i + "번째 컬럼 : ");
				System.out.println("\t컬럼 이름 : " + rsmd.getColumnName(i));
				System.out.println("\t컬럼 타입 : " + rsmd.getColumnTypeName(i));
				System.out.println("\t컬럼 크기 : " + rsmd.getColumnDisplaySize(i));
			}
			
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
