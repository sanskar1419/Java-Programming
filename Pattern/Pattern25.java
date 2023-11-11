package Pattern;

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();

        int i = 1;
        int p = n/2 +1;
        while (i<=p) {
         
            int space = 1 ;
            while (space<=p-i) {
                System.out.print(' ');
                space++;
            }
            int star = 1 ;
            while (star<=(2*i-1)) {
                System.out.print('*');
                star++;
            }
            System.out.println();
            i++;
        }
        int q = n-p;
        int j=1;
        while (j<=q) {
            int space = 1;
            while (space<=j) {
                System.out.print(' ');
                space++;
            }
            int star = 1;
            while (star<=(2*(p-j)-1)) {
                System.out.print('*');
                star++;
            }
            System.out.println();
            j++;
        }
    }
}
