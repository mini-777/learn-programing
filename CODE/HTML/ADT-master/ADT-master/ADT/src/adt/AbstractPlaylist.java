package adt;


import java.util.ArrayList;


public abstract class AbstractPlaylist {
	protected final int MAX_NUM_SONG = 50;
	
	protected ArrayList<SongRecord> songRecords;
	
	public AbstractPlaylist(){
		songRecords = new ArrayList<SongRecord>();
	}
	
	public abstract boolean equals(Object obj);
	
	public abstract int size();
	
	public abstract void addSong(SongRecord song, int position);
	
	public abstract void removeSong(int position);
	
	public abstract SongRecord getSong(int position);
	
	public abstract void printAllSongs();
	
	//public abstract Playlist getSongsByArtist(Playlist originalList, String artist);
	
	public abstract String toString();
}
