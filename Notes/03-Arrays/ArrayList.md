An `ArrayList` in Java is a resizable array that is part of the `java.util` package. Unlike standard arrays, which have a fixed size, `ArrayList` allows you to dynamically add, remove, or access elements as needed. It is one of the most commonly used data structures in Java due to its flexibility.

#### Key Points:

- **Resizable:** Automatically grows as you add more elements.
- **Index-based:** Access elements using zero-based index.
- **Maintains Insertion Order:** Elements are stored and accessed in the order they were added.
- **Allows Duplicates:** Can contain duplicate elements.
- **Allows Null:** Can contain null elements.
- **Not Synchronized:** If used in a multithreaded environment, it should be synchronized externally.
---

### Syntax:

To use an `ArrayList`, you need to import it from `java.util`:
```java
import java.util.ArrayList;
```
### Declaration:
```java
ArrayList<Type> list = new ArrayList<>();
```
Where `Type` can be any object type (e.g., `String`, `Integer`, custom class, etc.). Java 7 and above allows you to omit the type in the constructor
```java
ArrayList<String> names = new ArrayList<>();
```
---

### Common Method 

####  *Add elements:
- `add(E e)`: Adds an element to the end of the list.
```java
list.add("Hello");
```
###### Input
```java
for (int i = 0; i < 5; i++) {  
    list.add(sc.nextInt());
```

#### *Get element:*
- `get(int index)`: Returns the element at the specified index.
```java
String element = list.get(0);
```

#### *Set element:
- `set(int index, E element)`: Replaces the element at the specified index.
```java
list.set(1, "New Value");
```

#### *Remove element:
- `remove(int index)`: Removes the element at the specified index.
```java
list.remove(2);
```
- `remove(Object o)`: Removes the first occurrence of the specified object.
```java
list.remove("Hello");
```

#### *Size:*
- `size()`: Returns the number of elements in the list.
```java
int size = list.size();
```

#### *Clear all elements:*
- `clear()`: Removes all elements from the list.
```java
list.clear();
```

#### *Check if empty:*
- `isEmpty()`: Checks if the list is empty.
```java
boolean isEmpty = list.isEmpty();
```

#### *Contains:*
- `contains(Object o)`: Checks if the list contains the specified element.
```java
boolean contains = list.contains("Element");
```
---
---

### Iterating over an ArrayList:

1. **Using a for loop:

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

```

2. **Using an enhanced for loop (for-each loop):

```java
for (String s : list) {
    System.out.println(s);
}
```

3. **Using an iterator:

```java
Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}
```
---

### Example:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        
        System.out.println("Fruits: " + fruits);
        
        // Access element
        System.out.println("First fruit: " + fruits.get(0));
        
        // Change element
        fruits.set(1, "Orange");
        
        // Remove element
        fruits.remove("Mango");
        
        // Size of the list
        System.out.println("Size of the list: " + fruits.size());
        
        // Iterate over elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

```
---

#### *When to use

- Use `ArrayList` when you need a flexible-sized array with fast random access and don’t mind the cost of resizing or shifting elements.
---
---
---
