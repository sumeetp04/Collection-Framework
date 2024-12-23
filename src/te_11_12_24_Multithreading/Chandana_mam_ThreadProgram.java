package te_11_12_24_Multithreading;

public class Chandana_mam_ThreadProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Thread thread = new Thread("my_Thread1");
		System.out.println(thread.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		
		}
		System.out.println("main ends");
	}

}
