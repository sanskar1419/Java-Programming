public class Merge_2_Sort_Array {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9};
        int arr2[] = {2,4,6,8,10,12,14};
        int m = arr1.length;
        int n = arr2.length;
        int M_array[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<m && j<n) {
            if(arr1[i]<=arr2[j])
            {
              M_array[k] = arr1[i];
              i++;
              k++;
            } else {
                M_array[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i<m) {
            M_array[k] = arr1[i];
              i++;
              k++;
        }

        while (j<n) {
            M_array[k] = arr2[j];
                j++;
                k++;
        }

     for (int k2 = 0; k2 < M_array.length; k2++) {
        System.out.print(M_array[k2] + " ");
     }
    }
}
