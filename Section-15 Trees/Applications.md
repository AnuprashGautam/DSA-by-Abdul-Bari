## 1. HTML DOM Tree

### What it is

When a browser loads HTML, it converts it into a **tree structure** called the DOM.

### Why Binary Tree concept fits

Each tag becomes a **node**, and nested tags become **children**.

Example:

```html
<html>
  <body>
    <h1>Hello</h1>
    <p>World</p>
  </body>
</html>
```

Tree form:

```
        html
         |
       body
      /     \
    h1       p
```

### Why tree is needed

Because HTML is **hierarchical**, not linear.

### Interview line:

> DOM uses a tree structure so browsers can easily traverse, update, and render HTML elements.

---

## 2. Decision Tree (AI / Logic)

### What it is

A tree where:

* Each node = question
* Each edge = yes/no
* Each leaf = final decision

Example: Loan approval

```
           Income > 30k?
           /          \
        Yes            No
     Credit good?    Reject
      /     \
   Yes      No
 Approve   Reject
```

### Why tree

Because decisions naturally branch.

### Real world

* Medical diagnosis
* Fraud detection
* Recommendation systems

### Interview line:

> Decision trees use tree structure to represent logical branching decisions.

---

## 3. Expression Tree

Expression:

```
(a + b) * c
```

Tree:

```
      *
     / \
   +     c
  / \
 a   b
```

### Why tree

Because operators depend on operands.

### Used in

* Compilers
* Calculators

### Interview line:

> Expression trees help evaluate mathematical expressions using postorder traversal.

---

## 4. File System

```
C:
 ├── Program Files
 ├── Users
 │    └── Anuprash
 └── Windows
```

Tree structure helps manage folders efficiently.

---

## 5. Binary Search Tree in Searching

Sorted data:

```
        50
       /  \
     30    70
```

Search becomes **O(log n)**.

Used in:

* Databases
* Search engines
* Contact lists

---

## How to Answer in Interview (Perfect Format)

> Binary trees are used in HTML DOM for representing nested elements, in decision trees for logical branching in AI, in expression evaluation in compilers, and in file systems for directory hierarchy.

---
