# Method / Function in java

- A **method** is a block of code which only runs when it is called.
- You can pass data, known as parameters, into a method
- Methods are used to perform certain actions, and they are also known as **functions**.
- why use methods? To reuse code: define the code once, and use it many times.

### Syntax

``` java
access_modifier return_type method_name(parameter_list/ type arg1, type arg2) {
    // method body (the code that will be executed)
    return value;  // optional, only if return_type is not void
}

```
#### Explanation
- **Access Modifier**: Defines the visibility of the method (e.g., `public`, `private`, `protected`, or no modifier for package-private).
	- `public`: The method is accessible from anywhere
	- `private`: The method is accessible only within the class.
	- `protected`: Accessible within the same package or subclasses.
- **Return Type**: The type of data the method will return (e.g., `int`, `void`, `String`).
	- If no value is returned, the return type must be `void`.
- **Method Name**: Follows camelCase naming convention, and should describe the method's function.
- **Parameter List**: A list of input parameters for the method, enclosed in parentheses. If no parameters are needed, leave the parentheses empty `( int a , int b );`
- **Method Body**: The code inside the method, enclosed within curly braces `{}`, that defines what the method does.
- **Return Statement**: Optional and used only if the method returns a value (i.e., the return type is not `void`).

#### Example 1: Method with No Parameters and No Return Value

``` java
public void displayMessage() {
    System.out.println("Hello, World!");
}
```

#### Example 2: Method with Parameters and a Return Value

``` java
public int addNumbers(int a, int b) {
    return a + b;
}
```

#### Example 3: Static Method

``` java
public static String greet(String name) {
    return "Hello, " + name + "!";
}
```
#### key points -
- **Static Methods**: Can be called using the class name directly without creating an object.
- **Instance Methods**: Require creating an object of the class to be invoked.
- **Method overloading** allows multiple methods with the same name but different parameter lists.

#### Example : complete Java Method Demonstration
``` java
public class MethodExample {

    // Static method without parameters and return value
    public static void printWelcomeMessage() {
        System.out.println("Welcome to the Java Methods Example!");
    }

    // Static method with parameters and a return value
    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    // Instance method without parameters and return value
    public void displayMessage() {
        System.out.println("This is an instance method.");
    }

    // Instance method with parameters and return value
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method overloading: Same method name but different parameters
    public int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    // Method to demonstrate recursion (a method calling itself)
    public int factorial(int n) {
        if (n == 1) {
            return 1;  // Base case
        }
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        // Calling a static method (no need for an object)
        printWelcomeMessage();

        // Calling a static method with parameters
        int product = multiplyNumbers(5, 10);
        System.out.println("Multiplication result: " + product);

        // Creating an instance of the MethodExample class to call instance methods
        MethodExample obj = new MethodExample();

        // Calling an instance method
        obj.displayMessage();

        // Calling an instance method with parameters and storing the result
        int sum = obj.addNumbers(5, 10);
        System.out.println("Sum of 5 and 10: " + sum);

        // Calling the overloaded method with three parameters
        int totalSum = obj.addNumbers(5, 10, 15);
        System.out.println("Sum of 5, 10, and 15: " + totalSum);

        // Calling the recursive method to calculate factorial
        int fact = obj.factorial(5);
        System.out.println("Factorial of 5: " + fact);
    }
}
```
```
```

``` java
// output

Welcome to the Java Methods Example!
Multiplication result: 50
This is an instance method.
Sum of 5 and 10: 15
Sum of 5, 10, and 15: 30
Factorial of 5: 120

```

---

#### Call the method

write the method's name followed by two parentheses **()** and a semicolon**;**
`myMethod();`

- **Calling a Static Method**
- **Calling an Instance Method**
- Calling Methods with Parameters	```
``` java
public class MyClass {
    // Method with parameters
    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Creating an object to call the instance method
        MyClass obj = new MyClass();
        
        // Calling the method and passing arguments
        int sum = obj.addNumbers(5, 10);
        
        System.out.println("Sum: " + sum);
    }
}

// output
// Sum: 15

```

-  Calling a Method that Returns a Value
---
### Method overloading

With **method overloading**, multiple methods can have the same name with different parameters:
``` java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```

---
## Swap a number in java

``` java
public class Swap {  
    public static void main(String[] args) {  
        
        // Swap a number in java
        int a = 10 ;  
        int b = 20 ;  
        int temp = a ;  
        a = b ;  
        b = temp ;  
        System.out.println(a + " " + b);  
    }  
}
```



---
## Java Scope
In Java, variables are only accessible inside the region they are created. This is called **scope**.

## Method Scope

- Variables or parameters defined within a method have method scope, meaning they are only accessible within that method.
- Example:
``` java
public class Example {
    public void display(int number) {  // number has method scope
        System.out.println(number);  // accessible within this method
    }
}
```

## **Block Scope**:

- Block scope refers to variables declared inside specific blocks like loops, if-else blocks, or methods. They are only accessible within that block.
- example : 
``` java
public class Example {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {  // 'i' has block scope, accessible only inside the loop
            System.out.println(i);
        }
        // System.out.println(i);  // Error: i cannot be resolved to a variable
    }
}

``` 

## Anything can be declare outside the block cannot  declare  inside the block ,
### but, we can update the value inside the block(use/)


## Anything can be declare  inside the block can be declare  outside the block. 
### value initialize inside the the block , will remain in block .
### Also ,cannot use outside the block


---
## Shadowing in java

**Shadowing** in Java occurs when a variable declared in a local scope (e.g., inside a method or block) has the same name as a variable declared in an outer scope (e.g., in the class). The local variable **"shadows"** or hides the outer variable, making the outer one inaccessible within that scope.
``` java
class Example {
    int x = 10;  // instance variable

    public void show() {
	    **System.out.println(x); // print 10**
        int x = 20;  // local variable shadows the instance variable
        System.out.println(x);  // prints 20 (local x)
    }
}

```
Here, the local `x` hides the instance variable `x`. To access the outer `x`, you'd use `this.x`.
#### Accessing Shadowed Variables:
To access the outer variable, use the `this` keyword:

``` java
System.out.println(this.x);  // prints 10
```
---
### Variable argument
In Java, **varargs** (variable arguments) allow a method to accept **zero or more arguments** of a specific type. This is useful when you don't know in advance how many arguments will be passed to the method.

### Syntax : 

`data_type ...reference_ variable`    `int = ...num
#### Example

``` java
public class VarargsExample {
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        printNumbers(1, 2, 3);  // Passing multiple arguments
        printNumbers(10, 20);   // Passing fewer arguments
        printNumbers();         // Passing no arguments
    }
}

```

### Rules of Varargs :

- **Only One Varargs Parameter**: A method can have only **one** varargs parameter.
``` java
public void method(int... x, String... y);  // Error: can't have two varargs
```

- **Varargs Must Be Last**: If there are multiple parameters, the varargs parameter must be the **last** one in the method signature.
``` java
public void method(String s, int... x);  // Valid
public void method(int... x, String s);  // Error: varargs must be last

```
---
## Method overloading

**Function (or Method) Overloading** in Java is a feature that allows you to define multiple methods in a class with the same name but different parameter lists (types, number, or both). The correct method to call is determined by the **number** or **types of arguments** passed when the method is invoked.
### Key Points:

1. **Same Method Name**: All overloaded methods must have the same name.
2. **Different Parameter Lists**: The methods must differ in:
    - Number of parameters
    - Type of parameters
    - Order of parameters
3. **Return Type Doesn’t Matter**: Changing only the return type of methods does not count as overloading.

### Example of Method Overloading:
``` java
public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(2, 3));        // Calls add(int, int)
        System.out.println(calc.add(1, 2, 3));     // Calls add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));    // Calls add(double, double)
    }
}

// output

5
6
6.0

```
