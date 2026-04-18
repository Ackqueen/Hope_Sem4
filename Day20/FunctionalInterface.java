package Day20;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] arg){

        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));

        Consumer<String> v = name -> System.out.println(name);
        v.accept("Kayal");

        Supplier<Double> val1 = () -> Math.random();
        System.out.println(val1.get()); // correct way

        Predicate<Integer> p = n -> n % 2 == 0;
        Consumer<Integer> c = n -> System.out.println(n);
        Supplier<Integer> val2 = () -> 101;

        if (p.test(val2.get())) {
            c.accept(val2.get()); // use consumer here
        } else {
            System.out.println("Supplier can't be printed");
        }
    }
}