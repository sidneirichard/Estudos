public class ExemploTratamentoExcecoes2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        try {
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição do array inválida: " + e.getMessage());
        }
    }
}
