package day0428.exam;

public class Util {
	static String returnDate(String data) {
		
		String year=data.substring(0, 4);
		String month=data.substring(4, 6);
		String date=data.substring(6, 8);
		
		String dotDate=year+"."+month+"."+date;
		return dotDate;
	}
}
