public class RecursionFactorial
{
	public int factorial(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args)
	{
		RecursionFactorial obj = new RecursionFactorial();
		int num =obj.factorial(5);
		System.out.println(num);
	}
}