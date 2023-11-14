import java.util.Scanner;

public class Ferehhite_celcius {

    public static void conversion(int start , int end , int width)
    {
       while (start<=end) {
         int result =  5*(start-32)/9;
        System.out.println(start+ " " + result);
        start = start+width;
       }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of start, end and width : ");
        int start = s.nextInt();
        int end = s.nextInt();
        int width = s.nextInt();
        conversion(start,end,width);
    }
}
