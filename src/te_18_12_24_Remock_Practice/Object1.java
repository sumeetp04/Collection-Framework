package te_18_12_24_Remock_Practice;

public class Object1 {

	private static final Object Object1 = null;
	private String string;

	public Object1(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Object1 obj2 = (Object1) obj;
		return this.string == obj2.string;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object1 obj1 = new Object1("Sumeet");
		Object1 obj2 = new Object1("Sumeet");

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
	}

}
