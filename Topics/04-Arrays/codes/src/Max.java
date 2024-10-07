public class Max {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,10,5,40,100,5,30,1024, 10};
        System.out.println(max(arr));
    }
    // Imagine the arr  is not empty
    static int max(int [] arr) {
        int max = arr [0] ;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i] ;
            }
        }
        return max;
    }
}
