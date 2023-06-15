public class GoodDogTest {
    public static void main(String[] args){
        GoodDog[] pets; // GoodDog[] é um 'Array Object'
        GoodDog one = new GoodDog();
        one.setName("Brad");
        one.setSize(35.5d);
        System.out.println("Dog size is " + one.getSize()); // 0 pq variavel 'int' vem como 0 de default
        System.out.println("Dog name i " + one.getName()); // 'null' significa q esse objeto não esta sendo controlado
    }
}
