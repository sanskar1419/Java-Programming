public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] ={20,12,10,15,2};
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i ;
            for (int j = i; j < arr.length; j++) {
                if (arr[j]<min) {
                    min = arr[j];
                    minIndex=j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
