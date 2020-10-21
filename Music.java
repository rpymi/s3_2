import java.util.ArrayList;
import java.util.Iterator;

public class Music {
    String musicName;
    String singer;
    String releaseDate;
    public Music(String mName, String sName, String rDate){
        musicName = mName;
        singer = sName;
        releaseDate = rDate;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
