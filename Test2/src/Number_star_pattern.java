import java.util.Scanner;

public class Number_star_pattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number for pattern : ");
        int n = s.nextInt();

        int  i = 1 ;
        while (i<=n) {
            int j =1 ;
            while (j<=n-i+1) {
                System.out.print(j);
                j++;
            }
            int star = 1;
            while (star<= 2*i -2) {
                System.out.print('*');
                star++;
            }
            int k =1 ;
            int p = n-i+1;
            while (k<=n-i+1) {
                System.out.print(p);
                k++;
                p--;
            }

            System.out.println();
            i++;
            
        }
    }
}
