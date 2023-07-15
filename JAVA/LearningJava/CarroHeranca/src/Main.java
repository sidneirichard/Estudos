public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.go();
        System.out.println(carro.portas);

        Bicicleta bicicleta = new Bicicleta();
        bicicleta.stop();
        System.out.println(bicicleta.pedal);
    }
}