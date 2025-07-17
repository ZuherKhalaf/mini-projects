import java.util.Arrays;
import java.util.List;

public class LambdaExample {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Alice","Bob", "Charlie");

    // Klassische for-Schleife
    for (String name : names) {
      System.out.println(name);
    }

    // Lambda-Ausdruck mit for-each
    names.forEach(name -> System.out.println(name));

    // Lambda mit Method Reference (noch kürzer)
    names.forEach(System.out::println);
  }
}
