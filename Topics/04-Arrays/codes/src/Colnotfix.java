import java.util.Arrays;

public class Colnotfix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4},
                {1, 2},
                {1, 2, 5, 6},
        };
        // Method 1
        for (int[] a : arr)
            System.out.println(Arrays.toString(a));

    }
}
