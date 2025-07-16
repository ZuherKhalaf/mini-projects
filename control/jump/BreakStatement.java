public class BreakStatement {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        break; // Exit loop when i == 5
      }
      System.out.println(i);
    }
  }
}
