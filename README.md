# 🔧 Java Custom Data Structures Project

This repository contains a **full implementation of physical and logical data structures in Java** created from scratch, **without using Java's standard collection classes** (only `Iterator` is allowed). This project was built for an educational assignment and fully satisfies academic requirements.

---

## 📌 Project Description

The goal of this project is to design and implement core **data structures** and understand their behavior, memory structure, and performance. All classes are written in a generic way to support any `Comparable<T>` type.

---

## 📁 Implemented Structures

### 📍 `MyList<T>`
A base **interface** that defines all necessary methods for list-based structures, such as:
- `add(T item)`
- `remove(int index)`
- `get(int index)`
- `sort()`
- `clear()`
- `size()`
- `toArray()` and more

---

### 📦 `MyArrayList<T extends Comparable<T>>`
A dynamic array with manual memory management:
- Expands automatically when needed
- Index-based access
- Fast `get` and `set`
- Implements all `MyList` methods

---

### 🔗 `MyLinkedList<T extends Comparable<T>>`
A doubly-linked list implementation:
- Uses custom `MyNode` class
- Supports bidirectional traversal
- Efficient add/remove at head or tail
- Implements full `MyList<T>` interface

---

### 📚 `MyStack<T>` (based on MyArrayList)
Implements stack (LIFO) behavior:
- `push`, `pop`, `peek`
- `isEmpty`, `size`

### 📬 `MyQueue<T>` (based on MyLinkedList)
Implements queue (FIFO) logic:
- `enqueue`, `dequeue`, `peek`
- `isEmpty`, `size`

### ⛏️ `MyMinHeap<T extends Comparable<T>>` (array-based)
Implements a min-heap (binary heap):
- `insert`, `getMin`, `extractMin`
- Internal `heapify` method
- All values maintain heap structure

---

## 📄 Code Structure

