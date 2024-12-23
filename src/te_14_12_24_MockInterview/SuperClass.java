package te_14_12_24_MockInterview;

public class SuperClass {
  static int superStaticVar = initializeSuperStatic();
  int superInstanceVar = initializeSuperInstance();

  static {
    System.out.println("Static block in SuperClass");
  }

  {
    System.out.println("Instance initializer block in SuperClass");
  }

  SuperClass() {
    System.out.println("SuperClass Constructor");
  }

  static int initializeSuperStatic() {
    System.out.println("Static variable in SuperClass initialized");
    return 10;
  }

  int initializeSuperInstance() {
    System.out.println("Instance variable in SuperClass initialized");
    return 20;
  }

  // Static nested class (fixed)
  public static class InnerSuperClass extends SuperClass {
    static int subStaticVar = initializeSubStatic();
    int subInstanceVar = initializeSubInstance();

    static {
      System.out.println("Static block in InnerSuperClass");
    }

    {
      System.out.println("Instance initializer block in InnerSuperClass");
    }

    InnerSuperClass() {
      System.out.println("InnerSuperClass Constructor");
    }

    static int initializeSubStatic() {
      System.out.println("Static variable in InnerSuperClass initialized");
      return 30;
    }

    int initializeSubInstance() {
      System.out.println("Instance variable in InnerSuperClass initialized");
      return 40;
    }
  }
}


