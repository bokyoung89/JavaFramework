package day0422.example4;

public class Song {
	
	//인포메이션 하이딩 : private 추가 -> 동일 클래스 내부에서만 사용 가능. 직접 접근을 막음.
	private String title;//노래제목
	String singer;//가수
	int time;//노래시간
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public String getTitle() {
		return title;
	}
	public void setSinger(String newSinger) {
		singer = newSinger;
	}
	public String getSinger() {
		return singer;
	}
	public void setTime(int newTime) {
		time = newTime;
	}
	public int getTime() {
		return time;
	}
}
