package te_12_12_24_Multithreading;

public class DataInconsistency {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
