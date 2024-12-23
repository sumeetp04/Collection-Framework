package te_18_12_24_Remock_Practice;

interface MyInterface{
	void Method1();
	void Method2();
}

public class Abstraction implements MyInterface  {
	@Override
	public void Method1() {
		System.out.println("Method1");
	}
	@Override
	public void Method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2");
	}

	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		a.Method1();
	}

	

}
