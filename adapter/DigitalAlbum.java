package adapter;

public interface DigitalAlbum {
    public String playFromBegining();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
