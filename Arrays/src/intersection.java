public class intersection {
    public static void main(String[] args) {
        int arr[] = {2,6,8,5,4,3};
        int arr2[] = {2,3,4,7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
