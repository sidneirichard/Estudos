import java.util.*;
import java.util.function.Consumer;

public class ExpressoesLambda {
    public static void main(String[] args) {
        Comparator<String> comparator = String::compareToIgnoreCase;
        Runnable runnable = () -> System.out.println("Hello");
        Consumer<String> consumer = str -> System.out.println(str);
    }
}
