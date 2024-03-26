import java.util.Scanner;
public class CountWordsString
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String name = sc.nextLine();
		int count = 1;
		for(int i=0;i<name.length();i++)
		{
			if((name.charAt(i)== ' ')  && (name.charAt(i+1)!=' '));
			{
				count++;
			}
		}
		System.out.println("Number Of Words : " +count);
	}
}