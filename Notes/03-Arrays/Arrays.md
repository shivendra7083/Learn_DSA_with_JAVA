
# Array in java

 *Arrays are a fundamental data structure in Java that store a collection of elements of the same data type. They are indexed, allowing you to access elements by their position (starting from 0).

## Syntax of array in java

1. **Declaration** : To declare an array, specify the data type, followed by square brackets (`[]`).

```java
dataType[] arrayName;
// Example
int [] num ;
```


2. **Creation**: Allocate memory for the array using the `new` keyword, followed by the type and size of the array.
```java
arrayName = new dataType[arraySize];
// example
numbers = new int[5];  // Creates an array of 5 integers
```


3. **Declaration and Creation in One Step**:
```java
dataType[] arrayName = new dataType[arraySize];
// Example
int[] numbers = new int[10];  // Creates an array of 10 integers
```

4. **Declaration, Creation, and Initialization in One Step**:
```java
dataType[] arrayName = {value1, value2, value3, ...};
// Example
int[] myNum = {10, 20, 30, 40, ...};
```

5. **Accessing Elements**: You access an array element using the array index. Indices start at `0`.
```java
arrayName[index];
// Example
arr [0]
```
>  **Note:** Array indexes start with 0: [0] is the first element. [1] is the second element, etc. 

6. **Array Length**: The size (number of elements) of the array can be retrieved using `arrayName.length`
```java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
System.out.println(cars.length);
// Outputs 4
```

7. **Iterating Through an Array**: Use a loop to traverse and process each element.
```java
for (int i = 0; i < arrayName.length; i++) {
    System.out.println(arrayName[i]);
}
```

8. **Change of element of an array :** To change the value of a specific element, refer to the index number:
```java
	num [0] = 5 ;
```


### Example with syntax

```java
public class Main {
    public static void main(String[] args) {
        
        // 1. Declare an array of integers
        int[] numbers;
        
        // 2. Create an array of 5 integers
        numbers = new int[5];
        
        // 3. Initialize array elements individually
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // 4. Alternatively, declare, create, and initialize the array in one step
        int[] moreNumbers = {1, 2, 3, 4, 5};
        
        // 5. Access and print elements
        System.out.println("First element: " + numbers[0]);  // Outputs 10
        System.out.println("Second element: " + moreNumbers[1]);  // Outputs 2

        // 6. Loop through the array and print each element
        System.out.println("Printing numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
```
---

## *Most common method of print an array

#### Using a `for` Loop**

- The most common method is using a `for` loop to iterate through each element and print them.

```java
int[] array = {1, 2, 3, 4, 5};

for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
```

####  Using an Enhanced `for` Loop (for-each loop)**
- The enhanced `for` loop simplifies iteration over arrays.

```java
int[] array = {1, 2, 3, 4, 5};

for (int element : array) {
    System.out.println(element);
}
```

### **Using `Arrays.toString()` Method**
- This method from the `java.util.Arrays` class converts the array to a `String` and prints it.3
```java
import java.util.Arrays;

int[] array = {1, 2, 3, 4, 5};
System.out.println(Arrays.toString(array));
```
---

## Input in java

- u can take user input for arrays using the `Scanner` class.
- **Loop through the Array**: Use a loop to take input for each element of the array.
#### Example: Inputting Values into an Integer Array :

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);
        
        // Step 2: Declare the array and its size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size]; // Creates an array of 'size' elements
        
        // Step 3: Take input for each element of the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt(); // Takes input for each element
        }
        
        // Step 4: Print the array to verify input
        System.out.println("Array elements are:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        
        scanner.close();  // Close the Scanner to prevent resource leaks
    }
}
```


#### Output :

```mathematica
Enter the size of the array: 4
Enter 4 integers:
10
20
30
40
Array elements are:
10 20 30 40

```
---
---
---
