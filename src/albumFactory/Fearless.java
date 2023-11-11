package albumFactory;

import java.util.ArrayList;
import java.util.List;

class Fearless implements Album {
    private List<String> songs;

    public Fearless() {
        songs = new ArrayList<>();
        songs.add("Fearless");
        songs.add("Fifteen");
        songs.add("Love Story");
        songs.add("Breathe");
        songs.add("Change");
    }

    @Override
    public List<String> getSongList() {
        return songs;
    }

    @Override
    public void play() {
        System.out.println("Now playing a song from the Fearless album.");
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