public class Push_Zeroes_End {
    public static void main(String[] args) {
        int arr[] = {2,0,0,1,0,3};
        int i = 0;
        int k = 0;
        while (i<arr.length) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " " );
        }
    }
}
