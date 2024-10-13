> *Linear search is a simple searching algorithm that checks every element of an array or list sequentially until the desired element is found. If the element is found, the algorithm returns its index; otherwise, it returns `-1`.
#### Steps:
1. **Start from the first element**: Compare the target element with the current element of the array.
2. **Move to the next element**: If the current element is not equal to the target, move to the next element.
3. **Repeat**: Continue until the target element is found or all elements are checked.
4. **Return index or `-1`**: If found, return the index of the target element. If not found, return `-1`.
### Time Complexity:
- **Best case**: O(1) – The target element is the first element.
- **Worst case**: O(n) – The target element is either the last element or not present.
- **Average case**: O(n) – The target element is somewhere in the middle.
---

![Pasted image 20241013183405](https://github.com/user-attachments/assets/c383f0d3-6813-4027-95db-f5dfbd32cad6)
---

![Pasted image 20241013183543](https://github.com/user-attachments/assets/4bf43cc3-d352-4847-a233-70541802dfdf)

---

### Space Complexity:

- O(1) – Linear search only uses a constant amount of extra memory, regardless of input size.
---
---

## Code Example
```java
public class LinearSearch {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // If target is found, return the index
            if (arr[i] == target) {
                return i;
            }
        }
        // If not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test array
        int[] arr = {10, 23, 15, 34, 7, 9};

        // Element to search
        int target = 34;

        // Perform linear search
        int result = linearSearch(arr, target);

        // Output the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}

```

###  *Important Notes on Linear Search:

 - **Simple and Intuitive**:  
Linear search is one of the simplest searching algorithms, easy to understand and implement, but it isn't the most efficient for large datasets.
---

* * **Unsorted Arrays**:  
Linear search works on **unsorted arrays**. It doesn't require the data to be in any particular order, unlike more advanced algorithms like binary search.
---

- **Sequential Search**:  
The algorithm checks each element in **sequential order** (from left to right) until the target element is found or the end of the array is reached.
---

- **Not Optimal for Large Data**:  
Due to its O(n) time complexity, linear search is **not efficient for large datasets**. More advanced algorithms like binary search (O(log n)) or hash-based techniques should be used in such cases.
---

- **Use Case**:  
Linear search is best used when:

- The dataset is small.
- The array is unsorted.
- Simplicity is preferred over speed.
---

- **Found vs Not Found**:

- If the element is found, linear search returns its **index**.
- If the element is **not found**, it returns **-1**.
---

- **Iterative in Nature**:  
Linear search typically uses an **iterative** approach, looping through each element of the array. However, it can also be implemented **recursively**, though recursion is less common for this algorithm due to increased overhead.
---

- **No Additional Setup Required**:  
Unlike algorithms that require the array to be sorted (e.g., binary search), linear search can be applied immediately to any dataset.


---
---
---
