package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectSteps {
	
	// jdbc
	// Java Database Connectivity
	// DB에 쿼리문을 전달하여 실행하고 결과를 받아올 수 있는 Java API
	// Java 부문의 소스는 어떤 DB를 사용하더라도 항상 일정함
	// DB를 제작한 쪽에서 jdbc의 형식에 맞추기 때문에 프로그래머들은 편리하게 사용할 수 있음
	
	// OJDBC
	// ORACLE 데이터베이스를 설치하면 제공되는 JDBC
	// sqldeveloper/jdbc/lib에 있음
	
	public static void main(String[] args) {
		
		// 어떤 DB를 사용하더라도 밟게되는 똑같은 절차들
		
		
		
		try {
			// 1. Class.forName(driverName)으로 해당 DB사의 jdbc드라이버를 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("[ojdbc] 성공적으로 로드");
			
			
			// 2. DriverManager 클래스를 통해 DB와의 연결을 수립
			// DriverManager.getConnection() 메서드에 DB접속 주소와 아이디/패스워드를 전달하면 연결이 반환
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234");
		System.out.println("연결성공");
		
		// 3. 반환된 연결에 사용할 쿼리문을 준비함
		PreparedStatement pstmt = 
				conn.prepareStatement("SELECT * FROM employees "
						+ "WHERE department_id IN (?, ?, ?, ?) AND "
						+ "last_name LIKE ?");
		// 3-1 준비할 구문에 ?가 있다면 setType을 통해 값을 채워야 함
		pstmt.setInt(1, 10);
		pstmt.setInt(2, 20);
		pstmt.setInt(3, 30);
		pstmt.setInt(4, 50);
		pstmt.setString(5,"%a%");
		
		// 3-2 준비된 구문을 실행함
		//	쿼리가 SELECT문인 경우 결과를 SET으로 받아옴
		ResultSet rs = pstmt.executeQuery();
		
		// 4. 반환된 결과를 사용함
		/*
		 ReasultSet
		 [	-> rs.next()를 할때마다 화살표가 움직여서 다음행을 가리킴
		 	['길동', '홍', '123', 10],
		 	['길동', '홍', '123', 10],
		 	['길동', '홍', '123', 10],
			['길동', '홍', '123', 10]
		 ] -> rs.next()으 ㅣ결과가 없을 때 false가 반환되며 while이 종료됨
		*/
		System.out.println("LAST_NAME\tFIRST_NAME\tSALARY\tDEPARTMENT_ID");
		while(rs.next()) {
			System.out.printf("%-15s\t%-10s\t%-10d\t%5d\n",
				rs.getString("last_name"),
				rs.getString("first_name"),
				rs.getInt("salary"),
				rs.getInt("department_id"));
		}
		
		// 5. 연결에 사용된 모든 객체를 순서대로 닫음
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("경로가 틀림");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		



		
		
	}

}
