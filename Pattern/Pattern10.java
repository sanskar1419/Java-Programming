package Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();
        int p = 1;
        int i = 1;
        while (i<=n) {
            int j = 1 ;
            while (j<=i) {
                System.out.print(p);
                j++;
                p++;
            }
            System.out.println();
            i++;
        }
    }
}
