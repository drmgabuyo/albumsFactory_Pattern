package albumFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an album:");
        System.out.println("1. Fearless");
        System.out.println("2. Speak Now");

        int albumChoice = scanner.nextInt();
        Album album = createAlbum(albumChoice);

        System.out.println("Choose a song from the album:");

        displaySongs(album);

        int songChoice = scanner.nextInt();
        String selectedSong = getSongTitle(album, songChoice);

        System.out.println("Choose an action:");
        System.out.println("1. Play Song");
        System.out.println("2. Skip Song");

        int actionChoice = scanner.nextInt();

        switch (actionChoice) {
            case 1:
                System.out.println("Playing the song: " + selectedSong);
                album.play();
                break;
            case 2:
                System.out.println("Skipping the song: " + selectedSong);
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                System.exit(1);
        }

        scanner.close();
    }

    private static Album createAlbum(int choice) {
        switch (choice) {
            case 1:
                return new Fearless();
            case 2:
                return new SpeakNow();
            default:
                System.out.println("Invalid album choice. Exiting.");
                System.exit(1);
                return null;
        }
    }

    private static void displaySongs(Album album) {
        System.out.println("Song Choices:");
        List<String> songList = album.getSongList();
        for (int i = 0; i < songList.size(); i++) {
            System.out.println((i + 1) + ". " + songList.get(i));
        }
    }

    private static String getSongTitle(Album album, int choice) {
        List<String> songList = album.getSongList();
        return songList.get(choice - 1);
    }
}

