package te_11_12_24_Multithreading;


public class Multithreading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			//MultithreadThing myThing2 = new MultithreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
			
			
			
		}
		//throw new RuntimeException();

	}
}
