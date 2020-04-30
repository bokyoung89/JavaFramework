package day0428.exam;

public class MainSong {

	public static void main(String[] args) {
		Song[] songArray = new Song[3];
		songArray[0] = new Song("빔편지", "아이유", "밤편지","김희원", "아이유", "20190324");
		songArray[1] = new Song("첫눈처럼 너에게 가겠다", "에일리", "도깨비 ost","로코베리", "이미나", "20190324");
		songArray[2] = new Song("You are my everything", "거미", "태양의 후예 OST","개미", "지훈", "20160301");
		songArray[0].printInfo();
		
		MusicChart mc = new MusicChart(songArray);
		mc.printMusicChart();
	}

}
