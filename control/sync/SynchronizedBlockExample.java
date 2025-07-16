public class SynchronizedBlockExample {
  private int count = 0;

  public void increment() {
    synchronized (this) {
      count++;
    }
  }

  public static void main(String[] args) throws InterruptedException {
    SynchronizedBlockExample example = new SynchronizedBlockExample();

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) example.increment();
    });

    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) example.increment();
    });

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println("Count: " + example.count);
  }
}
