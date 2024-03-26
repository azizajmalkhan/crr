class StringSumSIngleDigit
{
	public static void main(String[] args)
	{
	
        	String str = "abs56gd4bd89";
        	int sum=0;
        	String num="";
        	for(int i =0;i<str.length();i++)
        	{
            		char ch=str.charAt(i);
            		if(Character.isDigit(ch))
            		{
                		num=num+ch;
                		sum= sum+Integer.parseInt(num);
                		num="";
            		}
        	}
        	System.out.println(sum);
		
		
		/*String str = "abs56jgd8bd9";		
		int sum=0;
		int num=0;
		for(int i =0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{			
				sum= sum+Integer.parseInt(ch);
			}
		}
		System.out.println(sum);*/
	}
}