package Pattern;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();
        System.out.println('*');
        int i = 1;
        while (i<=n) {
            System.out.print('*');
            int j = 1;
            while (j<=i) {
                System.out.print(j);
                j++;
            }
            int k = i-1;
            while (k>=1) {
                System.out.print(k);
                k--;
            }
            System.out.print('*');
            System.out.println();
            i++;
        }
        int j = 1;
        while (j<=n-1) {
            System.out.print('*');
            int m = 1;
            while (m<=n-1-j+1) {
                System.out.print(m);
                m++;
            }
            int k = m-2;
            while (k>=1) {
                System.out.print(k);
                k--;
            }
            System.out.print('*');
            System.out.println();
            j++;
        }
        System.out.println('*');
    }
}
