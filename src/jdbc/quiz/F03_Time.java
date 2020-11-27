package jdbc.quiz;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.sql.Date; // LocalDate
import java.sql.Time; // LocalTime
import java.sql.Timestamp; // LocalDateTime

public class F03_Time {
	
	public static void main(String[] args) {
		
		// now()를 통해 지금의 인스턴스를 생성하기
		
		//날짜만 저장
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//시간만 저장
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		// 날짜와 시간을 저장
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		// 날짜와 시간과 경도를 저장
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("US/Samoa"));
		System.out.println(zoned);
		
		
		
		
		// of()를 이용해서 해당 날짜/시간의 인스턴스를 생성하기
		LocalDate birthday = LocalDate.of(1999, 11, 25);
		System.out.println(birthday);
		
		LocalTime birthtime = LocalTime.of(5, 5, 5, 1234);
		System.out.println(birthtime);
		
		LocalDateTime birthdatetime = LocalDateTime.of(birthday, birthtime);
		System.out.println(birthdatetime);
		
		ZonedDateTime birthdayzoned = ZonedDateTime.of(birthdatetime, ZoneId.of("Asia/Seoul"));
		System.out.println(birthdayzoned);
		
		Instant start_time = Instant.now();
		System.out.println(start_time);
		Instant end_time = Instant.now();
		
		// Instant클래스는 isAfer, isBefore를 이용해서 시간비교를 할 수 있음
		System.out.println(start_time.isAfter(end_time));
		System.out.println(start_time.isBefore(end_time));
		System.out.println(start_time.until(end_time, ChronoUnit.MILLIS));
		
		// 날짜/시간 계산하기
		today = LocalDate.now();
		LocalDate date2 = LocalDate.of(2002, 7, 7);
		
		// 현재 날짜/시간을 이용해 새로운 날짜/시간인스턴스를 생성해 반환해줌
		System.out.println(today.minusYears(5));
		System.out.println(today.minusMonths(3));
		System.out.println(today.minusDays(5));
		System.out.println(today.minusWeeks(4));
		
		// 대입
		System.out.println(today.withYear(1997));
		
		System.out.println(today.plusYears(5));
		System.out.println(today.plusMonths(3));
		System.out.println(today.plusDays(5));
		System.out.println(today.plusWeeks(4));
		
		
		// 문자열 변환!!!!!! (파싱)
		
		// yyyy-MM-dd가 가장 기본형태의 날짜 문자열
		LocalDate test1 = LocalDate.parse("1234-12-12");
		System.out.println("문자열을 Date로 변환 : " + test1.plusDays(5));
		
		// DateTimeFormatter.ofPattern()을 이용해 원하는 패턴을 생성할 수 있다
		LocalDateTime test2 = LocalDateTime.parse(
				"2021년 05월 05일 19시 05분 35초", 
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		System.out.println(test2);
		
		// 이미 유명한 패턴들은 상수로 DateTimeFormatter에 정의되어 있음
		test2 = LocalDateTime.parse("2011-12-03T10:15:30+01:00",DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println(test2.plusHours(5));
		
		//java.time 객체를 문자열로 변환하기
		// 날짜 객체가 문자열로 변환할 때도 DateTimeForMatter를 사용함
		ZonedDateTime ldt = ZonedDateTime.now();
		System.out.println(ldt.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(ldt.format(DateTimeFormatter.ISO_DATE));
		System.out.println(ldt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));		
		System.out.println(ldt.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		
		
		// java.time to java.sql.date
		// DB에 넣을때 사용
		LocalDate locald = LocalDate.of(1967, 06, 22);
		Date date = Date.valueOf(locald);
		java.sql.Time time = 
				java.sql.Time.valueOf(LocalTime.of(3, 44, 30, 9981234));
		java.sql.Timestamp timestamp = 
				java.sql.Timestamp.valueOf(LocalDateTime.of(2020, 11, 26, 15,45,59,12345));
		
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(timestamp);
		
		
		
		
		
		
		
		
		
		
	}

}
