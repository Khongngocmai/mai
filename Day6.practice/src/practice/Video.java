package practice;

import java.util.Scanner;

public class Video extends Multimedia {

	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(String name, double duration) {
		super(name, duration);
		// TODO Auto-generated constructor stub
	}

	public void createVideo(Scanner sc) {
		super.createMultimedia(sc);
	}

	@Override
	public String toString() {
		return "Video [" +super.toString() + "]";
	}
	
	
}
