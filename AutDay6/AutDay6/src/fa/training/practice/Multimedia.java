package fa.training.practice;

import java.util.Scanner;

public class Multimedia {
	
	private String name;
	private double duration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
	public Multimedia() {
		
	}
	public Multimedia(String name, double duration) {
		super();
		this.name = name;
		this.duration = duration;
	}
	
	public void createMultimedia(Scanner sc) {
		System.out.println("Input name: ");
		this.name = sc.nextLine();
		System.out.println("Input duration: ");
		this.duration = Double.parseDouble(sc.nextLine());
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", duration=" + duration ;
	}
	
	
	
}
