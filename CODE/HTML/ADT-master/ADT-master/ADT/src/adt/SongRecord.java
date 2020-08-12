package adt;

import exceptions.*;
public class SongRecord implements Cloneable {
	private String title;
	private String artist;
	private int minutes;
	private int seconds;
	public SongRecord(){
		this.title = null;
		this.artist = null;
		this.minutes = 0;
		this.seconds = 0;
	}
	public SongRecord(String title, String artist, int minutes, int seconds){
		this.title = title;
		this.artist = artist;
		try{
			this.minutes = minutes;
			if(this.minutes < 0)
				throw new NegtiveMininuteException("minutes cannot be negtive");
		}
		catch(NegtiveMininuteException e){
			System.out.println(e);
		}
		
		try{
			this.seconds = seconds;
			if(this.seconds < 0 || this.seconds > 59)
				throw new FaultSecondsException("seconds cannot be less than 0 or greater than 59");
		}
		catch(FaultSecondsException e){
			System.out.println(e);
		}
	}
	
	public Object clone() throws CloneNotSupportedException{
		SongRecord sr = (SongRecord) super.clone();
		return sr;
	}
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	public void setMins(int mins){
		try{
			this.minutes = mins;
			if(this.minutes < 0)
				throw new NegtiveMininuteException("minutes cannot be negtive");
		}
		catch(NegtiveMininuteException e){
			System.out.println(e);
		}
	}
	
	public void setSecs(int secs){
		try{
			this.seconds = secs;
			if(this.seconds < 0 || this.seconds > 59)
				throw new FaultSecondsException("seconds cannot be less than 0 or greater than 59");
		}
		catch(FaultSecondsException e){
			System.out.println(e);
		}
	}
	public String getTitle(){
		return this.title;
	}
	
	public String getArtist(){
		return this.artist;
	}
	
	public int getMins(){
		return this.minutes;
	}
	
	public int getSecs(){
		return this.seconds;
	}
	
	public String toString(){
		String str = String.format("%-25s%-25s%d:%02d", this.title,this.artist,this.minutes,this.seconds);
	    return str;
	}
	
	public static void main(String[] args){	
		SongRecord sr = new SongRecord("gangnam Style", "PSY", 4, 9);
		System.out.println(sr.toString());
	}
}
