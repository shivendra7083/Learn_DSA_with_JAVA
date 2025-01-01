
## 2d- Array

A **2D array** in Java is an array of arrays. It is often used to represent matrices or tables, where data is organized in rows and columns.

1. **Declaring a 2D Array**
```java
dataType[][] arrayName;
// example
int[][] matrix;  // Declares a 2D array of integers
```
---
2. . **Initializing a 2D Array**

 >*Note : Column is not mandatory to  intilize

-  **Method 1: Specifying Size

```java
int[][] matrix = new int[3][4];  // Creates a 2D array with 3 rows and 4 columns
```
-  **Method 2 : Direct Initialization *

```java
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```
---
3. **Accessing Elements in a 2D Array+

```java
int value = matrix[1][2];  // Accesses the element at the 2nd row, 3rd column (value is 7)
```
---
4. . **Iterating Over a 2D Array**
- Using Nested Loops:
```java
for (int i = 0; i < matrix.length; i++) {            // Loop through rows
    for (int j = 0; j < matrix[i].length; j++) {     // Loop through columns
        System.out.print(matrix[i][j] + " ");        // Print each element
    }
    System.out.println();  // New line after each row
}

```
- **Using Enhanced For Loop
```java
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();  // New line after each row
}
```
---
---

## Input/Output with diferent method

```java
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Declare and initialize the 2D array
        int[][] array = new int[rows][cols];

        // Input elements into the 2D array
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        // Output the 2D array in matrix form using nested loops
        System.out.println("2D Array (Using nested loops):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }

        // Output the 2D array using Arrays.deepToString()
        System.out.println("2D Array (Using Arrays.deepToString):");
        System.out.println(Arrays.deepToString(array));

        // Output each row using Arrays.toString()
        System.out.println("Each row (Using Arrays.toString):");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));  // Print each row as a 1D array
        }

        // Output using a for-each loop
        System.out.println("2D Array (Using for-each loop):");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();  // New line after each row
        }

        // Output each row using Arrays.toString() in a for-each loop
        System.out.println("Each row (Using Arrays.toString in for-each loop):");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));  // Print each row as a 1D array
        }

        scanner.close();
    }
}


```

### Input

```mathematica
Enter number of rows: 2
Enter number of columns: 3
Enter elements of the array:
1 2 3
4 5 6
```
#### output

```sql
2D Array (Using nested loops):
1 2 3 
4 5 6 
2D Array (Using Arrays.deepToString):
[[1, 2, 3], [4, 5, 6]]
Each row (Using Arrays.toString):
[1, 2, 3]
[4, 5, 6]
2D Array (Using for-each loop):
1 2 3 
4 5 6 
Each row (Using Arrays.toString in for-each loop):
[1, 2, 3]
[4, 5, 6]


```


### Explanation of the Output:

1. **Using Nested Loops**: Displays the 2D array in matrix format by iterating through each row and column.

2. **Using `Arrays.deepToString()`**: Prints the entire 2D array as a string.

3. **Using `Arrays.toString()`**: Outputs each row of the 2D array as a separate 1D array.

4. **Using For-Each Loop**: Iterates through each row and prints the elements in a matrix format.

5. **Using Arrays.toString() in a For-Each Loop**: Outputs each row of the 2D array as a separate 1D array using the `Arrays.toString()` method in a for-each loop for clarity.


---
---
---
