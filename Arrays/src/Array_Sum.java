public class Array_Sum {
    public static void Sum(int arr[])
    {
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        Sum(arr);
    }
}
