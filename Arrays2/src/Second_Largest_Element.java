public class Second_Largest_Element {
    public static void main(String[] args) {
        int arr[] = {4,3,10,9,2};
        if (arr.length < 2) {
            System.out.println(Integer.MIN_VALUE);
            return;
        }
        int first_Max = Integer.MIN_VALUE;
        int Second_Max = Integer.MIN_VALUE;

       for (int i = 0; i < arr.length; i++) {
        if (arr[i] > first_Max) {
            Second_Max = first_Max;
            first_Max = arr[i];
        } else if(arr[i]  > Second_Max)
        {
            Second_Max = arr[i];
        }
       }

        System.out.println(Second_Max);
    }
}

/* Approch 1
public class Second_Largest_Element {
    public static void main(String[] args) {
        int arr[] = {4,3,10,9,2};
        int first_Max = Integer.MIN_VALUE;
        int Second_Max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first_Max) {
                first_Max = arr[i];
            }
        }

         for (int j = 0; j < arr.length; j++) {
            if (arr[j] > Second_Max && arr[j] != first_Max) {
                Second_Max = arr[j];
            }
        }

        System.out.println(Second_Max);
    }
}
*/