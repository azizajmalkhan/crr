public class MethodStaticEx{
	static String name;
	public static void method_1()
	{
		System.out.println("hello "+  name);	
	}
	public static void main(String[] args)
	{
		name = "mallika";
		MethodStaticEx.method_1();	
	}
}