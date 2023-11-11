package albumFactory;

import java.util.ArrayList;
import java.util.List;

class SpeakNow implements Album {
    private List<String> songs;

    public SpeakNow() {
        songs = new ArrayList<>();
        songs.add("Mine");
        songs.add("Sparks Fly");
        songs.add("Back to December");
        songs.add("Speak Now");
        songs.add("Dear John");
    }

    @Override
    public List<String> getSongList() {
        return songs;
    }

    @Override
    public void play() {
        System.out.println("Now playing a song from the Speak Now album.");
    }

    @Override
    public void skipTrack() {
        // TODO Auto-generated method stub

    }

    @Override
    public int getNumberOfTracks() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getSongTitle(int i) {
        // TODO Auto-generated method stub
        return null;
    }
}