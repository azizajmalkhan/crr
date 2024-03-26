public class RemWhiteSpsaces
{
	public static void main(String[] args)
	{
	String str = "jana gana  mana";
	String str1 = str.replaceAll("\\s",""); // or "  " , "-"
	System.out.println(str1);
	}
}