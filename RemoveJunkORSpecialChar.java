public class RemoveJunkORSpecialChar
{
	public static void main(String[] args)
	{
		String s ="^&&%$$%@@%#%&()_+^$#@W latin String 0123456789";
		String s1 = s.replaceAll("[^a-zA-z0-9]","");
		String ss =" ><)(&^^%$#@ jhfdsdgg jjfhhgfhj ";
		String s2 = ss.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
		System.out.println(s2);
	}
}