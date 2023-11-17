public class sort01 {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1};
        // int start = 0;
        // int end = arr.length-1;
        // while (start<end) {
        //     if (arr[start] == 0) {
        //         start++;
        //     }
        //     if (arr[end] == 1) {
        //         end--;
        //     }
        //     if(arr[start] == 1 && arr[end] == 0)
        //     {
        //         int temp = arr[start];
        //         arr[start] = arr[end];
        //         arr[end] = temp;
        //         start++;
        //         end--;
        //     }
            
        // }

        int next = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[next];
                arr[next] = temp;
                next++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
