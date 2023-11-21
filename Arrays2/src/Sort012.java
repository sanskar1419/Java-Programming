public class Sort012 {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,2,0,1};
        int i = 0 ;
        int nextZero = 0 ;
        int nextTwo = arr.length-1;
        while (i<=nextTwo) {
            if(arr[i] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[nextZero];
                arr[nextZero] = temp;
                i++;
                nextZero++;
            } else if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[nextTwo];
                arr[nextTwo] = temp;
                nextTwo--;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
