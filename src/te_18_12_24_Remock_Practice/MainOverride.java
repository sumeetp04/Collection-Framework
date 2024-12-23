package te_18_12_24_Remock_Practice;

public class MainOverride {
    public static void main(String[] args) {
        Child child = new Child();
        child.show(); // This will not work due to compilation error
    }
}

public class Parent {
	    // A final method
	    public final void show() {
	        System.out.println("This is a final method in the Parent class.");
	    }
	}

	class Child extends Parent {
	    // Attempt to override the final method
	    @Override
	    public void show() { // Compilation error here
	        System.out.println("Trying to override the final method in the Child class.");
	    }
	}

	
