## Find the largest of 3 numbers

``` java
import java.util.Scanner;

public class Largest {

    /**

     * @param args

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();


        // Q find the largest of the 3 numbers

        int max = a ;

        if(b > max) {

            max = b ;

        }

        if (c > max) {

            max = c ;

        }

        System.out.print("largest number is : " + max);

    }

}
```
---
## Fibonacci numbers

Fibonacci numbers are a sequence of numbers where each number is made by adding the two numbers before it. It starts with 0 and 1. So, after 0 and 1, the next number is 1 (0 + 1), then 2 (1 + 1), then 3 (1 + 2), then 5 (2 + 3), and so on.

So the sequence goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55...

- Its basically add previous 2 number and make next number, start with o and 1
- ex - 0 , 1 , 1(0+1) , 2(1+1) , 3(1+3) , 5(3+2)    ----- 

### Program

`for ` loop :
``` java
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: How many Fibonacci numbers to generate
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // First two numbers of the Fibonacci series
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        // Loop to generate the next Fibonacci numbers
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}

```

`whie` loop
``` java
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: How many Fibonacci numbers to generate
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // First two numbers of the Fibonacci series
        int first = 0, second = 1;

        System.out.print("Fibonacci Series: " + first + " " + second);

        int count = 2; // Count starts at 2 because we've printed the first two numbers

        // Generate Fibonacci numbers using while loop
        while (count < n) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
            count++;
        }
    }
}

```


## Counting occurrence

To find the **last digit** of a given number in Java, you can use the modulus (`%`) operator. The modulus operator gives you the remainder of division, and dividing a number by 10 gives you the last digit.
### Logic :

- Any number `% 10` gives its last digit. For example:
	- 123 % 10 = 3
	- 9876 % 10 = 6


1. If we need to count digit in  the given number

- If you have the number `12345`, you would divide it by 10 repeatedly
- 12345 → 1234 → 123 → 12 → 1 → 0
- The number has 5 digits
``` java
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
```


2. If you want to count how many times a particular digit (like 3, for example) appears in a given number

- Suppose you want to count how many times the digit `3` appears in the number `13353`
- Extract digits one by one: 13353 → 3 → 5 → 3 → 3 → 1
- Count how many times `3` appears: it appears 3 times
#### Example : Code to Count a Particular Digit in a Given Number:
``` java
import java.util.Scanner;

public class CountParticularDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the digit to count: ");
        int digit = scanner.nextInt();

        int count = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) {
                count++;
            }
            number /= 10;
        }

        System.out.println("The digit " + digit + " appears " + count + " times.");
    }
}
```

### Reverse

``` java
import java.util.Scanner;
public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print(" Enter number : ");
        int n = sc.nextInt();
        int reversednum = 0 ;

        while (n > 0) {
            int lastdigit =  n % 10 ;
            // Another method : hide 2 and show 1 and 3 
            //reversednum = reversednum * 10 + lastdigit ;  // 1
            System.out.print(lastdigit);   // This is easy method   // 2
            n = n/10 ;
        }
        //System.out.println("Reverse num is : " + reversednum);  // 3
    }
}
```