# albumsFactory_Pattern

Implement the factory design pattern using Taylor Swift's albums as the factory interface. The interface, named Album, should declare two methods: play() and skipTrack().

Fearless and SpeakNow are concrete classes that implement the Album interface. Each album class should include a list of songs, and the play() and skipTrack() method.

AlbumRecord is a class that holds attributes such as albumId, albumName, and a reference to an Album object. This class is responsible for representing a record of a specific Taylor Swift album.

Listener is the client object that interacts with the albums. The client should be able to choose an album, select a song from the album, and decide whether to play or skip the selected song.

Refer to the UML Class Diagram
