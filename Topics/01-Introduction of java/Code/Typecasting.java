import java.util.Scanner;

public class Typecasting {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // float num = sc.nextFloat();// auto convert to int to float . bcox float is bigger than int
        // System.out.println(num);   //this is auto type casting java 
        // int num = sc.nextInt();    // if you put input a folat. it will give error. 

        //Type casting

        //int num = (int)(25.55f); //manual narrowing
        // System.out.println(num); // manual typrcast to int . output will be 67

        //automatic type promotion in expressions

            // 1. java automatic promote each short,char and byte into "int" while evaluating  expression 
            // 2. long float and double into "long"
        // int a = 260;
        // byte b = (byte)(a);    // the maximum value byte store is 256 . 
        // System.out.println(b); // so the output will be 260 % 256 is 4


        // byte a = 70 ; 
        // byte b = 50 ; 
        // byte c = 60 ; 
        // int d = a*b/c ;          // Java automatic promoting these byte into int while doing this expresson
        // System.out.println(d);  // No error !

        // int number = ('A') ;
        // System.out.println(number); //Type casting
        //System.out.println("शिवेंद्र");  //no error java folows in unicode..
        
        //System.out.println(3 * 5.5 ); // output will be in float bcooz it type cast int to float

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s);
            //float + integer + double = double 
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
