package Pattern;

import java.util.Scanner;

public class Pattern22 {
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
            while (star<=i) {
                System.out.print(star);
                star++;
            }
            int dec = i-1;
            while (dec>=1) {
                System.out.print(dec);
                dec--;
            }
            System.out.println();
            i++;
        }
    }
}
