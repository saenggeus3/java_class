package myobj.tmp;

import java.text.SimpleDateFormat;
import java.util.Date;



public class clock {
	
	static SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	static Date systemTime = new Date();
	static String time;
	
	int width;
	int height;
	String color;
	
	
	static {
		time = format1.format(systemTime);
	}
	
	public clock() {
		
	}
	
	
	
	
	
	
	
	
	
	public static void resetTime(){
		
		
		time = format1.format(systemTime);
	}
	
	public static void printTime() {
		System.out.println(time);
	}
	
	
	
	
	
	

}


