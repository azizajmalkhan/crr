
public class ForEach {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        int sum=0;
        for(int element:arr)
        {
            sum = sum +element;
        }
        int result = sum/arr.length;
        System.out.println(result);
    }
}
