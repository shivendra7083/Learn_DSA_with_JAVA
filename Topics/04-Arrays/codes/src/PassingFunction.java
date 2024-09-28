import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] num = { 10 , 20 , 30 , 40 , 50} ;
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change (int[] arr) {
        arr[0] = 100 ;

    }
}
