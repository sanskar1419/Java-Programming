import java.util.Scanner;

public class Populate_Array {
    public static int[] Populate(int n)
    {
        int arr[] = new int[n];
        int start = 0;
        int end = n-1;
        int i = 1;
        while (start<=end) {
            arr[start] = i;
            if(start==end){
                break;
            }
            i++;
            start++;
            arr[end] = i;
            end--;
            i++;
        }
        return arr;
    }

    public static void PrintArray(int arr[])
    {
        System.out.println("The array element are : ");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to populate : ");
        int n = s.nextInt();
        int arr[] = Populate(n);
        PrintArray(arr);
    }
}
