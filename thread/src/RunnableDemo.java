public class RunnableDemo implements Runnable {
    private Thread thread;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating: " + threadName);
    }

    public void run() {
        System.out.println("Running: " + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + threadName + " , " + i);
        }
        System.out.println("Thread: " + threadName + " finished");
    }
    public void start() {
        System.out.println("Starting: " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }

    public static void main(String[] args) {
        System.out.println("Starting main!!");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread 1 HR Database");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread 2 Send Email");
        runnableDemo2.start();

        System.out.println("Finished main!!");
    }
}