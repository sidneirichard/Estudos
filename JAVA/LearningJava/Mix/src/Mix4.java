public class Mix4 {
    int counter = 0;

    public int maybeNew(int index) {
        if (index < 5) {
            Mix4 mix = new Mix4();
            mix.counter = mix.counter + 1;
            return 1;
        }
        return 0;
    }
}
