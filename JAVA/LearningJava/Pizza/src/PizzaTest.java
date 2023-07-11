public class PizzaTest {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println();

        Pizza pizza1 = new Pizza("thin crust", "dried tomatoes" , "cheddar" , "anchovies");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);
        System.out.println();

        Pizza pizza2 = new Pizza(" pão seco", "molho de agua");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println();

        Pizza pizza3 = new Pizza("Massa Diana", "queijo dos brabos");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.cheese);
        System.out.println();
    }
}