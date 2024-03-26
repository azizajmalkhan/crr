public class StringSum
{
	public static void main(String[] args)
	{
		String str = "23764798";
		int num = Integer.parseInt(str);
		int sum =0;
		while(num>0)
		{
			int r=num%10;
			sum = sum+r;
			num=num/10;
		}
		System.out.println(sum);
	}
}