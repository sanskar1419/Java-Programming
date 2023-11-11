import java.util.Scanner;
public class Average_of_three_nos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number : ");
        int a = s.nextInt();
        System.out.println("Enter the second number : ");
        int b = s.nextInt();
        System.out.println("Enter the third number : ");
        int c = s.nextInt();

        double avg = (double)(a+b+c)/3;
        System.out.println("Average of marks are : " + avg);
    }
}
