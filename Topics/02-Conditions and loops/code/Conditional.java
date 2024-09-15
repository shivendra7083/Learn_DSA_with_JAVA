import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        /* 
         *      Syntax of if statement
         * if(boolean expression) {
         * //body
         * } else {
         *     // do this
         * }
         */

        int salary = 246000 ;
        // if(salary > 10000){
        //     salary = salary + 2000;
        // } else {
        //     salary = salary + 10000;
        // }
        // System.out.println(salary);

        // Multiple if else statement

        if (salary > 10000) {
            salary += 2000 ;
        } else if (salary > 20000) {
            salary += 3000 ;
        } else {
            salary += 1000 ;
        }
        System.out.println(salary);

        
    }

}
