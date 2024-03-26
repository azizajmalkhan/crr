public class StringFrequencyEachChar
{
    public static void main(String[] args)
    {
        String s = "abbccc";
        int[] arr = new int[127];

        for (int i = 0; i < s.length(); i++)
        {
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        }

        for (int i = 0; i < arr.length; i++)
        {
           if (arr[i] > 0)
            {
                System.out.println("Character '" + (char)i + "' occurs " + arr[i] + " times.");
            }
        }
    }


}