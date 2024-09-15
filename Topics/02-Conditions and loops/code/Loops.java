import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
                /*
            Syntax of for loops:

            for (initialisation; condition; increment/decrement) {
                // body
            }
            */
            // Q: Print numbers from 1 to 5
            // for (int num = 1 ; num <=5 ; num += 1) {
            //     System.out.println(num);
            // }

            // Print number from 1 to n 
            Scanner input = new Scanner(System.in);

            // System.out.print("Enter number :");
            // int n = input.nextInt();
            // for (int num = 1 ; num <= n ; num++){
            //     System.out.println(num + " " + "Hello world  ");

                // while loops
            /*
                Syntax:
                while (condition) {
                // body
                }
            */

            // int num = 1;
            // while(num<=5){
            //     System.out.println(num);
            //     num += 1 ;
            //     }


                        // do while
            /*

                do {
                    // body
                } while (condition);

            */

            int n = 1 ;
            do{
                System.out.println("HEllo world");
            }while ( n != 1) ;
        }
    }
