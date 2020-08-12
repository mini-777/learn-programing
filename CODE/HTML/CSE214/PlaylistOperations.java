package CSE214;

import java.util.Scanner;
import java.io.*;

public class PlaylistOperations extends Playlist{

	public PlaylistOperations(String title, String artist, int min, int sec) throws Exception {
		super(title, artist, min, sec);
	}

	public static void main(String[] args) throws Exception {
		
		Playlist bag1 = new Playlist();
		
		try {
			
			bag1 = (Playlist)bag1.clone();
		}
		catch(CloneNotSupportedException a){
			a.printStackTrace();
		}
		Scanner stdin = new Scanner(System.in);
		
		boolean finish = true;
		
		System.out.println("A) Add Song");
		System.out.println("B) Print Songs by Artist");
		System.out.println("G) Get Song");
		System.out.println("R) Remove Song");
		System.out.println("P) Print All Songs");
		System.out.println("S) Size");
		System.out.println("Q) Quit");
		
		
		
		
		while(finish) {
			System.out.print("\nSelect a menu option: ");
			String input = stdin.nextLine();
			
			
			
			//A 일때
			if(input.equals("A")) {
				System.out.print("\nEnter the song title: ");
				String title = stdin.nextLine();
				System.out.print("Enter the song artist: ");
				String artist = stdin.nextLine();
				System.out.print("Enter the song length (minutes): ");
				int m = stdin.nextInt();
				System.out.print("Enter the song length (seconds): ");
				int s = stdin.nextInt();
				System.out.print("Enter the position: ");
				int p = stdin.nextInt();
				bag1 = new Playlist(title, artist, m, s);
				bag1.addSong(bag1, p);
				System.out.println("Song Added: " + title + " By " + artist);
			}
			//B 일때
			if(input.equals("B")) {
				System.out.print("Enter the artist: ");
				String artist = stdin.nextLine();
				System.out.println(getSongsByArtist(bag1, artist).toString());
			}
			
			
			
			//G 일때
			if(input.equals("G")) {
				System.out.print("\nEnter the position: ");
				int position = stdin.nextInt();
				System.out.println(bag1.getSong(position).toString());
			}
			
			
			
			//R 일때
			if(input.equals("R")) {
				System.out.print("Enter the position: ");
				int position = stdin.nextInt();
				bag1.removeSong(position);
				System.out.println("Song Removed at position "+position);
				
			}
			
			
			//P 일때
			if(input.equals("P")) {
				for(int i=0;i<bag1.size(); i++) {
				System.out.printf(bag1.toString());
				
				}
			}
			
			
			//S 일때
			if(input.equals("S")) {
				System.out.println("There are "+bag1.size()+" song(s) in the current playlist.");
			}
			
			
			
			//Q 일때
			if(input.equals("Q")) {
				System.out.println("Program terminating normally...");
				break;
			}
	
		}
	}

}
