import java.util.Collections;
import java.util.List;

public class Jukebox3 {
    public static void main(String[] args) {
        new Jukebox3().go();
    }
    public void go(){
        List<SongsV2> songsList = MockSongs.getSongsV2();
        System.out.println(songsList);
        Collections.sort(songsList);
        System.out.println(songsList);
    }
}
