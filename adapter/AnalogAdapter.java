package adapter;

/**
 * An adapter that allows a digital album object to be treated as a analog album object
 */
public class AnalogAdapter implements AnalogAlbum {
    DigitalAlbum album;
    /**
     * Creates an instance of analog adapter and sets its digital album instance variable to the supplied parameter
     * @param album
     */
    public AnalogAdapter(DigitalAlbum album){
        this.album = album;
    }

    /**
     * Sets the analog album method of play to call the digital album's next song method
     */
    public String play(){
        return album.nextSong();
    }

    /**
     * Sets the analog album method of rewind to call the digital album's prev song method
     */
    public String rewind(){
        return album.prevSong();
    }

    /**
     * Sets the analog album method of ffwd to call the digital album's next song method
     */
    public String ffwd(){
        return album.nextSong();
    }

    /**
     * Sets the analog album method of pause to call the digital album's pause method
     */
    public String pause(){
        return album.pause();
    }

    /**
     * Sets the analog album method of stop eject to call the digital album's stop method
     */
    public String stopEject(){
        return album.stop();
    }
}
