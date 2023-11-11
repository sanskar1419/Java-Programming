package Operator_loop.src;

import java.util.Scanner;

public class Number_Sequence {
    public static void main(String[] args) {
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
    }
}
