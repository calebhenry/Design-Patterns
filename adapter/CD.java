package adapter;

import java.util.ArrayList;

/**
 * CD is a type of digital album, and naturally can use all of its methods
 */
public class CD implements DigitalAlbum{
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Creates an instance of CD and sets its list of songs to the instance variable
     * @param songs
     */
    public CD(ArrayList<String> songs){
        this.songs = songs;
        currentIndex = -1;
    }

    /**
     * Starts at the beggining and plays the first song, then advances the current index 1
     */
    public String playFromBegining(){
        currentIndex = 0;
        String ret = "Playing song 1 " + songs.get(currentIndex);
        currentIndex++;
        return ret;
    }

    /**
     * Plays the the song at the given index, then advances the current index 1
     */
    public String playSong(int num){
        if((num>=0)&&(num<=songs.size())){
            currentIndex = num;
            String ret = "Playing " + songs.get(currentIndex) + ": ";
            currentIndex++;
            return ret;
        }
        return "Not a valid song number";
    }

    /**
     * Moves the current index back one as long as there are songs left to go back to
     */
    public String prevSong(){
        if(currentIndex>0){
            currentIndex--;
            return "Skipping back and playing " + songs.get(currentIndex);
        }
        currentIndex = 0;
        return playSong(currentIndex);
    }

    /**
     * Moves the current index to the next song, and when the last song is reaches it moves back to the first song
     */
    public String nextSong(){
        if(currentIndex<songs.size()){
            currentIndex++;
            return "Playing " + (currentIndex+1) + ": " + songs.get(currentIndex);
        }
        String ret = "Playing " + (currentIndex+1) + ": " + songs.get(currentIndex);
        currentIndex=0;
        return ret;
    }

    /**
     * Stops the CD
     */
    public String stop(){
        return "Stopping";
    }

    /**
     * Pauses the CD
     */
    public String pause(){
        return "Pausing";
    }
}
