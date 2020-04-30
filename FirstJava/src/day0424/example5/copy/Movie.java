package day0424.example5.copy;

public class Movie {
	String title;
	String category;
	String director;
	int runningTime;
	Actor actor;
	
	public Movie(String title, String category, String director, int runningTime, Actor actor) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actor = actor;
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

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	public void printInfo() {
		System.out.println("------Movie Information------");
		System.out.print("[영화 제목 : " + title + "] ");
		System.out.print("[장르 : " + category +"] ");
		System.out.print("[감독 : " + director + "] ");
		System.out.print("[러닝 타임 : " + runningTime + "] ");
		System.out.print("[배우 : " + actor + "]");
	}
}
