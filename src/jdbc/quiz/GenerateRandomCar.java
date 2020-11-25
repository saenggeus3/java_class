package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GenerateRandomCar {
	
	// ���� ���� ���� �ڵ������� 100�� �����Ǿ� DB�� ����Ǵ� ���α׷��� ��������
	
	// ������ȣ�� https://post.naver.com/viewer/postView.nhn?volumeNo=24171702&memberNo=35787715
	// ��ȣ�� ���� ������ �ڿ� ��ȣ�� ���� �����Ǵ� ���� �����Ͽ�
	// ������ü�� ������ �� DB�� �˸°� ����
	
	// JAVA�ڵ�� DB��ũ����
	
	// ��ȣ�� ����
	
	

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
				
				
				pstmt.setInt(1, i+1); // ������ȣ
				pstmt.setString(2, tmp[i].typeName); // �ڵ���Ÿ��
				pstmt.setString(3, tmp[i].useName); // �뵵
				pstmt.setString(4, tmp[i].serial); // �ø���ѹ�
				pstmt.setString(5, tmp[i].licensePlate); // ��ȣ��
				
				// Batch : �ϰ�ó��
				
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
