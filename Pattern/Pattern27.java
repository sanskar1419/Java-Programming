package Pattern;

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
           int sum=0;
           int j =1;
           while (j<=i) {
            System.out.print(j);
            sum +=j;
            j++;
            if (j<=i) {
                System.out.print('+');
            }
           }

            System.out.print('=');
            System.out.print(sum);
            System.out.println();
            i++;
        }
    }
}
