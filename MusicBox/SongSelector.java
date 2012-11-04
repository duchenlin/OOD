package MusicBox;

public class SongSelector {
	public Song currentSong ;
	
	public SongSelector(Song s)
	{
		this.currentSong = s ;
	}
	public void setCurrentSong(Song s)
	{
		this.currentSong = s ;
	}
	public Song getCurrentSong() {
		// TODO Auto-generated method stub
		return currentSong;
	}

}
