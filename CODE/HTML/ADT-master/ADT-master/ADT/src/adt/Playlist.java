package adt;

import java.util.ArrayList;

import exceptions.*;
public class Playlist extends AbstractPlaylist implements Cloneable{

	public Playlist(){
		super();
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Playlist newPl = new Playlist();
		newPl = (Playlist) super.clone();
		ArrayList<SongRecord> sr = new ArrayList<SongRecord>();
		newPl.setSongRecord(sr);
		for(int i = 0; i < this.songRecords.size(); i++){
			sr.add((SongRecord)this.songRecords.get(i).clone());
		}
		
		return newPl;
	}
	public void setSongRecord(ArrayList<SongRecord> sr){
		this.songRecords = sr;
	}
	@Override
	public boolean equals(Object obj) {
		Playlist pl;
		if(!(obj instanceof Playlist) || obj == null){
			return false;
		}
		if(obj instanceof Playlist){
			pl = (Playlist)obj;
			if(songRecords.size() != pl.songRecords.size())
				return false;
			for(int i = 0; i < songRecords.size(); i++){
				if(songRecords.get(i).getTitle() != pl.songRecords.get(i).getTitle())
					return false;
				if(songRecords.get(i).getArtist() != pl.songRecords.get(i).getArtist())
					return false;
				if(songRecords.get(i).getMins() != pl.songRecords.get(i).getMins())
					return false;
				if(songRecords.get(i).getSecs() != pl.songRecords.get(i).getSecs())
					return false;
				
			}
		}
		return true;
	}

	@Override
	public int size() {
		try{
			if(songRecords == null)
				throw new FullPlaylistException(" Playlist is empty!");
		}catch(FullPlaylistException e){
			System.out.println(e);
			return Integer.MIN_VALUE;
		}
		return songRecords.size();
	}

	@Override
	public void addSong(SongRecord song, int position) {
		try{
			if(songRecords.size() == MAX_NUM_SONG)
				throw new FullPlaylistException("add song failed. Playlist is full!");
		}catch(FullPlaylistException e){
			System.out.println(e);
			return;
		}
		
		try{
			if(position < 1 || position > songRecords.size() + 1)
				throw new exceptions.IllegalArgumentException("add song failed. position is in a valid range");
		}catch(exceptions.IllegalArgumentException e){
			System.out.println(e);
			return;
		}
		songRecords.add(position - 1, song);
		System.out.println("add song sucessfull");
	}
	
	public void addSong(SongRecord song){
		try{
			if(songRecords.size() == MAX_NUM_SONG)
				throw new FullPlaylistException("add song failed. Playlist is full!");
		}catch(FullPlaylistException e){
			System.out.println(e);
		}
		
		songRecords.add(song);
	}

	@Override
	public void removeSong(int position) {
		try{
			if(position < 1 || position > songRecords.size())
				throw new exceptions.IllegalArgumentException("remove song failed. position is in a valid range");
		}catch(exceptions.IllegalArgumentException e){
			System.out.println(e);
			return;
		}
		try{
			if(songRecords == null || songRecords.size() == 0)
				throw new EmptyPlaylistException("remove song failed, playlist is empty!");
		}catch(EmptyPlaylistException e){
			System.out.println(e);
			return;
		}
		songRecords.remove(position - 1);
		System.out.println("remove song succesfull.");
		
	}

	@Override
	public SongRecord getSong(int position) {
		try{
			if(position < 1 || position > songRecords.size())
				throw new exceptions.IllegalArgumentException("get song failed. position is in a valid range");
		}catch(exceptions.IllegalArgumentException e){
			System.out.println(e);
			return null;
		}
		try{
			if(songRecords == null || songRecords.size() == 0)
				throw new EmptyPlaylistException("get song failed, playlist is empty!");
		}catch(EmptyPlaylistException e){
			System.out.println(e);
			return null;
		}
		
		return songRecords.get(position - 1);
	}

	@Override
	public void printAllSongs() {
		try{
			if(songRecords == null || songRecords.size() == 0)
				throw new EmptyPlaylistException("print all songs failed, playlist is empty!");
		}catch(EmptyPlaylistException e){
			System.out.println(e);
		}
		//System.out.println(songRecords.get(0).toString());
		for(int i = 0; i < songRecords.size(); i++){
			System.out.printf("%-5d%s\n",i+1, songRecords.get(i).toString());
		}
		
	}

	
	public Playlist getSongsByArtist(Playlist originalList, String artist) {
		try{
			if(songRecords == null || songRecords.size() == 0)
				throw new EmptyPlaylistException("get songs by artist failed, playlist is empty!");
		}catch(EmptyPlaylistException e){
			System.out.println(e);
		}
		
		Playlist pl = new Playlist();
		for(int i = 0; i < songRecords.size(); i++){
			if(songRecords.get(i).getArtist() == artist)
				pl.addSong(songRecords.get(i));
		}
		
		return pl;
	}

	@Override
	public String toString() {
		try{
			if(songRecords == null || songRecords.size() == 0)
				throw new EmptyPlaylistException("playlist is empty!");
		}catch(EmptyPlaylistException e){
			System.out.println(e);
		}
		
		String s = "";
		for(int i = 0; i < songRecords.size(); i++){
			s += String.format("%-5d%s\n", i + 1, songRecords.get(i).toString());
	}
		return s;	
}
	
	public static void main(String[] args) throws CloneNotSupportedException{
		Playlist pl = new Playlist();
		SongRecord sr = new SongRecord("i'm yours", "jason marze", 3, 45);
		SongRecord nsr = new SongRecord("chen", "chen", 4, 20);
		pl.songRecords.add(sr);
		pl.songRecords.add(nsr);
		
		Playlist pl2 = (Playlist)pl.clone();
		pl2.songRecords.get(1).setArtist("huahua");
		pl.printAllSongs();
		pl2.printAllSongs();
		
		System.out.println(pl.equals(pl2));	
	}	
}