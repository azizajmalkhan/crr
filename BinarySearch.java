public class BinarySearch
{
	public static void main(String[] args)
	{
		int a[] ={1,2,3,4,5,6,7,8,9,10};
		int item = 6;
		boolean flag = false;
		int l=0;
		int h=a.length-1;
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==item)
			{
				System.out.println("Item was found at " + m +" index");
				flag = true;
				break;	
			}
			if(a[m]<item)
			{
				l=m+1;	 
			}
			if(a[m]>item)
			{
				h=m-1;
			}
			
		}
		if(flag==false)
			{
				System.out.println("Item is not there in given list");
			}
	}
}