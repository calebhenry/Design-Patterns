package adapter;

import java.util.ArrayList;

public class CD implements DigitalAlbum{
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs){
        this.songs = songs;
        currentIndex = -1;
    }
    public String playFromBegining(){
        currentIndex = 0;
        String ret = "Playing song 1 " + songs.get(currentIndex);
        currentIndex++;
        return ret;
    }
    public String playSong(int num){
        if((num>=0)&&(num<=songs.size())){
            currentIndex = num;
            String ret = "Playing " + songs.get(currentIndex) + ": ";
            currentIndex++;
            return ret;
        }
        return "Not a valid song number";
    }
    public String prevSong(){
        if((currentIndex-1)>0){
            currentIndex--;
            return "Skipping back and playing " + songs.get(currentIndex);
        }
        return playSong(0);
    }
    public String nextSong(){
        if(currentIndex<songs.size()){
            currentIndex++;
            return "Playing " + (currentIndex+1) + ": " + songs.get(currentIndex);
        }
        String ret = "Playing " + (currentIndex+1) + ": " + songs.get(currentIndex);
        currentIndex=0;
        return ret;
    }
    public String stop(){
        return "Pausing";
    }
    public String pause(){
        return "Stopping";
    }
}
