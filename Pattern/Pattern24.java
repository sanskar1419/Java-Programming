package Pattern;

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();

        int i = 1;
        while (i<=n) {
            int space = 1;
            while(space<=n-i)
            {
                System.out.print(" ");
                space++;
            }
            int star = 1;
            int p = i;
            while (star<=i) {
                System.out.print(p);
                star++;
                p++;
            }
            int dec = i-1;
            int q = p-2;
            while (dec>=1) {
                System.out.print(q);
                dec--;
                q--;
            }
            System.out.println();
            i++;
        }
    }
}
