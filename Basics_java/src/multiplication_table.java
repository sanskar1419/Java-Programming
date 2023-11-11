import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number for multiplication : ");
        int num = s.nextInt();
        int i = 1;
        while (i<=10) {
            System.out.println(num*i);
            i++;
        }
    }
}
