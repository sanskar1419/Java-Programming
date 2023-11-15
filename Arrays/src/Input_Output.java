import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int num = s.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the element of array : ");
        for(int i = 0 ; i<num ; i++)
        {
            arr[i] = s.nextInt();
        }
        System.out.println("The array element are : ");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
