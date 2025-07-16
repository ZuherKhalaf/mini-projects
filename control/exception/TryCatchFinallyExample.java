public class TryCatchFinallyExample {
  public static void main(String[] args) {
    try {
      int[] numbers = {1, 2, 3};
      System.out.println(numbers[5]); // ArrayIndexOutOfBounds
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Caught: " + e);
    } finally {
      System.out.println("This always runs.");
    }
  }
}
