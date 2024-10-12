public class FindMIn {
    public static void main(String[] args) {
        int [] arr = { 45, 26, 79, 15, 28, 67 ,91, 82, 46, 72, 3 , 48, 22} ;
        System.out.println(findMin(arr));
    }
    // Assume arr.length ! = 0
    // return the minimum value of the array
    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                 min = arr[i];
            }
        }
        return min ;
    }
}
