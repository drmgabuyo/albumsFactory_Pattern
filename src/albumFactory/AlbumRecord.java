package albumFactory;

class AlbumRecord {

    private int albumId;
    private String albumName;
    private Album album;

    public AlbumRecord(int albumId, String albumName, Album album) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.album = album;
    }

    public int getAlbumId() {
        return albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public Album getAlbum() {
        return album;
    }
}
