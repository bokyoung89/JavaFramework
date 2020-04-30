package day0424.Score;

public class MainHakjum {

	public static void main(String[] args) {
		int korean = 96;
		int english = 80;
		int math = 76;
		
		Hakjum h1 = new Hakjum(korean, english, math);
		h1.doHakjum(); //학점 계산 메소드 (합계, 평균, 학점)
		h1.printInfo(); //학점 정보 출력
		//학점 수정
		h1.setKor(60);
		h1.setEng(100);
		h1.doHakjum();	//학점 계산 메소드
		h1.printInfo();
	}
}
