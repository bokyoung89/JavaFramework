package day0507.ex03.ListEx;

import java.text.DecimalFormat;

	public class DecimalUtil {
		public static String getDecimalComma(int totalPrice) {
			DecimalFormat df=new DecimalFormat("##,##0");
			String comma=df.format(totalPrice);
			return comma;
}
	

}
