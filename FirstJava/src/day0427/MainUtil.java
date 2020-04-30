package day0427;

public class MainUtil {

	public static void main(String[] args) {
		//3자리마다 콤마 추가
		int data = 1234567;
		DecimalForamt df = new DecimalForamt("#.##0");
		String comma = df.format(data);
		System.out.println(data + "--->" + comma);
	}

}
