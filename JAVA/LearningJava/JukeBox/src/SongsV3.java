public class SongsV3 implements Comparable<SongsV3> {
    private String title;
    private String artist;
    private int bpm;

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public int compareTo(SongsV3 s) {
        return title.compareTo(s.getTitle());
    }

    public String toString() {
        return title;
    }
}
