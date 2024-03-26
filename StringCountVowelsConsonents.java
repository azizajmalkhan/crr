class StringCountVowelsConsonents
{
	public static void main(String[] args)
	{
		String str ="WE are From Java programzz";
		int count =0;
		int vCount= 0;
		int cCount =0;
		str= str.toLowerCase();
		for(int i =0; i<=str.length()-1; i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vCount++;
			}
			else if(str.charAt(i)> 'a' && str.charAt(i)<'z')
			{
				cCount++;	
			}
		}
		System.out.println("TOtal no of count in string is : " + count);
		System.out.println("TOtal no of count in string is : " + vCount);
		System.out.println("TOtal no of count in string is : " + cCount);
	}
}