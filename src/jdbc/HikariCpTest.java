package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCpTest {
	
	public static void main(String[] args) {
		// 1. HikariConfig ��ü�� ������ ���� �� DataSource()
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XE");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		

		// 2. Config ����� �������� �̷��� �ϼ���
//		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XE");
//		ds.setUsername("hr");
//		ds.setPassword("1234");

//		// 3. ���������� ����� ���� �̿��ϴ� ���	
		// key �� value�� �ٷ�� �͵�
		// map, ��ųʸ�, �Ӽ�, property, entry, json...
		
		// ������Ʈ ������ ��θ� ã�ư� ��
//		HikariConfig config = new HikariConfig("some\\path\\hikari.properties");
//		HikariDataSource ds = new HikariDataSource(config);
		
		
		// 4. ���� ���� ��ü�� �����ϼ� �����ϴ� ���
		
//		Properties props = new Properties();
//		props.setProperty("dataSourceClassName", "oracle.jdbc.pool.OracleDataSource");
//		props.setProperty("dataSource.url", "jdbc:oracle:thin:@localhost:1521/XE");
//		props.setProperty("dataSource.user", "hr");
//		props.setProperty("dataSource.password", "1234");
//		props.put("dataSource.logWriter", new PrintWriter(System.out));
//		HikariConfig config = new HikariConfig(props);
//		HikariDataSource ds = new HikariDataSource(config);
		
		
		try {
			Connection conn = ds.getConnection();
			
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM employees");
			
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
			
			rs.close();
			pstmt.close();
			conn.close();

			//ConnectionPool�� ����� ���� conn�� �ݴ� ��� ds�� �ݾƾ� ��
			ds.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
//			1. or directly instantiate a HikariDataSource like so:
//		    
//			HikariDataSource ds = new HikariDataSource();
//			ds.setJdbcUrl("jdbc:mysql://localhost:3306/simpsons");
//			ds.setUsername("bart");
//			ds.setPassword("51mp50n");...
//
//			2. or property file based:
//			    
//			// Examines both filesystem and classpath for .properties fileHikariConfig config = new HikariConfig("/some/path/hikari.properties");HikariDataSource ds = new HikariDataSource(config);
//
//			Example property file:
//
//			dataSourceClassName=org.postgresql.ds.PGSimpleDataSource
//			dataSource.user=test
//			dataSource.password=test
//			dataSource.databaseName=mydb
//			dataSource.portNumber=5432
//			dataSource.serverName=localhost
//
//			3. or java.util.Properties based:
//			    
//			Properties props = new Properties();
//			props.setProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
//			props.setProperty("dataSource.user", "test");
//			props.setProperty("dataSource.password", "test");
//			props.setProperty("dataSource.databaseName", "mydb");
//			props.put("dataSource.logWriter", new PrintWriter(System.out));
//			HikariConfig config = new HikariConfig(props);HikariDataSource ds = new HikariDataSource(config);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
