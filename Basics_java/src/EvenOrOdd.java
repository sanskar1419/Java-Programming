import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number to check for Even or Odd : ");
        int num = s.nextInt();

        if(num%2 == 0)
        {
            System.out.println("The Number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }
    }
}
