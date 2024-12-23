package com.array;

import java.util.ArrayList;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Using primitive types
        int primitiveInt = 10;
        double primitiveDouble = 3.14;
        
        // Using wrapper classes
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Boxing
        Double wrapperDouble = Double.valueOf(primitiveDouble); // Boxing
        
        // Adding wrapper objects to a collection
        ArrayList<Integer> list = new ArrayList<>();
        list.add(wrapperInt);
        list.add(primitiveInt); // Autoboxing
        
        // Retrieving elements from collection
        int num = list.get(0); // Unboxing
        
        // Utility methods
        String numStr = "100";
        int parsedInt = Integer.parseInt(numStr);
        
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Autoboxed int: " + list.get(1));
        System.out.println("Parsed int: " + parsedInt);
    }
}
