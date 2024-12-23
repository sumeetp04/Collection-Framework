package te_12_12_24_Multithreading;

public class Main {
    public static void main(String[] args) {
        DataInconsistency data = new DataInconsistency();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                data.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                data.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of count
        System.out.println("Final count: " + data.getCount());
    }
}
