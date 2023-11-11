package Bitwise_Special_Question.src;

public class Single_odd_occurance {
    public static void main(String[] args) {
        int[] arr = {12, 12, 14, 90, 14, 14, 14};
        int res = 0 ;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println("The odd element is : " + res);
    }
}
