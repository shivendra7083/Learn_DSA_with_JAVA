import java.util.Scanner;
public class Calc_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no : ");
        int num1 = sc.nextInt();
        System.out.print("enter 2nd no : ");
        int num2 = sc.nextInt();
        System.out.print("enter operator : ");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' :System.out.println(num1+num2);
            break;
            
            case '-' : System.out.println(num1-num2);
            break;

            case '*' : System.out.println(num1*num2);
            break;

            case '/' : 
            if (num2 != 0 ){
                System.out.println(num1 / num2 );
            } else {
                System.out.println("Not divide by zero") ;
            }
            break;

            case '%' : System.out.println(num1 % num2);
            break;

            default: System.out.println("operator not found");

        }
    }
}
