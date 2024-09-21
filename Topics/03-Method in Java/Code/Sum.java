
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        // Sum function 
        sum();  // Calling functon / method with brackets
        sum();  // we call method multiple times
        System.out.println("Print using method");
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
