package day0424.example5;

public class Movie {
	private String title;
	private String Category;
	private String Director;
	private int RunningTime;
	private Actor actor; // private String actor;
	
	public Movie() {
		
	}
	
	public Movie(String title, String Category) {
		this.title = title;
		this.Category = Category;
	}
	
	public Movie(String Director, int RunningTime) {
		this.Director = Director;
		this.RunningTime = RunningTime;
	}
	
	public Movie(String title, String Category, String Director, int RunningTime, Actor actor) {
		this.title = title;
		this.Category = Category;
		this.Director = Director;
		this.RunningTime = RunningTime;
		this.actor = actor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public int getRunningTime() {
		return RunningTime;
	}

	public void setRunningTime(int runningTime) {
		RunningTime = runningTime;
	}
	
	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public void printInfo() {
		System.out.println("--------Movie Information----------");
		System.out.println("title : " + title);
		System.out.println("Category : " + Category);
		System.out.println("director : " + Director);
		System.out.println("RunnigTime : " + RunningTime);
		actor.printInfo();
		//System.out.println("actor : " + actor);
	}
}
