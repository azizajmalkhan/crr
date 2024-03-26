import java.util.*;
public class StringWordCount
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your Word");
	String str= sc.nextLine();
	int count=1;
	for(int i =0; i<str.length()-1;i++)
	{
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
		{
			count++;
		}
	}
	System.out.println(count);	
	}
}