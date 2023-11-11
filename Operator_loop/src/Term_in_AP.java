package Operator_loop.src;

import java.util.Scanner;

public class Term_in_AP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of term required : ");
        int n = s.nextInt();
        int i = 1 ;
        int N = 1;
        while (i<=n) {
            int Ap_term = 3*N + 2 ;
            if (Ap_term%4 != 0) {
                System.out.print(Ap_term+" ");
                i++;
            }
            N++;
        }
    }
}
