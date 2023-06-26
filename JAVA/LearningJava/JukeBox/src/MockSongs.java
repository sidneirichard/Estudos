import java.util.ArrayList;
import java.util.*;

public class MockSongs {
    public static List<SongsV2> getSongsV2() {
        List<SongsV2> songs = new ArrayList<>();
        songs.add(new SongsV2("somersault", "zero 7", 147));
        songs.add(new SongsV2("cassidy", "grateful dead", 158));
        songs.add(new SongsV2("$10", "hitchhiker", 140));
        songs.add(new SongsV2("havana", "Cabello", 105));
        songs.add(new SongsV2("Cassidy", "grateful dead", 158));
        songs.add(new SongsV2("50 Ways", "simon", 102));
        songs.add(new SongsV2("Bright Eyes", "Blind Guardian", 94));
        songs.add(new SongsV2("Blood Brothers", "Iron Maiden", 104));
        return songs;
    }
}

