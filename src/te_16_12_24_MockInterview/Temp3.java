package te_16_12_24_MockInterview;

public class Temp3 {

	public Temp3(int i) {
		System.out.println(1);
	}
	public Temp3() {
		this(10);
		System.out.println(2);
	}
	Temp3() {
		this(10);
		System.out.println(3);
	}
	Temp3(int i) {
		System.out.println(4);
	}
	public static void main(String[] args) {
		new.Temp3().Temp3();
	}
}
