import java.util.Scanner;

public class Fahrenhit_to_celcius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the starting, ending index and Step size : ");
        int start = s.nextInt();
        int end = s.nextInt();
        int step_size = s.nextInt();

        float fahrenhit;
        while(start<=end)
        {
            fahrenhit = (float)(5*(start-32))/9;
            System.out.println(start + " " + fahrenhit);
            start += step_size;
        }
        // for(int i = start ; i<=end ; i++)
        // {
        //     fahrenhit = (double)(5*(start-32))/9;
        // }
    }
}
