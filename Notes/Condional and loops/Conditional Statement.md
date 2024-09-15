# If...else statement

An `if-else` statement is a conditional statement that executes different blocks of code based on whether a condition is true or false:
-  If: Executes a block of code if the condition is true
-  Else: Executes a block of code if the condition is false
## Syntax

```
if (condition) {
    // code to execute if condition is true
} else {
    // code to execute if condition is false
}

```
### Example

```
public class Main {
    public static void main(String[] args) {
        int age = 18;
        
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}

```

---

## Else...if Statement

Use `else-if` statement to specify a new condition if the first condition is False

### Syntax

```
if (condition1) {
    // code to execute if condition1 is true
} else if (condition2) {
    // code to execute if condition2 is true
} else {
    // code to execute if both conditions are false
}

```

## Example

```
public class Main {
    public static void main(String[] args) {
        int age = 25;
        
        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else if (age >= 18 && age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}

```

---


# Ternary operator

The **ternary operator** is a shorthand way of writing an `if-else` statement. It is also known as the **conditional operator**. The ternary operator uses three operands: a condition, a result for `true`, and a result for `false`

### Syntax

```
result = (condition) ? value_if_true : value_if_false;

```


### Example : Even_Odd program

```
public class Main {
    public static void main(String[] args) {
        int number = 10;

        // Using ternary operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Output the result
        System.out.println(number + " is " + result);
    }
}

```

---


# Java Switch Statement

Instead of writting many if..else statement , you can use the `switch`  statement .

## Syntax
```
switch (expression) {
    case value1:
        // Code to execute if expression equals value1
        break;
    case value2:
        // Code to execute if expression equals value2
        break;
    // ...
    default:
        // Code to execute if expression doesn't match any case
}
```

-  **Expression:** This is an expression that evaluates to a value of a data type that can be compared using the `==` operator (e.g., `int`, `char`, `enum`)
- **Cases:** Each `case` specifies a possible value for the expression. If the expression matches a case value, the corresponding code block is executed.
- **Default:** The `default` case is optional and is executed if the expression doesn't match any of the case values.

### Example : Days of the week
```
public class Main {
    public static void main(String[] args) {
        int day = 3;
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

```


---
---
# Break and continue statement

In Java, the `break` and `continue` statements are control flow mechanisms used within loops,
(`for`  `while`, `do-while`) or `switch` statements. Here's how they work:

## `break` statement

The `break` statement is used to exit a loop or switch statement immediately, regardless of the remaining iterations or cases.
* Immediately terminates the innermost loop it is contained within.
* Execution jumps to the statement following the loop.
* Often used to exit a loop prematurely when a certain condition is met.
### Syntax

`break;` 

#### Example : Breaking a loop when a condition is met

```
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Exit the loop when i is 5
            }
            System.out.println(i);
        }
    }
}

```
- Output will be 1 ,2 , 3 and 4 .

## `continue` Statement

The `continue` statement skips the current iteration of the loop and moves to the next iteration, without terminating the loop

### Syntax

`continue;`

#### Example : Skipping certain iterations

```
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip the current iteration when i is 3
            }
            System.out.println(i);
        }
    }
}

```

- Output will be 1 ,2 , 4  and 5 .

## Key Differences:

- **`break`**: Exits the loop or switch statement completely.
- **`continue`**: Skips the rest of the code in the current iteration and proceeds to the next iteration of the loop.


---
---
---


