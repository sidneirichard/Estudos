public class SongsV2 implements Comparable<SongsV2> {
    private String title;
    private String artist;
    private int bpm;

    SongsV2(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(SongsV2 o) {
        return title.compareTo(o.getTitle());
    }

}
