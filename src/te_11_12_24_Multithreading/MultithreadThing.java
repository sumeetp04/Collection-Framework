package te_11_12_24_Multithreading;

//public class MultithreadThing extends Thread{
public class MultithreadThing implements Runnable{
	
	private int ThreadNumber;
	public MultithreadThing(int ThreadNumber) {
		this.ThreadNumber = ThreadNumber;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i+" From Thread "+ThreadNumber);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}

	}
}

