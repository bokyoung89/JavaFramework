package day0427.Static;

public class MainConvertUtil {

	public static void main(String[] args) {
		// ### substring() ###
		String data = "20191225";
		
		String year = data.substring(0,4); //0번째부터 4번째 전까지
		String month = data.substring(4,6);
		String date = data.substring(6,8);
		
		System.out.println("데이터 : " + data);
		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + date);
		System.out.println("년월일 : " + year + "-" + month +  "-" + date);
		
		// 변환 메소드
		String dashString = ConvertUtil.toDashString(data);
		System.out.println(data + " ---> " + dashString);
		
		String dotString = ConvertUtil.toDotString(data);
		System.out.println(data + " ---> " + dotString);
		

	}

}
