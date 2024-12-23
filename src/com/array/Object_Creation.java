package com.array;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
// we can use more than one main method in single java program using nested class.
public class Object_Creation
{
	public static void main(String[] args) {
		// 1) Using new keyword

	Object_Creation obj = new Object_Creation();//class_name:type		reference_Variable:obj 	>Variable Declaration
		System.out.println(obj);					//new_keyword:Memory Allocation		class_name:Constructor 	
	}																					// ^ Object Creation

	class Object{
		public static void main(String[] args) {
		System.out.println("Hiii");
	}
}
}
class Sumeet
{
	public static void main(String[] args) {
		// 2) Using newInstance() of Class class
		try{
		Class<?> cls=Class.forName("Sumeet");
		Sumeet obj1=(Sumeet)cls.newInstance();
		System.out.println(obj1);
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	 catch (InstantiationException e) {

            e.printStackTrace();
        }
        catch (IllegalAccessException e) {

            e.printStackTrace();
        }

	}
}

//3) Using newInstance() of Constructor class




class Qspider
{
	public static void main(String[] args)throws NoSuchMethodException, SecurityException,
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Qspider> constructor=Qspider.class.getConstructor(String.class);
		Qspider obj2=(Qspider)constructor.newInstance();
		System.out.println(obj2);
		
	}
}