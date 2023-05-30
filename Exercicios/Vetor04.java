import java.util.Arrays;

public class Vetor04 {
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v,0);  // usando arrays pra preecher o vetor com '0'
        for(int valor: v){
            System.out.print(valor+ " ");
            
        }
    }
}
