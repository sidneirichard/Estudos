public class Mix4Test {
    public static void main(String[] args) {
        int count = 0;
        Mix4[] mixes = new Mix4[20];
        int i = 0;
        while (i < 9) {
            mixes[i] = new Mix4();
            mixes[i].counter = mixes[i].counter + 1;
            count++;
            count = count + mixes[i].maybeNew(i);
            i++;
        }
        System.out.println(count + " " + mixes[1].counter);
    }
}
