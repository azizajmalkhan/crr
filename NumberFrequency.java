import java.util.*;
import java.io.*;
public class NumberFrequency
{
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your NUmber : ");
		int num = sc.nextInt();
		int temp =num; 
		while(num>0)
		{
			int digit= num%10;
			for(int i = 0;i<=9;i++)
			{
				if(digit==i)
				{
					arr[i]++;
				}		
			}
			num=num/10;
		}
		System.out.println("Original NUmber : " + temp);
		for(int i=0; i<=9; i++)
		{
			if(arr[i]!=0)
			{
				System.out.println("Frequency of "+ i + " is : "+arr[i]);
			}
		}		
	}
}