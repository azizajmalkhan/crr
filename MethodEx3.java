class Method3
{
	public int addition()
	{
		int a = 45 , b = 55,c;
		c = a+b;
		return c;
	
	}
}

public class  MethodEx3
{
	public static void main(String[] args)
	{
		Method3 obj = new Method3();
		int cal = obj.addition();
		System.out.println("Additon of two numbers is : " + cal);			
	}

}