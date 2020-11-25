package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenerateRandomCar {
	
	// 랜덤 값을 가진 자동차들이 100대 생성되어 DB에 저장되는 프로그램을 만들어보세요
	
	// 차량번호판 https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715
	// 번호를 랜덤 생성한 뒤에 번호에 따라 결정되는 것을 적용하여
	// 차량객체를 생성한 후 DB에 알맞게 저장
	
	// JAVA코드와 DB스크린샷
	
	// 번호판 생성
	
	

	public static void main(String[] args) {
		
		Car[] tmp = new Car[100];
		
		for (int i = 0; i < 100; i++) {
			Car c = new Car(i);
			System.out.print(c.licensePlate + " ");
			System.out.print(c.typeName + " ");
			System.out.println(c.useName);
			tmp[i] = c;
		}
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234"
			);
			
			for (int i = 0; i < tmp.length; i++) {
				
			}
			PreparedStatement pstmt = 
					conn.prepareStatement("INSERT INTO car VALUES (?, ?, ?, ?, ?)");
			
			for (int i = 0; i < tmp.length; i++) {
				
				
				pstmt.setInt(1, i+1); // 제조번호
				pstmt.setString(2, tmp[i].typeName); // 자동차타입
				pstmt.setString(3, tmp[i].useName); // 용도
				pstmt.setString(4, tmp[i].serial); // 시리얼넘버
				pstmt.setString(5, tmp[i].licensePlate); // 번호판
				
				// Batch : 일괄처리
				
				pstmt.addBatch();
				
				//pstmt.executeUpdate();
			}
			int[] rows = pstmt.executeBatch();
				
			
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
