class Method1
{
	public void add()
	{
		int a = 10,b= 20;
		int c =a+b;
		System.out.println("Addition of two numbers is : " + c);	
		
	}

}
public class MethodEX1
{
	public static void main(String[] args)
	{
		Method1 obj = new Method1();
		obj.add();		
	}
}