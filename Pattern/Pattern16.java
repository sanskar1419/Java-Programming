package Pattern;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int j = 1 ;
            char p = (char)('A'+ n - i);
            while (j<=i) {
                System.out.print((char)(p+j-1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
