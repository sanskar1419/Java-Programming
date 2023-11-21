import java.util.Scanner;

public class Row_Wise_Sum {
    public static int[][] TakeInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int m = s.nextInt();
        System.out.print("Enter the Number of Column : ");
        int n = s.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the Array Elements : ");
        // Input of 2D Array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }
    public static void PrintArray(int arr[][])
    {
        System.out.println("The Array Elements are : ");
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void RowWiseSum(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];  
            }
            System.out.print(sum + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[][] = TakeInput();
       PrintArray(arr);
       RowWiseSum(arr);
    }
}
