package arr.practice;


//class Animal {
// public Animal() {
//     System.out.println("Animal Constructor Called");
// }
//}
//
//class Dog extends Animal {
// public Dog() {
//      // Calls the parent class constructor
//     System.out.println("Dog Constructor Called");
// }
//}
//
//public class Temp {
// public static void main(String[] args) {
//     Dog dog = new Dog();  // Creates a Dog object
// }
//}
public class PracticeQuestions {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 2, 3, 1};
        int freq[] = new int[arr.length];

        int visited = -1;  // Marker for visited elements

        // Count frequencies
        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;  // Mark as visited
                }
            }

            // Store frequency if the element is not visited
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }

        // Print elements and their frequencies
        System.out.println("Element | Frequency");
        System.out.println("--------------------");

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {  // Print only unvisited elements
                System.out.println("   " + arr[i] + "    |    " + freq[i]);
            }
        }
    }
}

