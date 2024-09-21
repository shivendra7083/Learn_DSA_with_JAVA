import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun();
//        multiple(2, 3, "Kunal", "Rahul", "dvytsbhusc");
//        demo(20, 16, 46, 87, 54);   // print in form of array of sting
    }

    static void demo(int ...v) {        // Array of int
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}