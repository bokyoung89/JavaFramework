package day0507.ex03.ListEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
	
	public static String thisTimeToDotDate() {
		
		String result;
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		result = sdf.format(cal.getTime());
		
		return result;
	}

}
