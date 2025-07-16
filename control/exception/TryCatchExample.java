public class TryCatchExample {
  public static void main(String[] args) {
    try {
      int result = 10 / 0; // erzeugt eine Exception
    } catch (ArithmeticException e) {
      System.out.println("Caucht an exception: " + e.getMessage());
    }
  }
}
