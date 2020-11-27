package default_package;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class F01_Calendar {
	
	public static void main(String[] args) {
		
		// �ڹٷ� ��¥/�ð� �ٷ��
		// java.util.Data
		// java.util.Calendar
		
		// 1970�� 1�� 1�� ���ķ� �ð��� �󸶳� �귶������ ���� �ð��� ǥ��
		System.out.println(System.currentTimeMillis());
		
		Date now = new Date();
		System.out.println(now);
		
		//Data Ŭ������ ���� deprecated ���� (��¥�� ��Ƴ��� �뵵�θ� ���)
		
		//Calendar Ŭ����
		// �޷��� ǥ���� Ŭ����
		// ��¥�� ���� ����� �� �ִ� ��ɵ��� ������
		// ������ ��� getInstance() �Լ��� ���� �ν�Ʈ�Ͻ��� �޾ƿ�
		
		
		
		Calendar now2 = Calendar.getInstance();
		
		System.out.println(now2);
		
		
		// TimeZone Ŭ����
		// �浵�� ������ �� �ִ� Ŭ����
		for(String zone_id : TimeZone.getAvailableIDs()) {
			System.out.println(zone_id);
		}
		
		TimeZone zone1 = TimeZone.getTimeZone("US/Samoa");
		
		Calendar korea_time = Calendar.getInstance();
		Calendar samoa_time = Calendar.getInstance(zone1);
		
		// Calendar�� set�޼���� �ش� �ʵ带 �������ϴ� ������ �ٲ� �� ����
		//samoa_time.set(Calendar.MONTH, 10-1); // MONTH�� 10���� ����
		
		//Calender�� get�ż���� ���ϴ� �ʵ带 ��������
		int samoa_year = samoa_time.get(Calendar.YEAR);
		// Calendar�� Month�� 1���� 0���γ��� ����Ҷ� +1�ؼ� ���
		int samoa_month = samoa_time.get(Calendar.MONTH);
		int samoa_date = samoa_time.get(Calendar.DATE);
		
		// HOUR : 12��, HOUR_OF_DAY : 24��
		int samoa_hour = samoa_time.get(Calendar.HOUR);
		int samoa_minute = samoa_time.get(Calendar.MINUTE);
		int samoa_second = samoa_time.get(Calendar.SECOND);
		
		// 0 = AM , 1 = PM
		int samoa_am_pm = samoa_time.get(Calendar.AM_PM);
		
		// DAY_OF_WEEK : ����
		int samoa_week = samoa_time.get(Calendar.DAY_OF_WEEK);
		
		// WEEK_OF_MONTH : ���° ���ΰ�
		int samoa_wom = samoa_time.get(Calendar.WEEK_OF_MONTH);
		
		// DAY_OF_WEEK_IN_MONTH : �̹� ������ �� ��° �����ΰ�?
		int samoa_dowim = samoa_time.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		
		System.out.printf("������ %d��° %s����\n",
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
			return "��";
			
		case Calendar.TUESDAY:
			return "ȭ";
			
		case Calendar.WEDNESDAY:
			return "��";
			
		case Calendar.THURSDAY:
			return "��";
			
		case Calendar.FRIDAY:
			return "��";
			
		case Calendar.SATURDAY:
			return "��";
			
		case Calendar.SUNDAY:
			return "��";
			
		default :
			return null;
		
		}
	}

}
