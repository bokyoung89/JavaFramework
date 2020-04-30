package day0428.exam;

public class MusicChart {

	private Song[] songArray; //song 클래스에서 사용한다는 뜻
	
	public MusicChart(Song[] songArray) {
		this.songArray = songArray;
	}

	public Song[] getSongArray() {
		return songArray;
	}

	public void setSongArray(Song[] songArray) {
		this.songArray = songArray;
	}

	public void printMusicChart() {
		System.out.println("------ㅡ Music Chart ------");
		for(int i=0;i<songArray.length;i++) {
			System.out.print((i+1)+"."+"\n");
			songArray[i].printInfo();
		}
	}
}