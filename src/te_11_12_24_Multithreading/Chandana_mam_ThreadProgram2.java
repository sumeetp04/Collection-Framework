package te_11_12_24_Multithreading;

public class Chandana_mam_ThreadProgram2 extends Thread{

	public static void main(String[] args) {
		@Override
			public void run() {
				for (int i = 'a'; i < 'z'; i++) {
					System.out.println((char)i);
				}
				
			}
		
	}
}
	class MyRunnableThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 18; i++) {
				System.out.println("int "+i);
				
			}
		}
		
		
	}


}
