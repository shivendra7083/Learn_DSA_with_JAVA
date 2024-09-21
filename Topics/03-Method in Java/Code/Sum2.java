
import java.util.Scanner;
public class Sum2 {
    public static void main(String[] args) {
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20 , 40);
        System.out.println(ans);
    }

    // Pass th value of numbers when you are calling method in main()
    public static int sum3(int a , int b) {
        int sum = a +b ;
        return sum;
    }

    // return the value

    static int sum2() {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
        //System.out.println("this will be not executee");

    }

    static void sum () {    // Inside bracket Parameter list
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

}
