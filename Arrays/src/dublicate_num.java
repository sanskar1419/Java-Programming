public class dublicate_num {
    public static void main(String[] args) {
        int arr[] ={0,2,1,3,1};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    return;
                }
            }
        }
    }
}
