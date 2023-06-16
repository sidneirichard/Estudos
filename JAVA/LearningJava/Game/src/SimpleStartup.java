public class SimpleStartup {
    private int[] locationsCells;  // Array que armazena as posições das células
    private int numOfHits = 0;  // Contador de acertos

    public void setLocationsCells(int[] locs) {
        locationsCells = locs;  // Define as posições das células
    }

    public String checkYourself(int guess) {
        String result = "miss";  // Considera o palpite como 'miss'
        for (int cell : locationsCells) {
            if (guess == cell) {  // Verifica se o palpite do usuário corresponde a alguma célula
                result = "hit";  // Retorna o resultado como 'hit'
                System.out.println("Hit!");
                numOfHits++; // Incrementa o contador de acertos
                break; // Sai do loop se houver acerto
            }
        }
        if (numOfHits == locationsCells.length) {
            result = "kill"; // Se o número de acertos for igual ao número de células, significa que todas as células foram atingidas, então atualiza o resultado para "kill"
        }
        System.out.println("result");  // Printa o resultado atual
        return result;  // Retorna o resultado
    }
}
