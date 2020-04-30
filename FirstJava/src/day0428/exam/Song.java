package day0428.exam;

import day0427.Static.ConvertUtil;

public class Song {
	private String title;
	private String singer;
	private String album;
	private String composer;
	private String songWriter;
	private String date;
	
	public Song(String title, String singer, String album, String composer, String songWriter, String date ) {
		this.title = title;
		this.singer = singer;
		this.album =album;
		this.composer = composer;
		this.songWriter = songWriter;
		this.date=date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getSongWriter() {
		return songWriter;
	}

	public void setSongWriter(String songWriter) {
		this.songWriter = songWriter;
	}

	
	public String getDate() {
		return date;
	}

	public void setDate(String Date) {
		this.date = date;
	}

	public void printInfo() {
		System.out.println("제목=" + title);
		System.out.println("가수=" + singer);
		System.out.println("앨범=" + album);
		System.out.println("작곡가=" + composer);
		System.out.println("작사가=" + songWriter);
		System.out.println("발매일=" + Util.returnDate(date));
	}
}
