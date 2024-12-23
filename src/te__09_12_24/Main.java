package te__09_12_24;

public class Main {
    public static void main(String[] args) {
        Emp emp1 = new Emp("Prasad", "Sumeet");
        Emp emp2 = new Emp("Prasad", "Sumeet");

        // Comparing same object
        System.out.println(emp1.equals(emp1)); // true

        // Comparing two objects with same data
        System.out.println(emp2.equals(emp1)); // true (because equals is overridden)

        // Comparing different types of objects
        String str3 = new String("Rcb");
        System.out.println(emp1.equals(str3)); // false (different class)

        // Uncomment the following lines if needed
        // String str4 = new String("Rcb");
        // System.out.println(emp2.equals(str4)); // false (different class)

        // Using == for reference comparison
        System.out.println(emp1 == emp2); // false (different references)
    }
}


