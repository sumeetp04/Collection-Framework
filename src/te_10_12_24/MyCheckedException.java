package te_10_12_24;

@SuppressWarnings("serial")
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

class ExceptionDemo {

    // Method that throws the custom checked exception
    public void someMethod() throws MyCheckedException {
        boolean someCondition = false;
        if (someCondition) {
            throw new MyCheckedException("This is a checked exception");
        }
    }

    // Method that calls someMethod and handles the exception
    public void anotherMethod() {
        try {
            someMethod();
        } catch (MyCheckedException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.anotherMethod();
    }
}



