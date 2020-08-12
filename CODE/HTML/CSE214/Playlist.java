package CSE214;

public class Playlist extends SongRecord implements Cloneable{

	private static final int max_size = 50;
	private static int counter = 0;
	private int maxSize;
	private Object[] bag;
	
	private String title, artist;
	private int min, sec;
	public Playlist() {
		this.maxSize = max_size;
		this.bag = new Object[this.maxSize];
	}
	
	
	public Playlist(String title, String artist, int min, int sec) throws Exception {
		super(title, artist, min, sec);
		this.title = title;
		this.artist = artist;
		this.min = min;
		this.sec = sec;
		this.maxSize = max_size;
		this.bag = new Object[this.maxSize];
	}

	
	public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
		
	public boolean equals(Object obj) {
		Playlist a = (Playlist)obj;
		return this.bag == a.bag;
	}
	public int size() {
		return Playlist.counter;
	}

	public void addSong(SongRecord song, int position){
		Object[] temp = new Object[max_size];
		if(this.bag[position]!= null) {
			for(int i=position ; i<bag.length;i++) {
				temp[i+1] = bag[i];
				temp[position] = song;
			}
			for(int i=0;i<temp.length;i++) {
				
			}
		}
			Playlist.counter++;
			

//		}
	}
	
	
	
	public void removeSong(int position) throws Exception {
		//범위에 없을때
		
			try {
				if(bag[position]==null);
			}
			catch(IllegalArgumentException e){
				e.printStackTrace();
				System.out.println("No song at position "+position+" to remove.");
			}
		for(int i=0; i< position;i++) {
//			if(this.bag[i] !=null && this.bag[i].equals(position)) {
				this.bag[i] = null;
				for(int j=i; j<position-1;j++) {
					this.bag[j] = this.bag[j+1];
				}
				this.bag[position] = null;
				Playlist.counter--;
//			}
		}
	}
	
	
	
	
	
	public SongRecord getSong(int position) {
		try {
			if(bag[position] == null);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		}
		return (SongRecord)bag[position];
	}
	
	
	
	
	
	public void printAllSongs() {
		for(int i=0; i< Playlist.counter; i++) {
			System.out.println(bag[i].toString());
		}
	}
	
	
	
	public static Playlist getSongsByArtist(Playlist originalList, String artist) {
		int counting =0;
		if(originalList == null || artist == null) {
			return null;
		}
		for(int i=0; i<max_size;i++) {
			if(artist.equals(originalList.artist)) {
				counting++;
				System.out.println(counting+ originalList.toString());
			}
		}
		return originalList;

	}
	
	public String toString() {
		return String.format("%-10s%-21s%-26s%19s:%02d\n", size(),this.title, this.artist, this.min,this.sec);
	}
}
