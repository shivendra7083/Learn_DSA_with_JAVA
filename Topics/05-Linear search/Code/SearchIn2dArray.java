
import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {25, 56, 79},
                {75, 26, 68, 49},
                {83, 64, 59, 42},
                {99, 20}
        } ;
        int target = 59 ;
        System.out.println(Arrays.toString(search(arr , target)));
        System.out.println((max(arr)));
    }
    static int[] search(int [][] arr , int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row,col} ;
                }
            }
        }
        return new int[]{-1 , -1} ;
    }
    static int  max(int [][] arr ) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max ;
    }
}
