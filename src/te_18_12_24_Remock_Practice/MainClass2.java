package te_18_12_24_Remock_Practice;

class A1
{
    public A1(int i)
    {
        System.out.println(myMethod(i));
    }
 
    int myMethod(int i)
    {
        return ++i + --i;
    }
}
 
class B extends A1
{
    public B(int i, int j)
    {
        super(i*j);
 
        System.out.println(myMethod(i, j));
    }
 
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}
 
public class MainClass2
{
    public static void main(String[] args)
    {
        B b = new B(12, 21);
    }
}