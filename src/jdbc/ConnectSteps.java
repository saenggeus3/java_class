package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectSteps {
	
	// jdbc
	// Java Database Connectivity
	// DB�� �������� �����Ͽ� �����ϰ� ����� �޾ƿ� �� �ִ� Java API
	// Java �ι��� �ҽ��� � DB�� ����ϴ��� �׻� ������
	// DB�� ������ �ʿ��� jdbc�� ���Ŀ� ���߱� ������ ���α׷��ӵ��� ���ϰ� ����� �� ����
	
	// OJDBC
	// ORACLE �����ͺ��̽��� ��ġ�ϸ� �����Ǵ� JDBC
	// sqldeveloper/jdbc/lib�� ����
	
	public static void main(String[] args) {
		
		// � DB�� ����ϴ��� ��ԵǴ� �Ȱ��� ������
		
		
		
		try {
			// 1. Class.forName(driverName)���� �ش� DB���� jdbc����̹��� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("[ojdbc] ���������� �ε�");
			
			
			// 2. DriverManager Ŭ������ ���� DB���� ������ ����
			// DriverManager.getConnection() �޼��忡 DB���� �ּҿ� ���̵�/�н����带 �����ϸ� ������ ��ȯ
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XE",
					"hr",
					"1234");
		System.out.println("���Ἲ��");
		
		// 3. ��ȯ�� ���ῡ ����� �������� �غ���
		PreparedStatement pstmt = 
				conn.prepareStatement("SELECT * FROM employees "
						+ "WHERE department_id IN (?, ?, ?, ?) AND "
						+ "last_name LIKE ?");
		// 3-1 �غ��� ������ ?�� �ִٸ� setType�� ���� ���� ä���� ��
		pstmt.setInt(1, 10);
		pstmt.setInt(2, 20);
		pstmt.setInt(3, 30);
		pstmt.setInt(4, 50);
		pstmt.setString(5,"%a%");
		
		// 3-2 �غ�� ������ ������
		//	������ SELECT���� ��� ����� SET���� �޾ƿ�
		ResultSet rs = pstmt.executeQuery();
		
		// 4. ��ȯ�� ����� �����
		/*
		 ReasultSet
		 [	-> rs.next()�� �Ҷ����� ȭ��ǥ�� �������� �������� ����Ŵ
		 	['�浿', 'ȫ', '123', 10],
		 	['�浿', 'ȫ', '123', 10],
		 	['�浿', 'ȫ', '123', 10],
			['�浿', 'ȫ', '123', 10]
		 ] -> rs.next()�� �Ӱ���� ���� �� false�� ��ȯ�Ǹ� while�� �����
		*/
		System.out.println("LAST_NAME\tFIRST_NAME\tSALARY\tDEPARTMENT_ID");
		while(rs.next()) {
			System.out.printf("%-15s\t%-10s\t%-10d\t%5d\n",
				rs.getString("last_name"),
				rs.getString("first_name"),
				rs.getInt("salary"),
				rs.getInt("department_id"));
		}
		
		// 5. ���ῡ ���� ��� ��ü�� ������� ����
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("��ΰ� Ʋ��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		



		
		
	}

}
