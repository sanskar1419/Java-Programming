import java.util.Scanner;

public class Miximum_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 4 digit number : ");
        int num = s.nextInt();

        int maxNum = Integer.MIN_VALUE;
        // System.out.println(maxNum);
        int i = 1;
        while (i<=1000) {  // while(num/i>0)
            int temp_Num = (num/(i*10))*i + (num%i);
            i=i*10;
            if (temp_Num > maxNum ) {
                maxNum = temp_Num;
            }
        }

        System.out.println(maxNum);

    }
}
