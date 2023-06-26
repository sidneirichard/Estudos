import java.awt.*;
import java.util.Collections;

public class Jukebox4 {
    public static void main(String[] args) {
        new Jukebox4().go();
    }
    public void go(){
        List<SongsV3> songsList = MockSongs.getSongsV2();
        System.out.println(songsList);
        Collections.sort(songsList);
        System.out.println(songsList);
    }
}
