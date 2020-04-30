package day0424.IfElse;

public class Hakjum {

	public static void main(String[] args) {
		
		int kor = 100; //국어
		int eng = 90; //영어
		int math = 30;	//수학
		System.out.print("국어=" + kor);
		System.out.print(" 영어=" + eng);
		System.out.println(" 수학=" + math);
		
		//시험 점수 함계, 평균
		int sum = kor + eng + math; //합계
		int avg = sum/3; //평균
		System.out.print("합계=" + sum);
		System.out.println(" 평균=" + avg);
		
		//학점
		char hakjum = 'F';
		if(avg >= 90) {
			hakjum = 'A';
		} else if(avg >= 80) {
			hakjum = 'B';
		} else if(avg >= 70) {
			hakjum = 'C';
		} else if(avg >= 60) {
			hakjum = 'D';
		} else {
			hakjum = 'F';
		}
		System.out.println("학점=" + hakjum);
	}

}
