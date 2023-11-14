import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.print( (num & 1 ) == 0 ? "Even" : "Odd");
    }
}
