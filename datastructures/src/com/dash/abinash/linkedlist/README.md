# Linked List -
> - A `LinkedList` is a `linear data structure` where elements are stored in `nodes` and each node contains a `reference` (pointer)
> to the next (and sometimes previous) node in the sequence.
> - Unlike arrays, `Linked Lists do not require contiguous memory` , instead they are dynamically allocated and `can grow & shrink` in size easily.

## 📑 Table of Contents
- [Types of LinkedList](#1-types-of-linked-list)
- [Comparison](#2-types-of-linked-list)

### Types of LinkedList -
- `Singly Linked List`
- `Doubly Linked List`
- `Circular Singly Linked List`
- `Circular Doubly Linked List`
- `Skip List` (Advanced category)


### 🔗 Comparison -

| Feature / Type                | Singly Linked List         | Doubly Linked List           | Circular Singly Linked List  | Circular Doubly Linked List  | Skip List (Advanced)        |
|------------------------------|----------------------------|------------------------------|-------------------------------|-------------------------------|------------------------------|
| 🔄 Direction of Traversal    | One-way                    | Two-way                      | One-way                       | Two-way                       | Multi-level forward (some backward) |
| 🔁 Circular Structure        | ❌                         | ❌                           | ✅                            | ✅                            | ❌                           |
| 🧠 Memory per Node           | 2 fields (`data`, `next`)  | 3 fields (`data`, `next`, `prev`) | 2 fields                     | 3 fields                      | Multiple pointers per level |
| 🚶 Forward Traversal         | ✅                         | ✅                           | ✅                            | ✅                            | ✅                           |
| ↩️ Backward Traversal        | ❌                         | ✅                           | ❌                            | ✅                            | ✅ (with design)             |
| 🔧 Insert/Delete at Head     | O(1)                       | O(1)                         | O(1)                          | O(1)                          | O(log n)                    |
| 🔍 Search Time (Avg)         | O(n)                       | O(n)                         | O(n)                          | O(n)                          | O(log n)                    |
| ♻️ Tail Connects to Head     | ❌                         | ❌                           | ✅                            | ✅                            | ❌                           |
| 🔗 Java Equivalent           | Custom Node                | `LinkedList<E>`              | Custom                        | Custom                        | `ConcurrentSkipListMap`     |
| ✅ Practical Use Cases       | Stack, basic queues        | LRU cache, browser history   | Round-robin scheduling, buffers | Playlist loops, cyclic deques | Redis, real-time DB indexing |


----

 
> ℹ️ **Note**:
> - Skip List is typically used in **advanced systems** that require **fast range lookups** and **concurrent access**, like **Redis**, **LevelDB**, or **Java's ConcurrentSkipListMap**.
> - Skip Lists maintain multiple "levels" for faster access (logarithmic).
> - Circular Lists help **avoid null checks** and support **infinite iteration**.
> - Doubly Linked Lists are heavier but flexible for **bidirectional navigation**.
> - Singly Linked Lists are best when space is limited and direction doesn't matter.


## Singly LinkedList -
> A **Singly Linked List** consists of a chain of nodes where each node contains:
> - `data`: the actual value stored
> - `next`: a reference (pointer) to the **next** node in the sequence

### ✅ Characteristics:
- The **first node** is called the `head`.
- The **last node's `next` pointer is null**, marking the end of the list.
- Nodes are stored **non-contiguously** in memory.
- **Unidirectional traversal** (from head to tail only).
- Dynamic size; does not require pre-allocated memory.

### ⚙️ Common Operations:
- **Insertion at head/tail**: O(1) / O(n)
- **Deletion from head/tail**: O(1) / O(n)
- **Search by value**: O(n)
- **Traversal**: O(n)

### 📌 Use Cases:
- Implementing stacks (LIFO)
- Adjacency lists in graphs
- Managing dynamic memory blocks

```text
    `[Head] → [Data|Next] → [Data|Next] → [Data|Next] → null`
```


## Doubly LinkedList -
> A **Doubly Linked List (DLL)** enhances the singly linked list by storing:
> - `data`: the value
> - `next`: pointer to the next node
> - `prev`: pointer to the previous node

### ✅ Characteristics:
- **Bi-directional traversal** (forward and backward).
- The `head.prev` and `tail.next` are both `null`.
- Requires more memory per node (due to `prev` pointer).
- Easier deletion and insertion in the middle of the list (no need to traverse from the beginning).

### ⚙️ Common Operations:
- **Insert/Delete at head/tail**: O(1)
- **Insert/Delete at middle** (with reference): O(1)
- **Search**: O(n)
- **Traversal in both directions**

### 📌 Use Cases:
- LRU Cache
- Text editors (undo/redo)
- Doubly-ended queues (Deque)
- Navigators (next/previous)

```text
     ⇄ indicates bidirectional connection

      ⇄ [Prev|Data|Next] ⇄ [Prev|Data|Next] ⇄ [Prev|Data|Next] ⇄
     ⇑                                                         ⇓
   [Tail] ←─────────────── circular back to ───────────────→ [Head]
```

## Circular Singly LinkedList -
> A **Circular Singly Linked List (CSLL)** is a variation of a singly linked list where:
> - The `next` pointer of the **last node points back to the head** instead of `null`.

### ✅ Characteristics:
- No node has a `null` reference.
- **Only one direction traversal** (like SLL).
- Must handle stopping conditions carefully during traversal (usually via `do-while` loop).
- Dynamic length; efficient circular operations.

### ⚙️ Common Operations:
- **Insertion at head/tail**: O(1) or O(n)
- **Deletion**: O(n)
- **Circular traversal** using head node as reference

### 📌 Use Cases:
- Round-robin scheduling
- Token passing in distributed systems
- Multiplayer games (cyclic turns)
- Audio/video circular buffers

```text
        ┌────────────────────────────────────────┐
      ↓                                        │
[Head] → [Data|Next] → [Data|Next] → [Data|Next] ─┘
```


## Circular Doubly LinkedList -
> A **Circular Doubly Linked List (CDLL)** combines the concepts of both:
> - A **doubly linked list** and
> - A **circular structure**
>
> Where:
> - `tail.next → head`
> - `head.prev → tail`

### ✅ Characteristics:
- **No null** pointers at either end.
- **Full bi-directional circular traversal**.
- Allows traversal and updates in both directions.
- Increased memory usage per node (due to two pointers).
- More complex pointer management, but very flexible.

### ⚙️ Common Operations:
- **Insert/Delete at any position**: O(1) (if pointer is known)
- **Traversal forward and backward** using `next` and `prev`
- **Always circular** — must check conditions carefully

### 📌 Use Cases:
- Playlist loops in media players
- Circular Deques
- Bidirectional token rings
- UI navigation carousels

```text
     ⇄ indicates bidirectional connection

      ⇄ [Prev|Data|Next] ⇄ [Prev|Data|Next] ⇄ [Prev|Data|Next] ⇄
     ⇑                                                         ⇓
   [Tail] ←─────────────── circular back to ───────────────→ [Head]
```

