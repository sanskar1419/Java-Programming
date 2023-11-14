package Test1.src;

import java.util.Scanner;

public class APpTerm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of term in AP : ");
        int n = s.nextInt();
        int prev = s.nextInt();
        int current = s.nextInt();
        int diff = current-prev;
        prev = current;
        int i = 3;
        while (i<=n) {
            current = s.nextInt();
            i++;
            if (current != prev+diff) {
                System.out.println(false);
                return;
            }

            prev = current;
        }
        System.out.println(true);
    }
}
