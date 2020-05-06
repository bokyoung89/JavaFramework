package day0506.ex6.Api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDate {

	public static void main(String[] args) {
		// ### 현재 날짜 구하기 ###
		// 포맷
		// M : 월(1~12)
		// m : 분(0~59)
		// D : 년의 일(1~365)
		// d : 월의 일(1~31)
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		//현재 날짜 구하기
		String todate1 = sdf1.format(new Date());
		System.out.println("todate1 = " + todate1);
		
		String todate2 = sdf2.format(new Date());
		System.out.println("todate2 = " + todate2);
		
		String todate3 = sdf3.format(new Date());
		System.out.println("todate3 = " + todate3);
		
		String todate4 = sdf4.format(new Date());
		System.out.println("todate4 = " + todate4);
	}
}
