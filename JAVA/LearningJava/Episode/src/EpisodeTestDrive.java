public class EpisodeTestDrive {
    public static void main(String[] args) throws Exception {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.episodeNumber = 17;
        episode.play();
        episode.skipIntro();
    }
}
