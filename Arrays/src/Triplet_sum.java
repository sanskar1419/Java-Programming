public class Triplet_sum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int x = 12;
        int count = 0;

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                     if(arr[i]+arr[j] + arr[j2] == x)
                count++;
                }
            }
        }
        System.out.println(count);
    }
}
