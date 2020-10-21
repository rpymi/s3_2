import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection {

    private ArrayList<Music> favorite;
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        favorite = new ArrayList<Music>();
        player = new MusicPlayer();
    }

    /**
     * Add a music to the collection.
     *
     * @param track1 The music to be added.
     */
    public void addMusic(Music track1){
        favorite.add(track1);
    }

    /**
     * remove a music from collection
     * @param index place of the music in the list which will be removed
     */
    public void removeMusic(int index){
        favorite.remove(index);
    }

    /**
        @return the number of songs in the list
     */
    public int getNumberOfMusic() {
        return favorite.size();
    }



    /**
     * Start playing a music in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the music to be played.
     */
    public void startPlaying(int index) {
        if(!validIndex(index)){
            System.out.println("An invalid Index");
        }
        else {
            player.startPlaying(favorite.get(index));
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * search the song and find it's singer
     * @param track1
     */
    public void search(String track1){
        for(int i = 0; i < favorite.size(); i++){
            if(track1.equals(favorite.get(i).getMusicName())){
                System.out.println("Singer: " + favorite.get(i).getSinger() +
                        "  Released in: " + favorite.get(i).getReleaseDate());
            }
        }
    }
    /**
     * print the list of favorite musics
     */
    public void print(){
        for (int i = 0; i < favorite.size(); i++){
            System.out.println("Song: " + favorite.get(i).getMusicName() + "  Singer: " + favorite.get(i).getSinger() +
                    "  Released in: " + favorite.get(i).getReleaseDate());
        }
    }
    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {

        if((favorite.size() < index) && (index < 0) ){
                return false;
        }

        return true;
    }

}