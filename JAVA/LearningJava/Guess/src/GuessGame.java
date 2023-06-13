public class GuessGame { // GuessGame tem 3 variaveis de instancia para 3 objetos Players
    Player p1;
    Player p2;
    Player p3;

    public void startGame() { // Cria 3 obj Player e os associa as 3 variaveis de instacia
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; // declara 3 variaveis para segurar um 'true ou false' baseado na resposta do Player
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); // Cria uma variavel 'target' para os Players adivinharem
        System.out.println("I'm thinking of number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess(); // Chama o método guess dos players
            guessp1 = p1.number;
            p2.guess();
            guessp2 = p2.number;
            p3.guess();
            guessp3 = p3.number;
            
            // checa se o guess do player 'acertou' o 'target', se sim seta o p1.number para 'true', se não o 'p1.number' e setado para false
            System.out.println("Player one guessed " + guessp1);
            System.out.println("Player two guessed " + guessp2);
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) { // se o p1 OU o p2 OU o p3 acertaram o 'target'
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is Over now.");
                break;
            } else { // se nao, eles se mantem no 'loop' ate alguem acertar e o jogo terminar.
                System.out.println("Players have to try it again!");
            }
        }
    }
}