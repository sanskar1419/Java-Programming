public class Rotate_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int x = 2;
        while (x>0) {
            int key = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = key;
            x--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
