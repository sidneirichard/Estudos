public class GaragemTest {
    public static void main(String[] args) {
        Garagem garagem = new Garagem();
        Car car1 = new Car("BWM");
        Car car2 = new Car("Tesla");

        garagem.park(car1);
        garagem.park(car2);
    }
}