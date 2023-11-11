package Pattern;

import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number Square for pattern : ");
        int n = s.nextInt();
        int num;
        int i = 1;
        while (i<=n) {
           int j=1;
           num=2*i-1;
           while (j<=n-i+1) {
            System.out.print(num);
            num +=2;
            j++;
           }

           num =1;
           j =1;
           while (j<=i-1) {
            System.out.print(num);
            num+=2;
            j++;
           }

            System.out.println();
            i++;
        }
    }
}
