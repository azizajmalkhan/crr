public class StrinRemoveSpecialCharacters
{
	public static void main(String[] args)
	{
		String s = "&^$%^$%&(#%%^*HVHGFFGYRT)_())(*$#@!#&_()*";
		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
	}
}