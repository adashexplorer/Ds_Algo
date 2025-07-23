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


> ℹ️ **Note**:
> - Skip List is typically used in **advanced systems** that require **fast range lookups** and **concurrent access**, like **Redis**, **LevelDB**, or **Java's ConcurrentSkipListMap**.
> - Skip Lists maintain multiple "levels" for faster access (logarithmic).
> - Circular Lists help **avoid null checks** and support **infinite iteration**.
> - Doubly Linked Lists are heavier but flexible for **bidirectional navigation**.
> - Singly Linked Lists are best when space is limited and direction doesn't matter.
