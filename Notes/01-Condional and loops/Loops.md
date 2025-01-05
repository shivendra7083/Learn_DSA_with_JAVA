# Loops

In Java, loops are used to execute a block of code repeatedly based on a condition. Java provides several types of loops, each suited for different tasks. The main types of loops in Java are:
## `for` loop

- Used when you know in advance how many times you need to repeat a block of code
- when the number of iterations is known beforehand
## Syntax

``` java
for (initialization; condition; update / increment / decrement) {
    // code to be executed
}
```

### Example 

``` java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

```
- output

``` java
0
1
2
3
4
```

---

## `while` loop

- The `while` loop is used when the number of iterations is not known and depends on a condition being true
- The `while` loop loops through a block of code as long as a specified condition is `true` 

### Syntax

``` java
while (condition) {
    // code to be executed
}
```

### Example

``` java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

```

- Output : Same as output of `for` loop

---

## `do-while` Loop

- The `do-while` loop is similar to the `while` loop, but it guarantees that the loop will be executed at least once because the condition is checked after the loop body.
- The conditon is wheater `true` or `false` but Statement will run atleast once times. 
### Syntax

``` java
do {
    // code to be executed
} while (condition);

```

### Example

``` java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);

``` 

- Output will be same

---
---