# 🚀 Data Structures & Algorithms (DSA) & OOPs in Java, C++ & Python

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![C++](https://img.shields.io/badge/C%2B%2B-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)
![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)

Welcome to the **Data Structures & Algorithms (DSA) and Object-Oriented Programming (OOPs)** repository. This collection contains clean, optimized, and well-structured implementations of foundational computer science concepts, core algorithm design patterns, bitwise operations, OOP paradigms, and curated problem solutions from LeetCode.

---

## 📑 Table of Contents

- [📁 Directory Structure](#-directory-structure)
- [🧩 Core Topics & Modules](#-core-topics--modules)
  - [1. Arrays & Algorithmic Patterns](#1-arrays--algorithmic-patterns)
  - [2. 2D Arrays / Matrix Operations](#2-2d-arrays--matrix-operations)
  - [3. Bit Manipulation & Binary Operations](#3-bit-manipulation--binary-operations)
  - [4. Object-Oriented Programming (OOPs)](#4-object-oriented-programming-oops)
  - [5. Sorting Algorithms](#5-sorting-algorithms)
  - [6. String Manipulation & Utilities](#6-string-manipulation--utilities)
- [📊 Visual Architecture](#-visual-architecture)
- [💡 LeetCode Solutions Tracker](#-leetcode-solutions-tracker)
- [⏱️ Complexity Reference Table](#️-complexity-reference-table)
- [🛠️ How to Compile & Run](#️-how-to-compile--run)
- [🤝 Contributing](#-contributing)

---

## 📁 Directory Structure

```text
DSA/
├── Arrays/               # 1D Array algorithms, searching, subarray sums & optimizations
├── 2D.Arrays/            # Matrix operations, diagonal sum, spiral traversal & matrix search
├── BitManipulation/      # Bitwise operators, bit masking, ith-bit operations & bit tricks
├── OOPs/                 # Classes, inheritance, constructors, copy constructors & encapsulation
├── Sorting/              # Classic sorting algorithms (Bubble, Selection, Insertion, Counting)
├── String/               # String manipulation, palindrome check, compression & StringBuilder
├── 0190-reverse-bits/    # Standalone solution for LeetCode 190
└── LeetCode_Problems/    # Categorized LeetCode problem solutions (Java, C++, Python)
```

---

## 🧩 Core Topics & Modules

### 1. Arrays & Algorithmic Patterns

Fundamental linear data structure operations, search techniques, subarray analysis, and algorithmic optimization patterns.

| File | Topic / Concept | Description | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| [ArraysCC.java](./Arrays/ArraysCC.java) | Array Basics | Creation, length initialization, and basic element updating. | $O(1)$ | $O(N)$ |
| [ArraysCC1.java](./Arrays/ArraysCC1.java) | Pass by Reference | Demonstrates array reference passing in Java methods. | $O(1)$ | $O(1)$ |
| [ArrayCC3.java](./Arrays/ArrayCC3.java) | Linear Search | Iterative searching through array elements. | $O(N)$ | $O(1)$ |
| [BinarySearch.java](./Arrays/BinarySearch.java) | Binary Search | Divide-and-conquer searching on sorted arrays. | $O(\log N)$ | $O(1)$ |
| [LargestNumber.java](./Arrays/LargestNumber.java) | Extreme Values | Single-pass search for maximum & minimum elements. | $O(N)$ | $O(1)$ |
| [Reverse.java](./Arrays/Reverse.java) | Array Reversal | In-place double-pointer array swapping. | $O(N)$ | $O(1)$ |
| [Pairs.java](./Arrays/Pairs.java) | Array Pairings | Generating all distinct pairs of array elements. | $O(N^2)$ | $O(1)$ |
| [SubArrays.java](./Arrays/SubArrays.java) | Subarray Generation | Printing all contiguous subsegments of an array. | $O(N^3)$ | $O(1)$ |
| [MaxSubarraySum.java](./Arrays/MaxSubarraySum.java) | Max Subarray Sum | Brute force check of all subarray sums. | $O(N^3)$ | $O(1)$ |
| [maxSubarraySum2.java](./Arrays/maxSubarraySum2.java) | Max Subarray Sum | Optimized sum calculation using Prefix Sum array. | $O(N^2)$ | $O(N)$ |
| [maxSuubarraySum3.java](./Arrays/maxSuubarraySum3.java) | Kadane's Algorithm | Optimal single-pass dynamic programming approach. | $O(N)$ | $O(1)$ |
| [Stocks.java](./Arrays/Stocks.java) | Buy & Sell Stock | Single-pass max profit calculation under price trends. | $O(N)$ | $O(1)$ |
| [TrapRainwater.java](./Arrays/TrapRainwater.java) | Trapping Rainwater | Two-pointer elevation bounds calculation for trapped water. | $O(N)$ | $O(N)$ |

---

### 2. 2D Arrays / Matrix Operations

Multi-dimensional array structures, directional matrix traversals, and multi-axis search algorithms.

| File | Topic / Concept | Description | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| [Matrices.java](./2D.Arrays/Matrices.java) | Matrix I/O | Standard creation, row-column iteration, and min/max lookup. | $O(N \times M)$ | $O(N \times M)$ |
| [SpiralMatrix.java](./2D.Arrays/SpiralMatrix.java) | Spiral Order Traversal | Clockwise layer-by-layer matrix boundary traversal. | $O(N \times M)$ | $O(1)$ |
| [DaigonalSum.java](./2D.Arrays/DaigonalSum.java) | Diagonal Sum | Single-pass $O(N)$ calculation of primary & secondary diagonals. | $O(N)$ | $O(1)$ |
| [SearchSortedMatrix.java](./2D.Arrays/SearchSortedMatrix.java) | Staircase Search | $O(N + M)$ search starting from top-right corner in sorted matrix. | $O(N + M)$ | $O(1)$ |

---

### 3. Bit Manipulation & Binary Operations

Low-level bitwise manipulation, mask generation, binary bit testing, and arithmetic tricks using binary operators.

| File | Topic / Concept | Description |
| :--- | :--- | :--- |
| [BinaryAND.java](./BitManipulation/BinaryAND.java) | Bitwise AND (`&`) | Computes bitwise conjunction of two numbers. |
| [BinaryOR.java](./BitManipulation/BinaryOR.java) | Bitwise OR (`\|`) | Computes bitwise disjunction of two numbers. |
| [BinaryXOR.java](./BitManipulation/BinaryXOR.java) | Bitwise XOR (`^`) | Computes exclusive OR between numbers. |
| [BinaryNOT.java](./BitManipulation/BinaryNOT.java) | Bitwise NOT (`~`) | Computes 1's complement flip of bits. |
| [BInaryLeft.java](./BitManipulation/BInaryLeft.java) | Left Shift (`<<`) | Shifts bits left (multiplication by $2^k$). |
| [BinaryRight.java](./BitManipulation/BinaryRight.java) | Right Shift (`>>`) | Shifts bits right (division by $2^k$). |
| [OddorEven.java](./BitManipulation/OddorEven.java) | Parity Check | Checks if least significant bit (LSB) is set (`n & 1`). |
| [getIthbit.java](./BitManipulation/getIthbit.java) | Get $i$-th Bit | Extracts bit at index $i$ using mask `(1 << i)`. |
| [setIthBit.java](./BitManipulation/setIthBit.java) | Set $i$-th Bit | Turns bit at index $i$ to 1 using `n \| (1 << i)`. |
| [clearIthBit.java](./BitManipulation/clearIthBit.java) | Clear $i$-th Bit | Turns bit at index $i$ to 0 using `n & ~(1 << i)`. |
| [updateIthBit.java](./BitManipulation/updateIthBit.java) | Update $i$-th Bit | Updates $i$-th bit to specified value (0 or 1). |
| [clearLastIthBit.java](./BitManipulation/clearLastIthBit.java) | Clear $i$ LSBs | Clears rightmost $i$ bits using bitmask `(~0 << i)`. |
| [clearRange.java](./BitManipulation/clearRange.java) | Clear Bit Range | Clears range of bits between indices $i$ and $j$. |
| [CheckPower.java](./BitManipulation/CheckPower.java) | Power of 2 Check | Evaluates if $n$ is power of 2 using property `(n & (n - 1)) == 0`. |

---

### 4. Object-Oriented Programming (OOPs)

Object-oriented design principles in Java demonstrating encapsulation, abstraction, inheritance, constructors, and access modifiers.

| File | Topic / Concept | Description |
| :--- | :--- | :--- |
| [ClassesAndObjects.java](./OOPs/ClassesAndObjects.java) | Classes & Instantiation | Defining object attributes, behaviors, and instantiation syntax. |
| [GettersAndSetters.java](./OOPs/GettersAndSetters.java) | Encapsulation | Encapsulating private fields with controlled public accessors/mutators. |
| [Constructors.java](./OOPs/Constructors.java) | Constructors | Parameterized and non-parameterized object initialization. |
| [CopyConstructor.java](./OOPs/CopyConstructor.java) | Shallow vs. Deep Copy | Object cloning using copy constructors (shallow vs. deep copy). |
| [Inheritance.java](./OOPs/Inheritance.java) | Class Inheritance | Parent-child class hierarchies (`extends` keyword) and reusability. |
| [Modifiers.java](./OOPs/Modifiers.java) | Access Control | Demonstrating `public`, `private`, `protected`, and default visibility. |

---

### 5. Sorting Algorithms

Implementations of standard comparison-based and non-comparison sorting routines.

| File | Algorithm | Description | Best Time | Avg Time | Worst Time | Space |
| :--- | :--- | :--- | :--- | :--- | :--- | :--- |
| [BasicSorting.java](./Sorting/BasicSorting.java) | **Bubble Sort** | Repeated adjacent element swapping. | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ |
| [SelectionSort.java](./Sorting/SelectionSort.java) | **Selection Sort** | Unsorted minimum element selection & place. | $O(N^2)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ |
| [InsertionSort.java](./Sorting/InsertionSort.java) | **Insertion Sort** | Progressive element insertion into sorted slice. | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ |
| [countingSort.java](./Sorting/countingSort.java) | **Counting Sort** | Non-comparison frequency distribution sorting. | $O(N + K)$ | $O(N + K)$ | $O(N + K)$ | $O(K)$ |

---

### 6. String Manipulation & Utilities

String processing, immutable string handling, sequence verification, and memory-efficient `StringBuilder` usage.

| File | Topic / Concept | Description | Time Complexity |
| :--- | :--- | :--- | :--- |
| [StringBasics.java](./String/StringBasics.java) | String Fundamentals | Length calculation, character access, and string concatenation. | $O(N)$ |
| [IsPalindrome.java](./String/IsPalindrome.java) | Palindrome Verification | Two-pointer matching from start and end. | $O(N)$ |
| [Directions.java](./String/Directions.java) | Shortest Path / Geometry | Calculates displacement vector length from (N, S, E, W) path. | $O(N)$ |
| [Substring.java](./String/Substring.java) | Substring Slicing | Custom character range extraction and built-in `.substring()`. | $O(K)$ |
| [largestString.java](./String/largestString.java) | Lexicographical Compare | Finds largest string alphabetically using `.compareTo()`. | $O(N \times L)$ |
| [StringBuilderDemo.java](./String/StringBuilderDemo.java) | `StringBuilder` | Mutable character sequence construction without object churn. | $O(N)$ |
| [StringUpperCase.java](./String/StringUpperCase.java) | Title Casing | Converts first letter of every word in sentence to uppercase. | $O(N)$ |
| [Compress.java](./String/Compress.java) | String Compression | Run-length encoding of consecutive duplicate characters. | $O(N)$ |

---

## 📊 Visual Architecture

```mermaid
flowchart TD
    DSA["📁 DSA (Root Repository)"]
    
    %% Categories
    DSA --> Core["📁 Core Computer Science Topics"]
    DSA --> LC["📁 LeetCode Problem Solutions"]
    
    %% Core Breakdown
    Core --> Arrays["📁 Arrays<br/>📄 ArraysCC, ArraysCC1, ArrayCC3<br/>📄 BinarySearch, LargestNumber, Reverse<br/>📄 Pairs, SubArrays, MaxSubarraySum (1,2,3)<br/>📄 Stocks, TrapRainwater"]
    Core --> 2DArrays["📁 2D.Arrays<br/>📄 Matrices, SpiralMatrix<br/>📄 DaigonalSum, SearchSortedMatrix"]
    Core --> Bitwise["📁 BitManipulation<br/>📄 BinaryAND, OR, XOR, NOT, Left, Right<br/>📄 OddorEven, getIthbit, setIthBit, clearIthBit<br/>📄 updateIthBit, clearLastIthBit, clearRange, CheckPower"]
    Core --> OOPs["📁 OOPs<br/>📄 ClassesAndObjects, GettersAndSetters<br/>📄 Constructors, CopyConstructor<br/>📄 Inheritance, Modifiers"]
    Core --> Sorting["📁 Sorting<br/>📄 BasicSorting (Bubble)<br/>📄 SelectionSort, InsertionSort, countingSort"]
    Core --> String["📁 String<br/>📄 StringBasics, IsPalindrome, Directions<br/>📄 Substring, largestString, StringBuilderDemo<br/>📄 StringUpperCase, Compress"]
    
    %% LeetCode Breakdown
    LC --> Easy["🟢 Easy Problems<br/>• 0009 - Palindrome Number<br/>• 0026 - Remove Duplicates<br/>• 0121 - Buy & Sell Stock<br/>• 0190 - Reverse Bits<br/>• 0283 - Move Zeroes<br/>• 0344 - Reverse String<br/>• 1464 - Max Product of Two Elements<br/>• 1624 - Largest Substring Between Equal Chars<br/>• 2769 - Max Achievable Number<br/>• 3936 - Min Swaps Zeros to End"]
    LC --> Medium["🟡 Medium Problems<br/>• 0153 - Min in Rotated Sorted Array<br/>• 0201 - Bitwise AND of Numbers Range<br/>• 0735 - Asteroid Collision<br/>• 2812 - Safest Path in Grid<br/>• 3228 - Max Operations Ones to End"]
    LC --> Hard["🔴 Hard Problems<br/>• 0004 - Median of Two Sorted Arrays<br/>• 0042 - Trapping Rain Water<br/>• 0154 - Min in Rotated Sorted Array II"]

    %% Styling
    classDef main fill:#1e293b,stroke:#64748b,stroke-width:2px,color:#f8fafc;
    classDef folder fill:#0f172a,stroke:#38bdf8,stroke-width:2px,color:#e0f2fe;
    classDef easy fill:#064e3b,stroke:#34d399,stroke-width:2px,color:#ecfdf5;
    classDef medium fill:#451a03,stroke:#fbbf24,stroke-width:2px,color:#fffbeb;
    classDef hard fill:#4c0519,stroke:#f87171,stroke-width:2px,color:#fef2f2;
    
    class DSA,Core,LC main;
    class Arrays,2DArrays,Bitwise,OOPs,Sorting,String folder;
    class Easy easy;
    class Medium medium;
    class Hard hard;
```

---

## 💡 LeetCode Solutions Tracker

Comprehensive index of solved LeetCode challenges sorted by problem ID:

| ID | Problem Title | Difficulty | Topic / Category | Solutions Available |
| :---: | :--- | :---: | :--- | :--- |
| **0004** | [Median of Two Sorted Arrays](./LeetCode_Problems/0004-median-of-two-sorted-arrays) | 🔴 Hard | Arrays / Binary Search | [Java](./LeetCode_Problems/0004-median-of-two-sorted-arrays/0004-median-of-two-sorted-arrays.java) |
| **0009** | [Palindrome Number](./LeetCode_Problems/0009-palindrome-number) | 🟢 Easy | Math / Logic | [Java](./LeetCode_Problems/0009-palindrome-number/0009-palindrome-number.java) |
| **0026** | [Remove Duplicates from Sorted Array](./LeetCode_Problems/0026-remove-duplicates-from-sorted-array) | 🟢 Easy | Two Pointers / Arrays | [Java](./LeetCode_Problems/0026-remove-duplicates-from-sorted-array/0026-remove-duplicates-from-sorted-array.java) |
| **0042** | [Trapping Rain Water](./LeetCode_Problems/0042-trapping-rain-water) | 🔴 Hard | Two Pointers / Dynamic Programming | [Java](./LeetCode_Problems/0042-trapping-rain-water/0042-trapping-rain-water.java) |
| **0121** | [Best Time to Buy and Sell Stock](./LeetCode_Problems/0121-best-time-to-buy-and-sell-stock) | 🟢 Easy | Dynamic Programming / Sliding Window | [Java](./LeetCode_Problems/0121-best-time-to-buy-and-sell-stock/0121-best-time-to-buy-and-sell-stock.java) |
| **0153** | [Find Minimum in Rotated Sorted Array](./LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array) | 🟡 Medium | Binary Search | [Java](./LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array/0153-find-minimum-in-rotated-sorted-array.java), [C++](./LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array/0153-find-minimum-in-rotated-sorted-array.cpp) |
| **0154** | [Find Minimum in Rotated Sorted Array II](./LeetCode_Problems/0154-find-minimum-in-rotated-sorted-array-ii) | 🔴 Hard | Binary Search / Duplicates | [C++](./LeetCode_Problems/0154-find-minimum-in-rotated-sorted-array-ii/0154-find-minimum-in-rotated-sorted-array-ii.cpp) |
| **0190** | [Reverse Bits](./0190-reverse-bits) | 🟢 Easy | Bit Manipulation | [Java](./0190-reverse-bits/0190-reverse-bits.java) |
| **0201** | [Bitwise AND of Numbers Range](./LeetCode_Problems/0201-bitwise-and-of-numbers-range) | 🟡 Medium | Bit Manipulation | [Java](./LeetCode_Problems/0201-bitwise-and-of-numbers-range/0201-bitwise-and-of-numbers-range.java) |
| **0283** | [Move Zeroes](./LeetCode_Problems/0283-move-zeroes) | 🟢 Easy | Two Pointers | [Java](./LeetCode_Problems/0283-move-zeroes/0283-move-zeroes.java) |
| **0344** | [Reverse String](./LeetCode_Problems/0344-reverse-string) | 🟢 Easy | Two Pointers / Strings | [Java](./LeetCode_Problems/0344-reverse-string/0344-reverse-string.java) |
| **0735** | [Asteroid Collision](./LeetCode_Problems/0735-asteroid-collision) | 🟡 Medium | Stack / Simulation | [Java](./LeetCode_Problems/0735-asteroid-collision/0735-asteroid-collision.java) |
| **1464** | [Max Product of Two Elements in Array](./LeetCode_Problems/1464-maximum-product-of-two-elements-in-an-array) | 🟢 Easy | Arrays / Sorting | [Java](./LeetCode_Problems/1464-maximum-product-of-two-elements-in-an-array/1464-maximum-product-of-two-elements-in-an-array.java) |
| **1624** | [Largest Substring Between Equal Chars](./LeetCode_Problems/1624-largest-substring-between-two-equal-characters) | 🟢 Easy | Hash Table / String | [Java](./LeetCode_Problems/1624-largest-substring-between-two-equal-characters/1624-largest-substring-between-two-equal-characters.java) |
| **2769** | [Find Maximum Achievable Number](./LeetCode_Problems/2769-find-the-maximum-achievable-number) | 🟢 Easy | Math | [Java](./LeetCode_Problems/2769-find-the-maximum-achievable-number/2769-find-the-maximum-achievable-number.java) |
| **2812** | [Find the Safest Path in a Grid](./LeetCode_Problems/2812-find-the-safest-path-in-a-grid) | 🟡 Medium | BFS / Dijkstra / Matrix | [Java](./LeetCode_Problems/2812-find-the-safest-path-in-a-grid/2812-find-the-safest-path-in-a-grid.java) |
| **3228** | [Max Operations to Move Ones to End](./LeetCode_Problems/3228-maximum-number-of-operations-to-move-ones-to-the-end) | 🟡 Medium | Greedy / String | [Python](./LeetCode_Problems/3228-maximum-number-of-operations-to-move-ones-to-the-end/3228-maximum-number-of-operations-to-move-ones-to-the-end.py) |
| **3936** | [Minimum Swaps to Move Zeros to End](./LeetCode_Problems/3936-minimum-swaps-to-move-zeros-to-end) | 🟢 Easy | Arrays / Greedy | [Java](./LeetCode_Problems/3936-minimum-swaps-to-move-zeros-to-end/3936-minimum-swaps-to-move-zeros-to-end.java) |

---

## ⏱️ Complexity Reference Table

| Pattern / Algorithm | Best Time | Average Time | Worst Time | Space | Notes |
| :--- | :---: | :---: | :---: | :---: | :--- |
| **Linear Search** | $O(1)$ | $O(N)$ | $O(N)$ | $O(1)$ | Works on unsorted arrays |
| **Binary Search** | $O(1)$ | $O(\log N)$ | $O(\log N)$ | $O(1)$ | Requires sorted array |
| **Staircase Matrix Search** | $O(1)$ | $O(N+M)$ | $O(N+M)$ | $O(1)$ | Row-wise & col-wise sorted matrix |
| **Kadane's Algorithm** | $O(N)$ | $O(N)$ | $O(N)$ | $O(1)$ | Handles negative numbers |
| **Prefix Sum Subarray** | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(N)$ | Pre-computes prefix sums |
| **Bubble Sort** | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | Stable sorting |
| **Selection Sort** | $O(N^2)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | Unstable sorting |
| **Insertion Sort** | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | Efficient for small/nearly sorted data |
| **Counting Sort** | $O(N+K)$ | $O(N+K)$ | $O(N+K)$ | $O(K)$ | Non-comparison sort |

---

## 🛠️ How to Compile & Run

### ☕ Java Execution

1. Navigate to the relevant module directory:
   ```bash
   cd DSA/Arrays
   ```
2. Compile the target `.java` file:
   ```bash
   javac BinarySearch.java
   ```
3. Execute the bytecode:
   ```bash
   java BinarySearch
   ```

### 💻 C++ Execution

1. Navigate to the target C++ solution directory:
   ```bash
   cd DSA/LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array
   ```
2. Compile using standard `g++`:
   ```bash
   g++ -O3 0153-find-minimum-in-rotated-sorted-array.cpp -o solution
   ```
3. Run the binary executable:
   ```bash
   ./solution
   ```

### 🐍 Python Execution

1. Navigate to the target Python solution directory:
   ```bash
   cd DSA/LeetCode_Problems/3228-maximum-number-of-operations-to-move-ones-to-the-end
   ```
2. Run the script:
   ```bash
   python 3228-maximum-number-of-operations-to-move-ones-to-the-end.py
   ```

---

## 🤝 Contributing

Contributions, problem additions, and optimizations are welcome!
1. Fork the repository.
2. Create a new topic branch (`git checkout -b feature/new-solution`).
3. Commit your changes with clear messages (`git commit -m 'Add LeetCode problem solution'`).
4. Push to your branch and open a Pull Request.

---
*Maintained with ❤️ for clean code & continuous learning.*
