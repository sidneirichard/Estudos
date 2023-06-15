public class Episode {
    int seriesNumber;
    int episodeNumber;

    void skipIntro(){
        System.out.println("Skiping intro...");
    }
    void skipToNext(){
        System.out.println("Loading next episode...");
    }
    void play(){
        System.out.println("Playing the Episode " + episodeNumber + " of season " + seriesNumber);
    }
}
