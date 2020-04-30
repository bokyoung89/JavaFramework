package day0427.Array.example5.exam;

public class Movie {
	private String title;
	private String category;
	private String director;
	private int runningTime;
	private String[] actors; // private String actor;
	
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
	
	public Movie(String title, String category, String director, int runningTime, String[] actors) {
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
	
	public String[] getActors() {
		return actors;
	}

	public void setActors(String[] actors) {
		this.actors = actors;
	}
	
	public void actorInfo() {
		System.out.print("배우=[");
			for(int i=0;i<actors.length;i++) {
				System.out.print(actors[i]);
				if((i+1)<actors.length) {
					System.out.print(",");
				}
			}
			System.out.println("]");
	}

	public void printInfo() {
		System.out.println("--------Movie Information----------");
		System.out.println("title : " + title);
		System.out.println("category : " + category);
		System.out.println("director : " + director);
		System.out.println("runnigTime : " + runningTime);
		actorInfo();
		
	}
}
