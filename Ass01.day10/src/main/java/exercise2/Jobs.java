package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Jobs {

	List<Jobs>jobs = new ArrayList<>();
	
	
	private String employer;
	private Duration[] duration;
	
	private String title;
	private String description;
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public Duration[] getDuration() {
		return duration;
	}
	public void setDuration(Duration[] duration) {
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Jobs(String employer, Duration[] duration, String title, String description) {
		super();
		this.employer = employer;
		this.duration = duration;
		this.title = title;
		this.description = description;
	}
	
	
	
	
}
