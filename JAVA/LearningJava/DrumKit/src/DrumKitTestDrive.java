public class DrumKitTestDrive {
    public static void main(String[] args) throws Exception {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if (d.snare == true) {
            d.playSnare();
        }
    }
}
