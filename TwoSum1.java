public class TwoSum1
{
	public static void main(String[] args)
	{
		int[] nums = {1,2,4,6};
		
		System.out.println("Target is s" +twoSum(nums, 9));
		
	}
	public static int[] twoSum(int[] nums, int target)
	{
		int n = nums.length;
		for(int i=0; i<=n-1;i++)
		{
			for(int j=i+1;i<=n-1;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
}