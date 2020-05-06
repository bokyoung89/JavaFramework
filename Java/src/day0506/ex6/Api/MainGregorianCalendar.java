package day0506.ex6.Api;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainGregorianCalendar {

	public static void main(String[] args) {
		
		//Calendar c = new GregorianCalendar();
		//GregorianCalendar c = new GregorianCalendar();
		//얻는다.
		
		GregorianCalendar c = new GregorianCalendar(); //시스템 시간을 얻는다.
		int yearint = c.get(Calendar.YEAR);
		int monthint = c.get(Calendar.MONTH);	//0~11
		int dateint = c.get(Calendar.DATE);
		int hourint = c.get(Calendar.HOUR_OF_DAY);
		int minuteint = c.get(Calendar.MINUTE);
		int secondint = c.get(Calendar.SECOND);
		
		System.out.println("년=" + yearint);
		System.out.println("월=" + monthint);
		System.out.println("일=" + dateint);
		System.out.println("시=" + hourint);
		System.out.println("분=" + minuteint);
		System.out.println("초=" + secondint);
	}
}
