package adt;


import java.io.*;
import java.util.Scanner;

public class PlaylistOperation {
	

	public static void main(String args[]) throws IOException
	{
		Playlist pl = new Playlist();
		String choice;
		
		do{
			System.out.println("Add Song: A <Title> <Artist> <Minutes> <Seconds> <Position>");
			System.out.println("Get Song: G <Position>");
			System.out.println("Remove Song: R <Position>");
			System.out.println("Print All Songs: P");
			System.out.println("Print Songs By Artist: B <Artist>");
			System.out.println("Size: S");
			System.out.println("Quit: Q");
			
			
			
	    	InputStreamReader isr=new InputStreamReader(System.in);
	    	BufferedReader br=new BufferedReader(isr);
	        choice = br.readLine().toUpperCase();
		    String title = null;
		    String artist = null;
		    int mins = 0;
		    int secs = 0;
		    int position = 0;
		    
		    switch(choice){
		    case "A" :
		    	System.out.print("input title:\n");
		    	isr=new InputStreamReader(System.in);
		    	br=new BufferedReader(isr);
		    	 title = br.readLine();
		    	
		    	 System.out.print("input artist:\n");
		    	 isr=new InputStreamReader(System.in);
		    	 br=new BufferedReader(isr);
		    	 artist = br.readLine();
		    	
		    	System.out.print("input minute:\n");
		    	isr=new InputStreamReader(System.in);
		    	br=new BufferedReader(isr);
		    	mins = Integer.parseInt(br.readLine());
		    	System.out.print("input seconds:\n");
		    	isr=new InputStreamReader(System.in);
		    	br=new BufferedReader(isr);
		    	secs = Integer.parseInt(br.readLine());
		    	System.out.print("input position:\n");
		    	isr=new InputStreamReader(System.in);
		    	br=new BufferedReader(isr);
		    	position = Integer.parseInt(br.readLine());
		    	SongRecord song = new SongRecord(title, artist, mins, secs);
		    	pl.addSong(song, position);
		    	break;
		    case "G" :
		    	System.out.print("input position:\n");
		    	isr=new InputStreamReader(System.in);
		    	br=new BufferedReader(isr);
		    	position = Integer.parseInt(br.readLine());
		    	SongRecord sr = pl.getSong(position);
		    	if(sr == null){
		    		System.out.println("get song failed.");
		    		break;
		    	}
		    	System.out.println(sr.toString());
		    	break;
		    case "R" :
		    	System.out.print("input position:\n");
		    	isr=new InputStreamReader(System.in);
		    	br=new BufferedReader(isr);
		    	position = Integer.parseInt(br.readLine());
		    	pl.removeSong(position);
		    	break;
		    case "P" :
		    	pl.printAllSongs();
		    	break;
		    case "B" :
		    	System.out.print("input artist:\n");
		    	isr=new InputStreamReader(System.in);
		    	br=new BufferedReader(isr);
		    	artist = br.readLine();
		    	Playlist npl = pl.getSongsByArtist(pl, artist);
		    	if(npl == null || npl.size() == 0){
		    		System.out.println("Print songs by Artist failed, no such artist in the Playlist");
		    	    break;
		    	}
		    	npl.printAllSongs();
		    	break;
		    case "S" :
		    	System.out.println(pl.size());
		    	break;
		    default:
		    	if(!choice.equals("Q")){
		    		System.out.println("you entered a valid command");
		    	}else{
		    		System.out.println("Succesfully Exit");
		    	}
		    }
		    
		}while(!choice.equals("Q"));	
		
		
	}	
}



