class Method2
{
	public void addition(int a, int b)
	{
		int c = a+ b;
		System.out.println("Your addition of two numbers is : " + c);
		
	}	
}
public class MethodEx2
{
	public static void main(String[] args)
	{
		Method2 obj = new Method2();
		obj.addition(10,20);
		obj.addition(100,120);
		
	}
}