# Stack
> `Stack` is a Linear, abstract data type (ADT) data structure.<br>
> It follows `LIFO` (Last In First Out) principle, the last element inserted is the first to be popped out.<br>
> It means both insertion & deletion operations happen at one end only.

---
## Java Stack
```shell
adash@Abinashs-MacBook-Air Ds_Algo % javap java.util.Stack
Compiled from "Stack.java"
public class java.util.Stack<E> extends java.util.Vector<E> {
  public java.util.Stack();
  public E push(E);
  public synchronized E pop();
  public synchronized E peek();
  public boolean empty();
  public synchronized int search(java.lang.Object);
}
```

## LIFO (Last In First Out) Principle 
There are some real world example of LIFO 
- Consider a stack of plates. When we add a plate, we add at the top. When we remove, we remove from the top.
- A shuttlecock box (or any other box that is closed from one end) is another great real-world example of the LIFO (Last In First Out) principle where we do 
  insertions and removals from the same end. <br>
Example - 
```text
push(10)  -> [10]
push(20)  -> [10, 20]
push(30)  -> [10, 20, 30]
pop()     -> returns 30; stack becomes [10, 20]
peek()    -> returns 20; stack remains [10, 20]
```
This access discipline naturally models nested or reversible processes: function calls, undo/redo. backtracking, expression parsing etc.

## Representation of Stack -
- You can implement a stack in multiple ways. The most common are `Array-based` and `Linked-list-based`.
- In real life / production scenario, prefer `Deque (e.g. ArrayDeque)` instead of legacy Stack class.

### Array-based Stack :
- **Structure** : a contiguous array and an integer top index.
- **Fast due to locality** : great cache behaviour
- **Capacity**: either fixed (bounded) or dynamically resized (like `ArrayList`).
- **Amortized analysis (dynamic)** : push is O(1) amortized; occasional resize costs O(n). <br>

Core idea :
```shell
int[] a = new int[cap];
int top = -1;            // -1 means empty
push(x): a[++top] = x
pop():   return a[top--]
peek():  return a[top]
```

### LinkedList-based Stack :
- Structure: singly linked nodes; push/pop at the head.
- Always O(1) push/pop without resizing.
- Overhead: extra memory for node objects & pointers; less cache-friendly.

Core idea :
```text
class Node { int val; Node next; }
Node head = null;
push(x): head = new Node(x, head)
pop():   x = head.val; head = head.next; return x
peek():  return head.val
```

### Library-backed (Java) :
- Deque<E> interface (recommended): ArrayDeque<E>, LinkedList<E>
    - Use push(e), pop(), peek() or addFirst/removeFirst/getFirst. 
    - ArrayDeque is non-blocking, resizable, and faster than Stack for single-threaded use.
- Stack<E> (legacy, synchronized, extends Vector) — avoid for new code.
- Concurrent options: ConcurrentLinkedDeque<E> (lock-free), LinkedBlockingDeque<E> (blocking), or custom CAS-based stacks when needed.


## Types of Stacks (by implementation & use-case) -
### By implementation
- Array-based (fixed or dynamic capacity)
- Linked-list based
- Deque-backed (using `ArrayDeque` / `LinkedList`)
- Concurrent Stacks (lock-free Treiber stack, blocking deque)

### By behavior / problem pattern
- Monotonic stack (maintains increasing / decreasing order; used for NGE, histogram, rainwater, temperatures)
- Min / Max stack (track current min/max in O(1))
- K stacks in one array
- Bounded vs Unbounded (fixed capacity vs dynamic growth)
- Persistent / Immutable Stack (functional programming)
- Application specific Stacks (call stack, undo / redo stacks)


## 📌 Stack Operations & Time Complexity

| Operation | Description              | Array (Fixed) | Array (Dynamic)                                | Linked List |
|-----------|--------------------------|---------------|------------------------------------------------|-------------|
| **push(x)** | Insert at top           | O(1)          | O(1) amortized; worst O(n) on resize           | O(1)        |
| **pop()**   | Remove & return top     | O(1)          | O(1)                                           | O(1)        |
| **peek()**  | Return top (no remove)  | O(1)          | O(1)                                           | O(1)        |
| **isEmpty()** | True if no elements   | O(1)          | O(1)                                           | O(1)        |
| **size()**  | Number of elements      | O(1)          | O(1)                                           | O(1)        |
| **isFull()** | For bounded stacks     | O(1)          | N/A                                            | N/A         |
| **clear()** | Remove all              | O(1) *(set top=-1)* | O(1) *(drop references)*                  | O(n) **     |

### 🔹 Notes
- `O(1)` means constant-time operations.
- Dynamic arrays (e.g., `ArrayList`) resize occasionally → **amortized O(1)** but **worst case O(n)** when capacity doubles.
- Linked list `clear()` takes **O(n)** since each node must be traversed and freed.
  

## Why do we need Stack ?
Stacks model nested, reversible, and last-opened-first-closed processes. <br>
#### Core use cases :
- **Function calls & Recursion** : call stack, locals, return addresses
- **Parsing & Validation** : Balanced parenthesis/brackets, HTML tags
- **Expression evaluation** : infix -> postfix (shunting Yard), RPN evaluation
- **Backtracking** : DFS (graphs / trees), maze solving, state exploration
- **Undo / Redo** : editors, transactions, browser back / forward (two stacks)
- **Algorithms** : monotonic stack for **Next Greater / Smaller, Largest Rectangle in Histogram, Trapping Rainwater, Daily Temperatures**
- **Path normalization** : Simplify Unix Paths `/a/./b/../../c`

Stacks give a **clean, O(1)** mechanism to remember "Where to return" or "What to revisit" and to process elements in reverse arrival order.

## Advantages & Disadvantages of Stack 
### Advantages
- **Simplicity & Speed** : push/pop/peek are O(1)
- **Natural fit** for nested scopes, recursion, parsing, backtracking
- **Memory locality** (Array-based) -> Cache friendly, fast in practice
- **Deterministic access pattern** reduces bugs when modeling LIFO workflows

### Disadvantages
- **Restricted Access** : only the top is directly accessible (no random index operations)
- **Capacity Management** (Array-based) : Need growth policy / risk of overflow if bounded
- **Extra overhead** (linked list) : more memory per element, worse cache locality
- **Underflow / Overflow** : popping empty stack or pushing full bounded stack must be handled
- **Concurrency concerns** : `Stack` is synchronized but outdated; custom stacks need careful thread-safety
- **Recursion depth limits** : relying on call stack can cause stack overflow; consider iterative + explicit stack 

## Best practices & Pitfalls (Java)
- **Prefer** `Deque` **over** `Stack` for non-concurrent code (**`ArrayDeque`** is typically fastest).
- **Avoid** `null` elements with `ArrayDeque`.
- **Check emptiness** before **pop**/**peek** to avoid exceptions.
- **Choose representation** based on access pattern & constraints:
     - Many pushes/pops, unknown size → dynamic array (**ArrayDeque**).
     - Very large or unpredictable sizes, frequent churn → linked stack may reduce resize spikes.
- **Concurrency**: use concurrent deques or blocking deques; avoid manual locking unless necessary.
- **Replace recursion** with explicit stack for deep problems to prevent call-stack overflow.