package MusicBox;

import java.util.HashSet;

public class MusicBox
{
    public CDPlayer cdPlayer ;
    public User user ;
    public HashSet<CD> cdSet ;
    public SongSelector SongSelector ; 
    
    public MusicBox(CDPlayer cdPlayer, User user , HashSet<CD> cdSet, SongSelector SongSelector)
    {
        this.cdPlayer = cdPlayer ;
        this.user = user ; 
        this.cdSet = cdSet ;
        this.SongSelector = SongSelector ;  
    }
    
    public Song getCurrentSong()
    {
        return SongSelector.getCurrentSong() ;
    }
    public void processorOneUser(User user)
    {
        this.user = user ;
    }
    

}