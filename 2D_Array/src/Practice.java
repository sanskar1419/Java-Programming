import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
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
        // Print 2D Array
         System.out.println("The Array Elements are : ");
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(arr.length);  //No. of rows
        System.out.println(arr[0].length); //No. column
        // System.out.println();
    }
}
