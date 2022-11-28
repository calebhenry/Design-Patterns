package adapter;

import java.util.ArrayList;

/**
 * Cassett is a type of analog album, and naturally can use all of its methods
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Creates an instance of cassett and sets its list of songs to the supplied parameter
     * @param songs
     */
    public Cassett(ArrayList<String> songs){
        this.songs = songs;
        currentIndex = 0;
    }

    /**
     * Plays the current song and then increments the song to the next in the list of songs, stopping at the last song
     */
    public String play(){
        if(currentIndex<songs.size()){
            String ret = "Playing song " + (currentIndex+1) + ": " + songs.get(currentIndex);
            currentIndex++;
            return ret;
        }
        return "At the end of the cassette you need to rewind";
    }

    /**
     * Rewinds to the previous song, stopping at the first song
     */
    public String rewind(){
        if((currentIndex-1)>0){
            currentIndex--;
            return "Rewinding to song " + (currentIndex+1);
        }
        return "Fully Re-wound";
    }

    /**
     * Skips a song by moving the song index forward 1
     */
    public String ffwd(){
        if((currentIndex+1)<songs.size()){
            currentIndex++;
            return "Forward to song " + (currentIndex+1);
        }
        return "Forwarded to the end of the cassette";
    }

    /**
     * Pauses the cassett
     */
    public String pause(){
        return "Pausing";
    }

    /**
     * Stops the cassett
     */
    public String stopEject(){
        return "Stopping cassette and ejecting";
    }
}
