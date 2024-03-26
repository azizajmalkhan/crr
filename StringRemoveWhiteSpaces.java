import java.util.*;
class StringRemoveWhiteSpaces
{
	public static void main(String[] args)
	{
		String str = "    hello   how are you     ";
		/*str = str.replaceAll("\\s","");
		System.out.println(str);*/
		for(int i =0; i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=' '&& str.charAt(i)!='\t')
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}