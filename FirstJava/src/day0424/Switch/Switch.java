package day0424.Switch;

public class Switch {

	public static void main(String[] args) {
		int data = 7;
		switch(data) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		default:
			System.out.println("default");
		}
		
		String data1 = "hello";
		switch(data1) {
		case "hello":
			System.out.println("case1");
			break;
		case "world":
			System.out.println("case2");
			break;
		default:
			System.out.println("default");
		}
		
		int kor = 100; //국어
		int eng = 90; //영어
		int math =80;	//수학
		System.out.print("국어=" + kor);
		System.out.print(" 영어=" + eng);
		System.out.println(" 수학=" + math);
		
		//시험 점수 함계, 평균
		int sum = kor + eng + math; //합계
		int avg = sum/3; //평균
		System.out.print("합계=" + sum);
		System.out.println(" 평균=" + avg);
		
		char hakjum = 'F';
		int avgdata = avg/10; //몫
		switch(avgdata) {
		case 10:
			hakjum = 'A';
			break;
		case 9:
			hakjum = 'B';
			break;
		case 8:
			hakjum = 'C';
			break;
		case 7:
			hakjum = 'D';
			break;
		default:
			hakjum = 'F';
		}
		System.out.println("학점=" + hakjum);
	}
}
