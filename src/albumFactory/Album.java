package albumFactory;

import java.util.List;

public interface Album {

    void play();
    List<String> getSongList();
    void skipTrack();
    int getNumberOfTracks();
    String getSongTitle(int i);
}
