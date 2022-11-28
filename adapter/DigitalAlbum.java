package adapter;

/**
 * Contains the method stubs for every method an object of type DigitalAlbum should contain
 */
public interface DigitalAlbum {
    public String playFromBegining();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
