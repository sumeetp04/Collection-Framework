public class CopyConstructor {
    private int myInt;
    private String myString;

    // Copy constructor
    public CopyConstructor(CopyConstructor original) {
        this.myInt = original.myInt;
        this.myString = original.myString;
    }

    // Parameterized constructor
    public CopyConstructor(int intValue, String stringValue) {
        this.myInt = intValue;
        this.myString = stringValue;
    }

    // Method to display values
    public void displayValues() {
        System.out.println("myInt: " + myInt);
        System.out.println("myString: " + myString);
    }

    public static void main(String[] args) {
        // Creating an object of MyClass
        CopyConstructor originalObj = new CopyConstructor(10, "Hello");

        // Creating a copy of originalObj using the copy constructor
        CopyConstructor copiedObj = new CopyConstructor(originalObj);

        // Displaying values of both objects
        System.out.println("Original Object:");
        originalObj.displayValues();

        System.out.println("nCopied Object:");
        copiedObj.displayValues();
    }
}
