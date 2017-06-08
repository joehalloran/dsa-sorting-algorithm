# Data Structure and Algorithms coursework
Joe Halloran

## Part 1: Analysis of sorting algorithms

### Graph 1: Run time of various sorting algorithms

This graph shows the run time of 4 sorting algorithms for randomly generated arrays of lengths strating at 10,000 all the way up to 200,000.

Merge sort and quick sort are so close together I have a separate more detail graph to ilustrate the comparison

![graph 1](assets/graph1.png)

![graph 2](assets/graph2.png)


### Graph 2: Comparison of runtime for various sorting algorithms

### Time complexity discussion

## Part 2: Segregate even and odd numbers

### Pseudo code 

```
// Pseudo code
input array[]
low ← 0
high ← array.length
while low < high do
    while array[low] % 2 = 0 and low < list.length do       // Find next odd numbers at bottom of list
        low ← low + 1           // Increment
    end while
    while array[high] % 2 = 1 and high >= 0 do              // Find next even number at top of list
        high ← high - 1         // Decrement
    end while
    if low < high:                              // Only swap if odd number is lower in list than even numbers
        // Swap values
        temo ← array[low]
        array[low] ← array[high]
        array[high] ← temp
end while
```

### Time complexity discussion


## Part 3: Recursion

### Recursive method for A(n) - pseudo code
This algorithm works on the assumption that the code can 
```
// Pseudo code
A(n) {
    if n = 1 or n = 2 then // Base case 1 and 2
        return 1
    else if n = 3 then      // Base case 3
        return 2
    else
        return A(n-1) + A(n-3)  // Recursion call
    end if
}
```

### A(5)

                        A(5) = A(4) + A(2)
                              /          \
            A(4) = A(3) + A(1)            A(2) = 1
                   /         \                 /
          A(3) = 2          A(1) = 1          /
                   \          /              /                        
               A(4)= 2 + 1 = 3              /
                               \           /
                         A(5) = 3    +    1 = 4

### All possible arrangements for A(6)

A(6) = 6

* MMMMMM
* CMMM
* MCMM
* MMCM
* MMMC
* CC