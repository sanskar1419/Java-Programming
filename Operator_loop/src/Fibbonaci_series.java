package Operator_loop.src;

import java.util.Scanner;

public class Fibbonaci_series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int current = 1 ;
        int prev = 1 ;
        int count = 2;
        while (count < n) {
            int  temp = current;
            current = current+prev;
            prev = temp;
            count++;
        }
        System.out.println(current);
    }
}
