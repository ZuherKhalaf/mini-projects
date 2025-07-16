public class RecursiveMethod {
  public static void main(String[] args) {
    int number = 5;
    System.out.println("Factorial of " + number + " is " + factorial(number));
  }

  // Recursive method to calculate factorial
  public static int factorial(int n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * factorial(n -1);
    }
  }
}
