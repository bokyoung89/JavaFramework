package day0428.MethodOverriding.exam1;

import java.text.DecimalFormat;

public class Util {
		public static String getDecimalComma(int data) {
			DecimalFormat df=new DecimalFormat("##,##0");
			String comma=df.format(data);
			return comma;
	}
}
