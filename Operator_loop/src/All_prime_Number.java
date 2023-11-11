package Operator_loop.src;

import java.util.Scanner;

public class All_prime_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. upto which prime no.s are needed : ");
        int n = s.nextInt();
        int i = 2;
        while(i<=n)
        {
            boolean Isprime = true;
            int j = 2;
            while (j<=Math.sqrt(i)) {
                if (i%j == 0) {
                    Isprime = false;
                    break;
                }
                j++;
            }
              
            // System.out.println(i);

            if (Isprime == true) {
                System.out.println(i);
            }
            i++;
        }

    }
}
