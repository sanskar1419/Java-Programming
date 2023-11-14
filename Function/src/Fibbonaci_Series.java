import java.util.Scanner;

public class Fibbonaci_Series {

    public static void check(int n){
        int prev = 0;
        int current = 1;
        int count = 1;
        while (count<n) {
            int next = current + prev;
            prev = current;
            current = next;
            count++;

            if(next==n)
            {
              System.out.println(true);
              return;
            }
            
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. for series check : ");
        int num = s.nextInt();
        check(num);
    }
}
