public class GuitarTest {
    public static void main(String[] args) {
        ElectricGuitar[] guitars = new ElectricGuitar[5];
        guitars[0] = new ElectricGuitar("Fender","White",6);
        guitars[0].getBrand();
        guitars[0].getColor();
        guitars[0].getNumOfStrings();
        guitars[0].playIt();
    }
}
