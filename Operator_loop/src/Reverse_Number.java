package Operator_loop.src;

import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();
        int rev_number = 0;
        while (num != 0) {
            int last_digit = num%10;
            num /= 10;
            rev_number = 10*rev_number + last_digit;
        }
        System.out.println(rev_number);
    }
}
