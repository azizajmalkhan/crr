
public class PatternString2 {
    public static void main(String[] args)
    {
        String s = "CODER";
        int n =s.length();
        for(int i =1;i<=n;i++) {
            int p=0;
            for (int j = 1; j <= i; j++)
            {
                System.out.print(s.charAt(p)+" ");
                p++;
            }

            System.out.println(" ");
        }
    }
}