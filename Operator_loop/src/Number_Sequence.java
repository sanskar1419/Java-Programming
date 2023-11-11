package Operator_loop.src;

import java.util.Scanner;

public class Number_Sequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of item : ");
        int num = s.nextInt();
        int prev = s.nextInt();
        int count = 2;
        int currunt;
        boolean isDec = true;
        while (count<=num) {
            currunt = s.nextInt();
            count++;
            if (prev == currunt) {
                System.out.println(false);
                return;
            }
            if (currunt<prev) {
                if (isDec == false) {
                    System.out.println(false);
                    return;
                }
            } else {
                if (isDec == true) {
                    isDec = false;
                }  
            }
            prev = currunt;
        }
        System.out.println(true);
    }
}

// This approch was using binary search
/* 
 Scanner s = new Scanner(System.in);
        System.out.println("Enter number of item : ");
        int num = s.nextInt();
        int arr[] = new int[num];
        // Take Array Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        boolean bool = false;
        // int count = 0;
        // int element = arr[0];
        for (int i = 0; i < arr.length-2; i++) {
            if (arr[i]>arr[i+1] && arr[i+1]<arr[i+2]) {
                bool = true;
                break;
            }
        }
        System.out.println(bool);
*/
 