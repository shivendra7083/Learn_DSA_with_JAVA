import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] nums = {25 , 65 , 85 , 64 , 63 , 110 , 11 , 58} ;
        // Input array
//        int [] nums = new int[5];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = sc.nextInt();
//        }

        System.out.print("Enter the target : ");
        int target = sc.nextInt() ;
        System.out.println(linearSearch(nums, target));
    }


    // Search in the array : return the index if item is found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1 ;
        }
        // Run the for loop
        for (int index = 0; index < arr.length; index++) {
            // check element at every index if it is =  target
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
