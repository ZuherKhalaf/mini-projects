public class ReturnStatement {
  public static void main(String[] args) {
    System.out.println("Start of method");
    earlyReturn();
    System.out.println("End of method");
  }
  public static void earlyReturn() {
    System.out.println("Inside method");
    return; // Exit method early
    // System.out.println("This wont't be executed");
  }
}
