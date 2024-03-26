public class StringReverseWords
{
	public static void main(String[] args)
	{
		String str = "Hey My Name Is Manyawar";
		String abc=" ";
		String[] arr =str.split(" "); 
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println(" ");
	
		for(int i = arr.length-1; i>=0;i--)
		{
			abc = abc+arr[i] +" ";	
		}
		System.out.print(abc);
	}
}