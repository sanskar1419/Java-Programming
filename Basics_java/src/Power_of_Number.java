import java.util.Scanner;
public class Power_of_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int power = s.nextInt();
        if (power == 0) {
            System.out.println(1);
            return;
        }
        int result = 1;

        while (power>0) {
            result = result*num;
            power--;
        }
        System.out.println(result);
    }
}
