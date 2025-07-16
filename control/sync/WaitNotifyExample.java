public class WaitNotifyExample {
  private static final Object lock = new Object();
  private static boolean ready = false;

  public static void main(String[] args) {
    Thread waiter = new Thread(() -> {
      synchronized (lock) {
        while (!ready) {
          try {
            System.out.println("Waiting...");
            lock.wait();
          } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
          }
        }
        System.out.println("Notified!");
      }
    });

    Thread notifier = new Thread(() -> {
      synchronized (lock) {
        ready = true;
        lock.notify();
        System.out.println("Notified the waiting thread.");
      }
    });

    waiter.start();

    try {
      Thread.sleep(1000); // Simulate some work
    } catch (InterruptedException e){
      Thread.currentThread().interrupt();
    }

    notifier.start();
  }
}
