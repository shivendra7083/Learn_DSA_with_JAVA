public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = { 45, 26, 79, 15, 28, 67 ,91, 82, 46, 72, 3 , 48, 22} ;
        int target = 82 ;
        System.out.println(linearSearch(arr, target, 3, 12));
    }
    static int linearSearch(int[] arr, int target , int start , int end) {
        if (arr.length == 0) {
            return -1 ;
        }
        // Run the for loop
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this statement will execute if none of the return statement above  has executed
        // hence the target is not found
        return -1 ;
    }
}
