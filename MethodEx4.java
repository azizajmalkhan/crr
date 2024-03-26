class Method4
{
	public int addition(int a ,int b)
	{
		
		int c = a+b;
		return c;
	
	}
}

public class  MethodEx4
{
	public static void main(String[] args)
	{
		Method4 obj = new Method4();
		int cal = obj.addition(45,95);
		System.out.println("Additon of two numbers is : " + cal);			
	}

}