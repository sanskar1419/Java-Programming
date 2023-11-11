package Bitwise_Special_Question.src;

public class Two_non_repeating_element {
    public static void main(String[] args) {
        int[] arr = {4, 4, 100, 5000, 4, 4, 4, 4, 100, 100};
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum = sum ^ arr[i];
        }
        sum = sum & -sum;
        int sum1 = 0 ;
        int sum2 = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if((arr[i] & sum) > 0)
            {
              sum1 ^= arr[i];
            }
            else
            {
                sum2 ^= arr[i];
            }
        }
      System.out.println(sum1+ " " + sum2);
    }
}
