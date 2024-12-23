package te_11_12_24_Multithreading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(()->{
			System.out.println("Run by Main Thread");
		});
		thread.run();
	}

}
