package Operator_loop.src;

import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int decimal_num = s.nextInt();
        long binary_num = 0;
        // int i = 0;
        int i = 1;
        while (decimal_num != 0) {
            int last_digit = decimal_num%2;
            decimal_num /= 2;
            binary_num += i*last_digit;
            i = i*10;
            // decimal_num += (int)(Math.pow(2, i)*last_digit);
            // i++;
        }
        System.out.println(binary_num);
    }
}

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n = s.nextInt();
long binary = 0, pow = 1;
while(n > 0) {
int lastBit = n % 2;
binary += lastBit * pow;
pow *= 10;
n = n / 2;
}
System.out.println(binary);
}
}
