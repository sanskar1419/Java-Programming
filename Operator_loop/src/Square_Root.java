package Operator_loop.src;

import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for Square root : ");
        int num = s.nextInt();
        if (num == 0) {
            System.out.println(0);
            return;
        }
        int i = 1;
        while (i<=num) {
            int square = i*i;
            if (square == num) {
                System.out.println(i);
                return;
            } else if(square>num)
            {
                System.out.println(i-1);
                return;
            }
            i++;
        }
    }
}
