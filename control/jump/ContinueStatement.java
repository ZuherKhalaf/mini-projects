public class ContinueStatement {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      if (i == 3) {
        continue; // Skip iteration when i == 3
      }
      System.out.println(i);
    }
  }
}
