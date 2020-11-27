package default_package;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class F01_Calendar {
	
	public static void main(String[] args) {
		
		// 자바로 날짜/시간 다루기
		// java.util.Data
		// java.util.Calendar
		
		// 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지를 통해 시간을 표현
		System.out.println(System.currentTimeMillis());
		
		Date now = new Date();
		System.out.println(now);
		
		//Data 클래스는 전부 deprecated 상태 (날짜를 담아놓는 용도로만 사용)
		
		//Calendar 클래스
		// 달력을 표현한 클래스
		// 날짜를 쉽게 계산할 수 있는 기능들이 모여있음
		// 생성자 대신 getInstance() 함수를 통해 인스트턴스를 받아옴
		
		
		
		Calendar now2 = Calendar.getInstance();
		
		System.out.println(now2);
		
		
		// TimeZone 클래스
		// 경도를 설정할 수 있는 클래스
		for(String zone_id : TimeZone.getAvailableIDs()) {
			System.out.println(zone_id);
		}
		
		TimeZone zone1 = TimeZone.getTimeZone("US/Samoa");
		
		Calendar korea_time = Calendar.getInstance();
		Calendar samoa_time = Calendar.getInstance(zone1);
		
		// Calendar의 set메서드로 해당 필드를 내가원하는 값으로 바꿀 수 있음
		//samoa_time.set(Calendar.MONTH, 10-1); // MONTH를 10월로 변경
		
		//Calender의 get매서드로 원하는 필드를 뺄수있음
		int samoa_year = samoa_time.get(Calendar.YEAR);
		// Calendar는 Month만 1월이 0으로나옴 사용할때 +1해서 사용
		int samoa_month = samoa_time.get(Calendar.MONTH);
		int samoa_date = samoa_time.get(Calendar.DATE);
		
		// HOUR : 12시, HOUR_OF_DAY : 24시
		int samoa_hour = samoa_time.get(Calendar.HOUR);
		int samoa_minute = samoa_time.get(Calendar.MINUTE);
		int samoa_second = samoa_time.get(Calendar.SECOND);
		
		// 0 = AM , 1 = PM
		int samoa_am_pm = samoa_time.get(Calendar.AM_PM);
		
		// DAY_OF_WEEK : 요일
		int samoa_week = samoa_time.get(Calendar.DAY_OF_WEEK);
		
		// WEEK_OF_MONTH : 몇번째 주인가
		int samoa_wom = samoa_time.get(Calendar.WEEK_OF_MONTH);
		
		// DAY_OF_WEEK_IN_MONTH : 이번 요일이 몇 번째 요일인가?
		int samoa_dowim = samoa_time.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		
		System.out.printf("오늘은 %d번째 %s요일\n",
				samoa_wom,getStrWeek(samoa_dowim));
		
		System.out.printf("samoa time - %d/%02d/%02d %d:%d:%d %s %s\n",
				samoa_year,samoa_month+1,samoa_date,
				samoa_hour,samoa_minute,samoa_second,
				samoa_am_pm == 0? "AM" : "PM",
				getStrWeek(samoa_week)
				);
		
		System.out.printf("korea time - %d/%02d/%02d %d:%d:%d %s %s\n",
				korea_time.get(Calendar.YEAR),korea_time.get(Calendar.MONTH)+1,korea_time.get(Calendar.DATE),
				korea_time.get(Calendar.HOUR),korea_time.get(Calendar.MINUTE),korea_time.get(Calendar.SECOND),
				korea_time.get(Calendar.AM_PM) == 0? "AM" : "PM",
				getStrWeek(korea_time.get(Calendar.DAY_OF_WEEK))
				);
		
		
	
		
		
	}
	private static String getStrWeek(int calendar_dow) {
		switch (calendar_dow) {
		case Calendar.MONDAY:
			return "월";
			
		case Calendar.TUESDAY:
			return "화";
			
		case Calendar.WEDNESDAY:
			return "수";
			
		case Calendar.THURSDAY:
			return "목";
			
		case Calendar.FRIDAY:
			return "금";
			
		case Calendar.SATURDAY:
			return "토";
			
		case Calendar.SUNDAY:
			return "일";
			
		default :
			return null;
		
		}
	}

}
