package te_18_12_24_Remock_Practice;


	class ClassOne
	{
	    void method(String s1)
	    {
	        method(s1, s1+s1);//java
	    }
	 
	    void method(String s1, String s2)
	    {
	        method(s1, s2, s1+s2);//java java
	    }
	 
	    void method(String s1, String s2, String s3)
	    {
	        System.out.println(s1+s2+s3);//java java java
	    }
	}
	 
	public class abcd
	{
	    public static void main(String[] args)
	    {
	        ClassOne one = new ClassOne();
	 
	        one.method("JAVA ");
	    }
	}