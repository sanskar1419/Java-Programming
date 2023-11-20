public class Check_Array_Rotation {
    public static void main(String[] args) {
        int arr[] = {5,6,1,2,3,4};

        int min = Integer.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println(minIndex);
    }
}
