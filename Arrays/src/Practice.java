import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        // Loop for Taking array code 
        for(int i = 0 ; i<n ; i++)
        {
           arr[i] = s.nextInt();
        }
        int sum = 0;
        // Loop for calculating the sum
        for(int i = 0 ; i<n ; i++)
        {
           sum += arr[i];
        }
        System.out.println(sum);
    }
}
