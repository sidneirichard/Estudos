public class Player {
    int number = 0;
    
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm thinking of number between 0 and 9...");
    }
}
