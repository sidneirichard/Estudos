public class PhraseOMatic {
    public static void main(String[] args) {
        // cria 3 Arrays(listas) de String com palavras para usar no randonGenerate

        String[] wordListOne = {"agnostic", "opionated", "voice activated", "haptically driven", "",
                                "extensible", "reactive", "agent based", 
                                "functional", "AI enable", "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven",
                                "pub-sub", "IoT", "cloud native", "service oriented","containerized", 
                                "serverless", "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library", "DSL", "REST API", "repository",
                                  "pipeline","service mesh", "architecture", "perspective",
                                  "design", "orientation"};

        // procura o numero de palavras em cada wordList

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // gera 3 números random, para cada lista ele procura o valor de cada lista e gera o número de 0 ate o 'length'(tamanho ou nesse caso quantidade de palavras em cada Array)

        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // use a wordList + o randomGenerate para criar uma frase

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("what we need now is " + phrase);
    }
}
