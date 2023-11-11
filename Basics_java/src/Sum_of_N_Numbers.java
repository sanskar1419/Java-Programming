import java.util.Scanner;

public class Sum_of_N_Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number till you want sum : ");
        int num = s.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num)
        {
          sum = sum + i;
          i++;
        }
        System.out.println("The sum of " + num + " natural number is : " + sum);
    }
}
