package Operator_loop.src;

import java.util.Scanner;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary number : ");
        int binary_num = s.nextInt();
        int decimal_num = 0;
        // int i = 0;
        int i = 1;
        while (binary_num != 0) {
            int last_digit = binary_num%10;
            binary_num /= 10;
            decimal_num += i*last_digit;
            i = i*2;
            // decimal_num += (int)(Math.pow(2, i)*last_digit);
            // i++;
        }
        System.out.println(decimal_num);
    }
}
