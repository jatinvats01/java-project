class PrimeTask implements Runnable {
  private static int sum = 0;

  private static synchronized void add(int n) {
    sum += n;
  }
  public static int getSum() {
    return sum;
  }
  private int lower, upper;
  public PrimeTask(int lower, int upper) {
    this.lower = lower;
    this.upper = upper;
  }
  private boolean isPrime(int n) {
    if (n <= 1) return false; 
    if (n == 2) return true;
    if (n % 2 == 0) return false; 
    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) return false; 
    }
    return true; 
  }
  public void run() {
    for (int i = lower; i <= upper; i++) {

        if (isPrime(i)) {

        add(i);
      }
    }
  }
}

 class PrimeSum {

    private static final int NUM_THREADS = 4;

  private static final int LIMIT = 1000;
  public static void main(String[] args) {
    Thread[] threads = new Thread[NUM_THREADS];
    PrimeTask[] tasks = new PrimeTask[NUM_THREADS];
    int segmentSize = LIMIT / NUM_THREADS;
    for (int i = 0; i < NUM_THREADS; i++) {
      int lower = i * segmentSize + 1;
      int upper = (i + 1) * segmentSize;
      tasks[i] = new PrimeTask(lower, upper);

      threads[i] = new Thread(tasks[i]);

      threads[i].start();
    }
    for (int i = 0; i < NUM_THREADS; i++) {
      try {
        threads[i].join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    int sum = PrimeTask.getSum();
    System.out.println("The sum of all prime numbers up to " + LIMIT + " is: " + sum);
  }
}
