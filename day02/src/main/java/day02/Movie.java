package day02;

public class Movie {

	String name;
	String runningTime;
	String actor;
	
	
	
	public Movie(String name, String runningTime, String actor) {
		super();
		this.name = name;
		this.runningTime = runningTime;
		this.actor = actor;
	}



	@Override
	public String toString() {
		return "Movie [name=" + name + ", runningTime=" + runningTime + ", actor=" + actor + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRunningTime() {
		return runningTime;
	}



	public void setRunningTime(String runningTime) {
		this.runningTime = runningTime;
	}



	public String getActor() {
		return actor;
	}



	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
	
	
}
