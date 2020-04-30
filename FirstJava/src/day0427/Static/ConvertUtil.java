package day0427.Static;

public class ConvertUtil {
	public static String toDashString(String data) {
		String result;
		String year = data.substring(0,4); // 0번째부터 4번째 전까지
		String month = data.substring(4,6);
		String date = data.substring(6,8);	// 4번째부터 6번째 전까지
		result = year + "-" + month + "-" + date; // 6번째부터 8번째 전까지
		return result;
	}
	
	public static String toDotString(String data) {
		String result;
		String year = data.substring(0,4); //0번째부터 4번째 전까지
		String month = data.substring(4,6);
		String date = data.substring(6,8);
		result = year + "." + month + "." + date;	
		return result;
	}
	
	
	
	

}
