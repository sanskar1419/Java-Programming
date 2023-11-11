import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 2;
        int count = 0;
        while (i<num) {
            if (num%i == 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }
}
