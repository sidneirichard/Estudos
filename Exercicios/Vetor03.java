import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        double v[]= {2.75,3.85,5.95,2};
        Arrays.sort(v);  // organizar o vetor
        int pos = Arrays.binarySearch(v,2); // procura a posiçao da chave no vetor
        System.out.println("Encontrei meu vetor na posição "+pos+" ");
        for(double valor:v){  // for each
            System.out.println(valor +" ");
        }
    }
}
