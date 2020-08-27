package eu.training.concurrency;

public class ThreadingRunnable implements Runnable {

    private String name;

    public ThreadingRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread name is: "+ name);
    }

    public static void main(String[] args) {

        ThreadingRunnable th = new ThreadingRunnable("SomeThread");
        new Thread(th).start();
    }
}
