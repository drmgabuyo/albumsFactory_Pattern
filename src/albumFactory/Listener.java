package albumFactory;

class Listener {

    public void enjoyAlbum(AlbumRecord albumRecord) {
        System.out.println("Enjoying album: " + albumRecord.getAlbumName() + " (ID: " + albumRecord.getAlbumId() + ")");
        albumRecord.getAlbum().play();
        albumRecord.getAlbum().skipTrack();
    }
}
