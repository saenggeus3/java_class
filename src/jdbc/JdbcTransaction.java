package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTransaction {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234"
			);
		
			// �ڵ� Ŀ���� �⺻������ Ȱ��ȭ �Ǿ� �����Ƿ�
			// Ʈ������ ��� ���ؼ��� �ڵ� Ŀ���� ��Ȱ��ȭ �ؾ���
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE coffees SET cprice = cprice + 500 "
					+ "WHERE cfid < 150";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			
			pstmt1 = conn.prepareStatement(sql1);
			
			int row = pstmt1.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
