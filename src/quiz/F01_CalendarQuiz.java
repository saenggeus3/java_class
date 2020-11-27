package quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class F01_CalendarQuiz {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
		//DB에 저장되어있는 차량정보를 조회해서
		//오늘 출입제한인 차량을 모두 출력
		
		Calendar korea_time = Calendar.getInstance();
		
		HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521/XE");
		config.setUsername("hr");
		config.setPassword("1234");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		HikariDataSource ds = new HikariDataSource(config);
		
		try {
			Connection conn = ds.getConnection();
			
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM car");
			
			ResultSet rs = pstmt.executeQuery();

			
			
			while(rs.next()) {
				String tmp = rs.getString("licenseplate");
				char checknum = tmp.charAt(tmp.length()-1);
				switch (korea_time.get(Calendar.DAY_OF_WEEK)) {
				case Calendar.MONDAY:
					if(checknum=='1' || checknum=='6') {
						print_car(rs, checknum);
						count++;
					}
					break;
					
				case Calendar.TUESDAY:
					if(checknum=='2' || checknum=='7') {
						print_car(rs, checknum);
						count++;
					}
					
					break;
					
				case Calendar.WEDNESDAY:
					if(checknum=='3' || checknum=='8') {
						print_car(rs, checknum);
						count++;
					}
					
					break;
					
				case Calendar.THURSDAY:
					if(checknum=='4' || checknum=='9') {
					print_car(rs, checknum);
					count++;
					}
					break;
					
				case Calendar.FRIDAY:
					if(checknum=='5' || checknum=='0') {
						print_car(rs, checknum);
						count++;
					}
					
					break;
					

					
				default :
					break;
				
				}
		
				
			}
			System.out.println("출입제한을 위반한 차량의 수 : " + count);
			
			rs.close();
			pstmt.close();
			conn.close();

			//ConnectionPool을 사용할 때는 conn을 닫는 대신 ds를 닫아야 함
			ds.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void print_car(ResultSet rs, char checknum) throws SQLException {
		System.out.printf("%-5d%-5s\t%-5s\t%-5s\t%-5s\n",
				rs.getInt("cid"),
				rs.getString("cartype"),
				rs.getString("caruse"),
				rs.getString("serial"),
				rs.getString("licenseplate"));

	}
	

}
