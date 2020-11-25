package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CUD {
	
	// CRUD
	// ��� ���α׷��� CRUD�� �ִ�
	
	// C : Create (INSERT)
	// R : Read (LELECT)
	// U : Update (UPDATE)
	// D : Delete (DELETE)
	
	// JDBC���� SELECT�� �ϸ� ResultSet�� ��ȯ�ȴ�
	// �׿� INSERT, UPDATE, DELETE�� ����� ���� ��ȯ ��
	
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
			
			pstmt.setString(1, "ī���");
			pstmt.setInt(2, 3200);
			
			//pstmt.executeQuery()
			// ResultSet�� ��ȯ�� ���� ����(SELECT)�� �����ų �� ���
			
			//pstmt.executeUpdate()
			// DML�� INSERT, UPDATE, DELETE �Ǵ� ��ȯ�Ǵ� ���� ���� DDL���� �������� ���
			
			int row = pstmt.executeUpdate();
			
			System.out.printf("%d ���� ����Ǿ����ϴ�.\n", row);
			
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
