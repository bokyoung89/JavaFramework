package day0423.example5;

public class Movie {
	String title; //영화제목
	String category;
	String director; //감독
	int runningTime; //배우
	
	public Movie() {
		
	}
	public Movie(String category, String title) {
		this.category = category;
		this.title = title;
	}
	public Movie(String category, String title, String director, int runningTime) {
		this.category = category;
		this.title = title;
		this.director = director;
		this.runningTime = runningTime;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	public void printInfo() {
		System.out.println("Movie Information ----");
		System.out.print("title=[" + title + "] ");
		System.out.print("category=[" + category + "] ");
		System.out.print("director=[" + director + "] ");
		System.out.println("runningTime=[" + runningTime + "](분)");
	}
	
	
	
	
	

}
