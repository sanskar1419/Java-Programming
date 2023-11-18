public class Binary_Search {
    public static void main(String[] args) {
        int arr[] = {1,3,7,9,11,12,45};
        int x = 12;
        int start = 0;
        int end = arr.length-1;
        int mid;
        while (start<=end) {
            mid = (start+end)/2;
            if (x == arr[mid]) {
                System.out.println(mid);
                return;
            } else if (x < arr[mid]) {
                end = mid-1;
            } else if (x > arr[mid]) {
                start = mid+1;
            }
        }
        System.out.println(-1);
    }
}
