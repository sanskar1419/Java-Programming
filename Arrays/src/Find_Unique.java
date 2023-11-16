public class Find_Unique {
    public static void main(String[] args) {
        int arr[] = {2,4,3,4,2};
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum ^= arr[i];
        }
        System.out.println(sum);
    }
}
