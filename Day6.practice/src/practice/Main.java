package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Multimedia> lst = new ArrayList<>(); // lst {Video, Song}
//		int[] arr = new int[10];
//		arr[0] = 1;
		
		Video video = new Video();
		video.createVideo(sc);
		lst.add(video);
		
		Song song = new Song();
		song.createSong(sc);
		lst.add(song);
		
		lst.add(video);
		
		System.out.println(lst.size());
		
		for( Multimedia multimedia : lst) {
			System.out.println(multimedia);
		}
		
	}

}
