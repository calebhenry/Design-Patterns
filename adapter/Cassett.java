package adapter;

import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;
    public Cassett(ArrayList<String> songs){
        this.songs = songs;
        currentIndex = 0;
    }

    public String play(){
        if(currentIndex<songs.size()){
            String ret = "Playing song " + (currentIndex+1) + ": " + songs.get(currentIndex);
            currentIndex++;
            return ret;
        }
        return "At the end of the cassette you need to rewind";
    }

    public String rewind(){
        if((currentIndex-1)>0){
            currentIndex--;
            return "Rewinding to song " + (currentIndex+1);
        }
        return "Fully Re-wound";
    }

    public String ffwd(){
        if((currentIndex+1)<songs.size()){
            currentIndex++;
            return "Forward to song " + (currentIndex+1);
        }
        return "Forwarded to the end of the cassette";
    }

    public String pause(){
        return "Pausing";
    }

    public String stopEject(){
        return "Stopping cassette and ejecting";
    }
}
