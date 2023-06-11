import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        Random generated = new Random();
        for (int i = 0; i < 6; i++) {
            int num = generated.nextInt(20);
            System.out.println(num);
        }
    }
}
