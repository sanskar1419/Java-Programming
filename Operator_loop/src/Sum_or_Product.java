package Operator_loop.src;

import java.util.Scanner;

public class Sum_or_Product {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number and choice : ");
        int num = s.nextInt();
        int choice = s.nextInt();
        int sum =0;
        int product =1;
        int i = 1 ;
        while (i<=num) {
            sum += i;
            product *= i;
            i++;
        }

        switch (choice) {
            case 1:
                System.out.println(sum);
                break;
            case 2:
                System.out.println(product);
                break;
        
            default:
            System.out.println(-1);
                break;
        }
        
    }
}
