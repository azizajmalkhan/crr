import java.util.HashSet;
public class ArraysFindCommon
{
	public static void main(String[] args)
	{
		int arr1[] ={1,2,2,3,3,4,4,5};
		int arr2[] = {2,3,5};
		HashSet<Integer> hs = new HashSet<>();
		for(int i =0;i<=arr1.length-1;i++)
		{
			for(int j =0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					hs.add(arr1[i]);
				}
			}
		}
		for(int no:hs)
		{
			System.out.println(no);
		}
	}
}