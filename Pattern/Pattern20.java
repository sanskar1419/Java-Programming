package Pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
           int j = 1;
           while (j<=n-i+1) {
            System.out.print('*');
            j++;
           }
           System.out.println();
           i++;
        }
    }
}
