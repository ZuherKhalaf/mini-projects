public class ThrowExample {
  public static void main(String[] args) {
    try {
      checkAge(15);
    } catch (IllegalArgumentException e) {
      System.out.println("Caught exception: " + e.getMessage());
    }
  }

  static void checkAge(int age) {
    if (age < 18) {
      throw new IllegalArgumentException("You must be at least 18 years old.");
    }
    System.out.println("Access granted.");
  }
}
