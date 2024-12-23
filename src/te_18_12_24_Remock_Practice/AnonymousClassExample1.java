package te_18_12_24_Remock_Practice;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

public class AnonymousClassExample1 {
    public static void main(String[] args) {
        // Using an anonymous class to override the behavior of Animal
        Animal dog = new Animal() 
        {
            @Override
            void makeSound() {
                System.out.println("Bark! Bark!");
            }
        };

        // Calling the method of the anonymous class
        dog.makeSound(); // Output: Bark! Bark!
    }
}

