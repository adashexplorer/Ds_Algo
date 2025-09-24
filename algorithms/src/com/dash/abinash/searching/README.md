# 🔍 Searching Algorithms in DSA

![Language](https://img.shields.io/badge/language-Java%20%7C%20C++%20%7C%20Python-blue)
![Focus](https://img.shields.io/badge/focus-DSA%20%26%20System%20Design-brightgreen)
![Level](https://img.shields.io/badge/role-Senior%20Developer%20%7C%20Architect-orange)
![Last Updated](https://img.shields.io/github/last-commit/adashexplorer/Ds_Algo)

A **comprehensive guide** to searching algorithms for interview preparation, ranging from **basic DSA** to **system-level techniques** used in large-scale architectures.

---

## 📌 Table of Contents
- [1. Core Searching Algorithms (Must-Know)](#1-core-searching-algorithms-must-know)
- [2. Optimized Searching (Good-to-Know)](#2-optimized-searching-good-to-know)
- [3. String / Pattern Searching](#3-string--pattern-searching)
- [4. Tree & Graph Based Searching](#4-tree--graph-based-searching)
- [5. System & Architecture-Level Searching](#5-system--architecture-level-searching)
- [6. Complexity Summary](#6-complexity-summary)
- [7. Resources](#7-resources)

---

## 1. Core Searching Algorithms (Must-Know)
✅ These are fundamental and appear frequently in interviews.

- **Linear Search** – O(n), baseline method.
- **Binary Search** – O(log n), works on sorted data.
    - First / Last occurrence
    - Search in rotated sorted array
    - Search in infinite / unbounded array
    - Binary Search on Answer (parametric search)
- **Fibonacci Searching**
- **Meta Binary Search**
- **Hash Table Search** – Avg O(1), worst O(n).
- **DFS (Depth First Search)** – Graph/Tree search.
- **BFS (Breadth First Search)** – Shortest path in unweighted graph.

---

## 2. Optimized Searching (Good-to-Know)
⚡ These are specialized improvements over linear/binary search.

- **Exponential Search** – O(log i), for infinite/unbounded arrays.
- **Jump-Search** – O(√n), works on sorted arrays.
- **Interpolation Search** – O(log log n) best, O(n) worst.
- **Ternary Search** – Divide search range into 3 parts, often used in optimization.
- **Trie Search** – O(L), where L = length of key (used in dictionaries, autocomplete).

---

## 3. String / Pattern Searching
📖 Essential when dealing with text, logs, or sequences.

- **Naive Pattern Matching** – O(n·m).
- **KMP (Knuth-Morris-Pratt)** – O(n + m), efficient prefix table approach.
- **Rabin-Karp** – Hash-based, good for multiple pattern matching.
- **Boyer-Moore** – Practical efficiency due to heuristics.

---

## 4. Tree & Graph Based Searching
🌳 Critical for problems involving hierarchical or network structures.

- **BST (Binary Search Tree) Search** – Avg O(log n), worst O(n).
- **Balanced BSTs (AVL, Red-Black Tree)** – Guaranteed O(log n).
- **B-Trees, B+ Trees** – Used in databases & filesystems.
- **DFS & BFS Variants** – Cycle detection, pathfinding, connectivity.
- - **Best First Searching (BeFS)** Graph based searching (Heuristic-driven graph search algorithm)
- **Bidirectional Search** – Efficient shortest path search between two nodes.

---

## 5. System & Architecture-Level Searching
🏗️ For **senior/architect roles**, knowing how searching scales in real systems is key.

- **Balanced BSTs** – AVL, Red-Black, B-Tree, B+ Tree.
- **Skip Lists** – Probabilistic O(log n) search (used in Redis, LevelDB).
- **Bloom Filters** – Space-efficient probabilistic membership testing.
- **Inverted Index** – Used in full-text search engines (Elasticsearch, Lucene).
- **Consistent Hashing** – Efficient search/distribution in distributed systems.
- **Locality Sensitive Hashing (LSH)** – Approximate / similarity search.

---

## 6. Complexity Summary

| Algorithm              | Best Case | Avg Case | Worst Case | Notes |
|-------------------------|-----------|----------|------------|-------|
| Linear Search           | O(1)      | O(n)     | O(n)       | Works on unsorted data |
| Binary Search           | O(1)      | O(log n) | O(log n)   | Sorted data only |
| Jump Search             | O(1)      | O(√n)    | O(√n)      | Sorted arrays |
| Exponential Search      | O(1)      | O(log i) | O(log i)   | Unbounded arrays |
| Interpolation Search    | O(1)      | O(log log n) | O(n)  | Uniformly distributed data |
| Trie Search             | O(L)      | O(L)     | O(L)       | L = length of key |
| DFS / BFS               | O(V+E)    | O(V+E)   | O(V+E)     | Graph traversal |
| KMP String Search       | O(n+m)    | O(n+m)   | O(n+m)     | Efficient for pattern matching |
| Rabin-Karp              | O(n+m)    | O(n+m)   | O(n·m)     | Depends on hash collisions |

---

## 7. Resources
📚 Useful references to go deeper:
- [GeeksforGeeks – Searching Algorithms](https://www.geeksforgeeks.org/searching-algorithms/)
- [Stanford Algorithms Courses](http://online.stanford.edu/courses)
- [System Design Primer](https://github.com/donnemartin/system-design-primer)

---

🚀 **Next Step:**  
Start with [Core Algorithms](#1-core-searching-algorithms-must-know), then move to [Pattern Searching](#3-string--pattern-searching), and finally explore [System-Level Searching](#5-system--architecture-level-searching) for real-world readiness.



# Tutorial 
## Linear Search 
- Also known as `Sequential Search`.
- In this all the elements of the array or list are iterated sequentially and check if the current element is equal to the target element. <br> If the target element is found, then
  return the index of the current element. Otherwise, if no match is found then return `-1`.

## Time & Space Complexity 
### Time Complexity
- `Best Case` : `O(1)` as the target element may be found at the first index of the array or list.
- `Worst Case` : `O(n) as the target element may be found at the last index of the array or list.
- `Average Case` : `O(n)`

### Space Complexity


### Applications of Linear Search Algorithms
- `Unsorted Lists` : Most commonly used for unsorted array or list to find the element
- `Small data sets` : LS is preferred over BS for small data sets
- `Searching in Linked Lists` : LS is commonly used as iteration in LS (Singly or Doubly) is done sequentially either from front / back.
- `Simple Implementation` : Implementing is easier than BS and TS.

### When to use ?
- When dealing with small data sets.
- When datasets stored in contiguous memory.

### Advantages -
- Most common algo for smaller data sets.
- Does not require any additional memory.
- Can be used against both sorted & unsorted array or list of any data type.

### Disadvantages -
- Time complexity is `O(n)` which makes it slower for large data sets. (arrays or list)
- LS is not good for the sorted data.


## Sentinel Linear Search 
- It is a type of `Linear Search`, where the number of comparisons is reduced to a traditional linear search.
- Traditional Linear Search :
    * Makes up to N comparisons (one per element)
    * Needs to check both:
       - If the element is found ? OR if the element is equal to target ?
       - If the index is still within array bounds OR Have we reached the end of the array ?
- Sentinel Linear Search :
    * Uses a sentinel (target placed at last index) to avoid explicit bound checks.
    * Guarantees the search will terminate because the target will always appear (Either in the array or at the sentinel)
    * Number of comparisons in worst case = N + 2 (Slightly better than traditional linear search)
    * Saves one comparison per iteration (No explicit index bound check) 

## Binary Search
- Works with `divide-conquer` approach / technique.
- Works on only sorted or monotonic search space.
- Time complexity = O(log N)

### How it works ? (Sorted ascending order)
- Divide the search space into 2 halves by finding the middle index `mid`.
- Compare the middle element of the search space with the key.
- If the key is found at middle element, the process is terminated.
- If the key is not found at middle element, choose which half will be used as the next search space.
   - If the key is smaller than the middle element, then the left side is used for the next search.
   - If the key is larger than the middle element, then the right side is used for the next search.
- This process is continued until the key is found or the total search space is exhausted.

### How it works for the descending sorted arrays ?


### Order-Agnostic Binary Search

### Complexity Analysis -
#### Time Complexity
- Best Case : `O(1)`
- Average Case : `O(log N)`
- Worst Case : `O(log(N)`

#### Space Complexity
- `O(1)`
- If the recursive call stack is considered then the auxiliary space will be `Olog(N)`


#### Example -
Consider a given array `arr[] = {2,5,8,12,16,23,38,56,72,91}` and the target is = 23

### Ways to implement Binary Search Algo 
- Iterative approach `Olog(n) Time & O(1) Space`
- Recursive approach

### Applications -
* Searching in sorted arrays or list
* Finding the first/last occurrence or closest match in a sorted array.
* `Database Indexing` - Used in `B-trees` and similar data structures for the fast data look up.
* `Debugging in version control` — Tools like git bisect use binary search to isolate faulty commits.
* `Network routing & IP lookup` — Efficiently find routing entries in tables sorted by address ranges.
* `File systems & libraries` — Fast search through sorted directories or symbol tables.
* `Gaming/graphics` — Collision detection or ray tracing using sorted spatial data.
* `Machine learning tuning` — Efficient hyper-parameter search (e.g., learning rate, thresholds).
* `Optimization problems & competitive programming` — Solve boundary-value challenges by narrowing search space.
* `Advanced data structures` — Binary search trees, self-balancing BSTs, and fractional cascading rely on search logic.



## Fibonacci Search

