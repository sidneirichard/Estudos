public class StreamingSongTestDrive {
    public static void main(String[] args) {
        Song song = new Song();
        song.artist = "The Beatles";
        song.title = "Come Together";

        song.play();
        song.printDetails();
    }
    
}
