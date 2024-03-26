public class StringFrequencyLowest{

    public static void main(String[] args) {
        String s = "abbccc";
        int arr[] = new int[127];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        }
        int min = Integer.MAX_VALUE; // Initialize min to a large value
        char c = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] > 0 && arr[s.charAt(i)] < min) {
                min = arr[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        System.out.println("lowest-----" + c);
    }
}
