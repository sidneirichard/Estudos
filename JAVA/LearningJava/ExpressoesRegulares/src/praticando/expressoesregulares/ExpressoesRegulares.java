package praticando.expressoesregulares;

import java.util.regex.*;

public class ExpressoesRegulares {
    public static void main(String[] args) {
        String texto = "A casa é azul e grande.";
        String padrao = "a[a-z]+";

        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group());
        }
    }
}
