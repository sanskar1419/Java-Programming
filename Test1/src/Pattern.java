package Test1.src;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for pattern : ");
        int n = s.nextInt();
        int i = 1;
        while (i<=n) {
            int j = 1;
            int p = n;
            while (j<=n-1-i+1) {
                System.out.print(p);
                j++;
                p--;
            }
            System.out.print('*');
            int dec = i-1;
            while(dec>=1)
            {
               System.out.print(dec);
               dec--;
            }
            System.out.println();
            i++;
        }
    }
}
