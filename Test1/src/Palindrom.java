package Test1.src;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for checking Palindrom : ");
        int num = s.nextInt();
        int revNum = 0;
        // int j = 1;
        int originalNum = num;
        while (num != 0) {
            int lastDigit = num%10;
            num /= 10;
            revNum = 10*revNum + lastDigit;
            // j = j *10; 
        }
        // System.out.println(revNum);
        System.out.println((originalNum == revNum) ? true:false );
    }
}
