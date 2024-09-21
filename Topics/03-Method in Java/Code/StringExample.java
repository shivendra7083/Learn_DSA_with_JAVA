import java.util.Scanner;

public class StringExample {
    public static <string> void main(String[] args) {
        //STing example 
//        String message  = greet();
//        System.out.println(message);

//        String personalized = myGreet("Shivendra");
//        System.out.println(personalized);
//        System.out.println(myGreet("Shivendra"));

        System.out.print("Enter your name  : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(myGreet(name));
    }
    public static String myGreet(String name){
        String message = "Hello " + name; ;
        return message;
    }
    public static String greet() {
        String greeting = "how are you" ;
        return greeting;
    }
}