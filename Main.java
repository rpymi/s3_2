import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        Music track1 = new Music("hello", "Adele", "2015");
        Music track2 = new Music("Peace", "Sam Smith", "2017");
        Music track3 = new Music("bohemian rhapsody", "Queen", "1975");
        Music track4 = new Music("Say you Say me", "Lionel Richie", "1986");
        Music track5 = new Music("Not today", "Imagin dragons", "2017");
        Music track6 = new Music("Night call", "London grammar", "2013");
        pop.addMusic(track1);
        pop.addMusic(track2);
        pop.addMusic(track3);
        pop.addMusic(track5);
        rock.addMusic(track3);
        jazz.addMusic(track4);
        country.addMusic(track6);
        System.out.println("Musics: ");
        pop.print();
        jazz.print();
        rock.print();
        country.print();

        pop.removeMusic(0);
        System.out.println("After removing a song: ");
        pop.print();
        jazz.print();
        rock.print();
        country.print();
        System.out.println("Searching: ");
        pop.search("Peace");
    }
}
