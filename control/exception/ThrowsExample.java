public class ThrowsExample {
  public static void main(String[] args) {
    try {
      riskyMethod();
    } catch (Exception e) {
      System.out.println("Handled in main: " + e);
    }
  }

  static void riskyMethod() throws Exception {
    throw new Exception("Something wrong!");
  }
}
