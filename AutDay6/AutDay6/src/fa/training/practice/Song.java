package fa.training.practice;

import java.util.Scanner;

public class Song extends Multimedia {
	
	private String singer;
	
	public Song() {
		super();
	}

	public Song(String name, double duration, String singer) {
		super(name, duration);
		this.singer = singer;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public void createSong(Scanner sc) {
		super.createMultimedia(sc);
//		System.out.println("Input name: ");
//		this.setName(sc.nextLine());
//		
//		System.out.println("Input duration: ");
//		this.setDuration(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Input singer ");
		this.singer = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Song [ "+ super.toString() + " singer = "+ this.singer+"]" ;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Song s = new Song();
		
//		s.createSong(sc);
		
		System.out.println(s);
	}

}
