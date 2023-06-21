public class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();

        b3.move();
        b1.move();
        b2.setLength(32);
        b2.move();
    }
}
