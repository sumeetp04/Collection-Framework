package te_11_12_24_Multithreading;

public class LearnCreatingThreads {
		public static void main(String[] args) {
			Chandana_mam_ThreadProgram2 myThread1= new Chandana_mam_ThreadProgram2();
			myThread1.start();
			
			myRunnableThread myRunnableThread1 = new MyRunnableThread();
			Thread thread = new Thread(myRunnableThread1);
			thread.start();
		}
	}

