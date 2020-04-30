package day0424.Score;

public class Hakjum {
	
	int kor;
	int eng;
	int math;
	int sum;
	int avg;
	char hakjum;
	
	public Hakjum() {                                                                                                                     
	}
	
	public Hakjum(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;	
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void doHakjum() {
		sum = kor + eng + math; //합계
		avg = sum/3; //평균
		hakjum = 'F';
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
	}
	public void printInfo() {
		System.out.println("----Hakjum Informaiton----");
		System.out.println("국어=" + kor);
		System.out.println("영어=" + eng);
		System.out.println("수학=" + math);
		System.out.println("합계=" + sum);
		System.out.println("평균=" + avg);
		System.out.println("학점=" + hakjum);
	}
}
