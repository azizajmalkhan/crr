import java.*;
public class Extra2 {
    public static void main(String[] args)
    {
        int[] arr= {12,34,45,5,6,23};
        for(int i=0; i< arr.length;i++)
        {
            for(int j=0; j<arr.length;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

