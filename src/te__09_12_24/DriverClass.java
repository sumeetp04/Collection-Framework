package te__09_12_24;



public class DriverClass {
	public static void main(String[] args) {
		HashCodeAndEqualsMethodCheck hca = new HashCodeAndEqualsMethodCheck(1, "abc", 90876);
		HashCodeAndEqualsMethodCheck hca1 = new HashCodeAndEqualsMethodCheck(1, "abc", 908796);
		HashCodeAndEqualsMethodCheck hca2 = hca;
		
		System.out.println("hashcode vale 1 " + hca.hashCode());
		System.out.println("hashcode value 2 " + hca1.hashCode());
		System.out.println("hashcode value 3 " + hca2.hashCode());
		
		System.out.println(hca.equals(hca1));
		System.out.println(hca.equals(hca2));

		System.out.println(hca == hca1);
		System.out.println(hca == hca2);
	//	Throwable
	}
}