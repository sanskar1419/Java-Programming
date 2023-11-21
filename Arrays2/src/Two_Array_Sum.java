public class Two_Array_Sum {

    public static int[] Array_To_Int(int arr1[] , int arr2[])
    {
       int m = arr1.length-1;
       int n = arr2.length-1;
       int k = Math.max(arr1.length, arr2.length);
       int output[]  = new int[k+1];
       int carry = 0;
       while (m>=0 && n>=0) {
        int sum = arr1[m] + arr2[n] + carry;
        carry = sum/10;
       output[k] = sum%10;
        k--;
        m--;
        n--;
     }

     while (m>=0) {
         int sum = arr1[m] + carry;
        carry = sum/10;
       output[k] = sum%10;
        k--;
        m--;
     }

     while (n>=0) {
         int sum = arr2[n] + carry;
        carry = sum/10;
       output[k] = sum%10;
        k--;
        n--;   
     }
     output[0] = carry;
     return output;
    }
    public static void main(String[] args) {
        int arr1[] = {6,2,4};
        int arr2[] = {7,5};
        // System.out.println(Array_To_Int(arr2));
        // System.out.println(Array_To_Int(arr2) + Array_To_Int(arr1));
        int output[] = Array_To_Int(arr1, arr2);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}








// Way 2 
// public class Two_Array_Sum {

//     public static int Array_To_Int(int arr[])
//     {
//         int result = 0;
     
//         int j = 0;
//         while (j<arr.length) {
//             result = result*10 + arr[j];
          
//             j++;
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         int arr1[] = {6,2,4};
//         int arr2[] = {7,5,6};
//         // System.out.println(Array_To_Int(arr2));
//         System.out.println(Array_To_Int(arr2) + Array_To_Int(arr1));
//     }
// }

