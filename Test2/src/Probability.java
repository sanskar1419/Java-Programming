import java.util.Scanner;

public class Probability {

    public static int factorial(double n)
    {
        int fact = 1;
        for(int i = 2 ; i<=n ;i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n and x");
        int n = s.nextInt();
        int x = s.nextInt();

        double totalProbability = factorial(8.0)/(factorial(1.0*n) * factorial(8.0-(1.0*n)));
        double redProbability = factorial(4.0)/(factorial(1.0*x) * factorial(4.0-(1.0*x)));
        double nonredProbability = factorial(4.0)/(factorial(1.0*(n-x)) * factorial(4.0-(1.0*(n-x))));

        int result = (int)(((nonredProbability*redProbability)/totalProbability)*100);
        System.out.println(result);
        

    }
}
