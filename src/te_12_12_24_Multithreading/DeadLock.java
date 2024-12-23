package te_12_12_24_Multithreading;

public class DeadLock {

    public static void main(String[] args) {

        Resource01 r1 = new Resource01();
        Resource02 r2 = new Resource02();

        // Thread 1: Tries to lock Resource01, then Resource02
        Thread t1 = new Thread(() -> r1.resource1(r2));

        // Thread 2: Tries to lock Resource02, then Resource01
        Thread t2 = new Thread(() -> r2.resource2(r1));

        t1.start();
        t2.start();
    }
}

class Resource01 {
	//synchronized
    public void resource1(Resource02 r2) {
        System.out.println("using Locked Resource01");

        try {
            Thread.sleep(2000); // delay some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r2.resource2(this);
        System.out.println("Thread 1: Trying to lock Resource02");
        // Tries to lock Resource02
    }
}

class Resource02 {
	//synchronized
    public void resource2(Resource01 r1) {
        System.out.println("using Locked Resource02");

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        e.printStackTrace();
    }
        r1.resource1(this);
    System.out.println("Thread 1: Trying to lock Resource02");
     // Tries to lock Resource02
    }
}