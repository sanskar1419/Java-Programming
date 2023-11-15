import java.util.Scanner;

public class Linear_Search {
    public static void Search(int arr[] , int x)
    {
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] == x)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to be searched : ");
        int x = s.nextInt();
        Search(arr , x);
    }
}
