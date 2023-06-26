import java.util.Comparator;

public class ArtistCompare implements Comparator<SongsV3> {
    public int compare(SongsV3 one, SongsV3 two){
        return one.getArtist().compareTo(two.getArtist());
    }
}
