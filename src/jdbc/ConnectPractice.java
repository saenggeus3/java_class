package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectPractice {
	
	// 사용자로부터 부서번호를 입력받으면
	// 해당 부서의 모든 사원들의 정보를 조회해서 콘솔에 출력
	
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234"
			);
			
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM employees "
							+ "WHERE department_id = ?");
			System.out.print("부서번호 입력 : ");
			int input = sc.nextInt();
			pstmt.setInt(1, input);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("LAST_NAME\tFIRST_NAME\tSALARY\tDEPARTMENT_ID");
				while(rs.next()) {
					System.out.printf("%-15s\t%-10s\t%-10d\t%5d\n",
						rs.getString("last_name"),
						rs.getString("first_name"),
						rs.getInt("salary"),
						rs.getInt("department_id"));
				}
			}
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			sc.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 경로 오류");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("커넥션 경로 오류");
		}
	}
	

}
