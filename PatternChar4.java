public class PatternChar4
{
	public static void main(String[] args)
	{
		for(int i=1,p='A'; i<=5;i++,p+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)p+" ");
			}
			System.out.println(" ");
		}	
	}
}