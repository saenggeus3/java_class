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
		
		// now()�� ���� ������ �ν��Ͻ��� �����ϱ�
		
		//��¥�� ����
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//�ð��� ����
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		// ��¥�� �ð��� ����
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		// ��¥�� �ð��� �浵�� ����
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("US/Samoa"));
		System.out.println(zoned);
		
		
		
		
		// of()�� �̿��ؼ� �ش� ��¥/�ð��� �ν��Ͻ��� �����ϱ�
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
		
		// InstantŬ������ isAfer, isBefore�� �̿��ؼ� �ð��񱳸� �� �� ����
		System.out.println(start_time.isAfter(end_time));
		System.out.println(start_time.isBefore(end_time));
		System.out.println(start_time.until(end_time, ChronoUnit.MILLIS));
		
		// ��¥/�ð� ����ϱ�
		today = LocalDate.now();
		LocalDate date2 = LocalDate.of(2002, 7, 7);
		
		// ���� ��¥/�ð��� �̿��� ���ο� ��¥/�ð��ν��Ͻ��� ������ ��ȯ����
		System.out.println(today.minusYears(5));
		System.out.println(today.minusMonths(3));
		System.out.println(today.minusDays(5));
		System.out.println(today.minusWeeks(4));
		
		// ����
		System.out.println(today.withYear(1997));
		
		System.out.println(today.plusYears(5));
		System.out.println(today.plusMonths(3));
		System.out.println(today.plusDays(5));
		System.out.println(today.plusWeeks(4));
		
		
		// ���ڿ� ��ȯ!!!!!! (�Ľ�)
		
		// yyyy-MM-dd�� ���� �⺻������ ��¥ ���ڿ�
		LocalDate test1 = LocalDate.parse("1234-12-12");
		System.out.println("���ڿ��� Date�� ��ȯ : " + test1.plusDays(5));
		
		// DateTimeFormatter.ofPattern()�� �̿��� ���ϴ� ������ ������ �� �ִ�
		LocalDateTime test2 = LocalDateTime.parse(
				"2021�� 05�� 05�� 19�� 05�� 35��", 
				DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��"));
		System.out.println(test2);
		
		// �̹� ������ ���ϵ��� ����� DateTimeFormatter�� ���ǵǾ� ����
		test2 = LocalDateTime.parse("2011-12-03T10:15:30+01:00",DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println(test2.plusHours(5));
		
		//java.time ��ü�� ���ڿ��� ��ȯ�ϱ�
		// ��¥ ��ü�� ���ڿ��� ��ȯ�� ���� DateTimeForMatter�� �����
		ZonedDateTime ldt = ZonedDateTime.now();
		System.out.println(ldt.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(ldt.format(DateTimeFormatter.ISO_DATE));
		System.out.println(ldt.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));		
		System.out.println(ldt.format(DateTimeFormatter.ISO_WEEK_DATE));
		
		
		
		// java.time to java.sql.date
		// DB�� ������ ���
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
