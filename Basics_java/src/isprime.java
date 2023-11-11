import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a prime check : ");
        int num = s.nextInt();
        boolean Isprime = true;
        int i = 2;
        while (i<=Math.sqrt(num)) {
            if (num%i == 0) {
                Isprime = false;
                break;
            }
            i++;
        }

        if (Isprime == true) {
            System.out.println("Number is prime!!!!!!!!!");
        }
        else
        {
            System.out.println("Number is not prime!!!!!!!!!!");
        }
    }
}
