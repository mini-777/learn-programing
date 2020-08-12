package CSE214;

public class SongRecord {
	
	private String title, artist;
	private int min, sec;
	
	
	public SongRecord(String title, String artist, int min, int sec) throws Exception{
		setTitle(title);
		setArtist(artist);
		setMin(min);
		setSec(sec);
		if(0>sec||sec>59) {
			throw new IndexOutOfBoundsException("can not be that second");
		}

	}
	

	public SongRecord() {
	}


	public void setTitle(String title) {
	title = this.title;
	}
	public void setArtist(String artist) {
		artist= this.artist;
		}
	public void setMin(int min) {
		min = this.min;
	}
	public void setSec(int sec) {
		sec=this.sec;
	}
	public String getTitle() {
		return this.title;
	}
	public String getArtist() {
		return artist;
	}
	public int getMin() {
		return min;
	}
	public int getSec() {
		return sec;
	}
	public String toString() {
		String str = String.format("%-25s%-25s%d:%02d", this.title,this.artist,this.minutes,this.seconds);
	    return str;
	}
}
