import java.util.Scanner;
public class Even_Odd_digit_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = s.nextInt();
        int even_sum = 0;
        int odd_sum = 0 ;
        while (num != 0) {
            int digit = num%10;
            num = num /10;
            if (digit%2 == 0) {
                even_sum += digit;
            } else
            {
                odd_sum += digit;
            }
        }

        System.out.println(even_sum+ " " + odd_sum);
    }
}
