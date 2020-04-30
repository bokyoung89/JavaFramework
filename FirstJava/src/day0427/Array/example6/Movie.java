package day0427.Array.example6;

public class Movie {
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private Actor[] actors;
	
	public Movie() {
		
	}
	
	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}
	
	public Movie(String director, int runningTime) {
		this.director = director;
		this.runningTime = runningTime;
	}
	
	public Movie(String title, String category, String director, int runningTime, Actor[] actors) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.runningTime = runningTime;
		this.actors = actors;
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
		category = category;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		director = director;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		runningTime = runningTime;
	}
	
	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}
	
	public void printActors() {
		System.out.println("------ Actor Information ------");
		for(int i=0;i<actors.length;i++) {
			System.out.print((i+1) + ".");
			actors[i].printInfo();
			}
		}

	public void printInfo() {
		System.out.println("------ Movie Information ------");
		System.out.print("title : " + title);
		System.out.print("category : " + category);
		System.out.print("director : " + director);
		System.out.println("runnigTime : " + runningTime);
		System.out.println();
		printActors();
	}
	

}
