# ⚡ Data Structures, Algorithms & OOPs — Master Repository

<div align="center">

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![C++](https://img.shields.io/badge/C%2B%2B-00599C?style=for-the-badge&logo=c%2B%2B&logoColor=white)](https://isocpp.org/)
[![Python](https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white)](https://www.python.org/)
[![LeetCode Solved](https://img.shields.io/badge/LeetCode-86_Solved-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)](#-leetcode-solutions-tracker)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](https://opensource.org/licenses/MIT)

**A comprehensive, production-grade repository of fundamental computer science concepts, algorithmic patterns, object-oriented designs, and competitive programming solutions.**

[Repository Architecture](#-repository-architecture) • [Curriculum & Catalogs](#-curriculum--topic-catalogs) • [LeetCode Tracker](#-leetcode-solutions-tracker) • [Complexity Matrix](#-master-complexity-matrix) • [Compilation Guide](#-compilation--execution)

</div>

---

## 📊 Repository Metrics

| Metric | Count | Details |
| :--- | :---: | :--- |
| **Core Modules** | `15` | Structured topical units from fundamental arrays to dynamic programming |
| **Production Source Files** | `151` | Complete, standalone Java implementations with driver tests |
| **LeetCode Solutions** | `86` | Comprehensive problem breakdown with dedicated solution files |
| **Languages Supported** | `3` | Primary: Java (151 core + 84 LC) · C++ (2 LC) · Python (1 LC) |
| **Difficulty Distribution** | 🟢 `33` Easy | 🟡 `38` Medium · 🔴 `15` Hard |

---

## 📁 Repository Architecture

```text
DSA/
├── 📂 Core Foundations/
│   ├── Arrays/                 → 13 files: Prefix sums, Kadane's algorithm, two-pointer bounds, rainwater trapping
│   ├── 2D.Arrays/              → 5 files: Layer-by-layer spiral traversal, matrix generation, diagonal sum, staircase search
│   ├── String/                 → 8 files: Palindrome verification, displacement vectors, string compression, StringBuilder
│   ├── Sorting/                → 4 files: Bubble sort, Selection sort, Insertion sort, Counting sort
│   ├── BitManipulation/        → 14 files: Bitwise operations, bitmasking, bit isolation, range clears, power-of-2 checks
│   ├── TimeNSpace_Complexity/  → 3 files: Early-exit bubble optimization, linear recursion, divide-and-conquer power
│   └── OOPs/                   → 12 files: Encapsulation, inheritance, polymorphism, abstraction, constructors, modifiers
│
├── 📂 Recursion & Search Paradigms/
│   ├── Recursion/              → 12 files: Functional recursion, floor tiling, binary string generation, friends pairing
│   ├── DivideNConquer/         → 3 files: Merge sort, in-place quick sort, search in rotated sorted array
│   └── Backracking/            → 9 files: Decision tree traversal, subsets, permutations, N-Queens, Sudoku solver
│
├── 📂 Linear Data Structures/
│   └── Linear_Structure/       → 44 files:
│       ├── ArrayList/          → 12 files: Dynamic resizing, 2D lists, Container With Most Water, Pair Sum 1 & 2
│       ├── LInkedList/         → 12 files: Singly & doubly lists, reversal, Floyd's cycle detection, merge sort, zig-zag
│       ├── Queue/              → 10 files: Circular queue, LL queue, dual-stack queue, stream processing, deque wrappers
│       └── Stack/              → 10 files: Dynamic & LL stacks, monotonic stacks, valid parentheses, max histogram area
│
├── 📂 Hierarchical & Tree Structures/
│   ├── NonLinear_Structure/
│   │   └── BinaryTree/         → 11 files: Traversals, LCA, subtree verification, diameter, top view, sum tree
│   └── BinarySearch_Tree/      → 9 files: BST insertion, search, deletion, range query, balancing, largest BST subtree
│
├── 📂 Optimization & Dynamic Programming/
│   ├── Greedy_Algorithm/       → 9 files: Activity selection, fractional knapsack, interval scheduling, job sequencing
│   └── Dyanmic_Programming/    → 6 files: Fibonacci, Climbing Stairs, 0-1 Knapsack, Target Sum, Unbounded Knapsack, Coin Change
│
└── 📂 LeetCode_Problems/        → 86 problems: Markdown explanations & validated source implementations
    ├── 🟢 Easy (33)            → Core data structures, simulation, bitwise math, greedy scans
    ├── 🟡 Medium (38)          → Monotonic stacks, multi-dimensional DP, two-pointer sliding windows, tree DFS/BFS
    └── 🔴 Hard (15)            → Minimax game theory, monotonic boundary stacks, combinatorial DP, hard backtracking
```

---

## 🧩 Curriculum & Topic Catalogs

### 1 · Arrays & Algorithmic Patterns

*Directory: [`Arrays/`](./Arrays)* — 13 files

| File | Algorithmic Pattern | Time | Space | Notes |
| :--- | :--- | :---: | :---: | :--- |
| [`ArraysCC.java`](./Arrays/ArraysCC.java) | Array Basics & Memory Layout | $O(1)$ | $O(N)$ | Declaration, dynamic allocation, sequential updates |
| [`ArraysCC1.java`](./Arrays/ArraysCC1.java) | Pass-by-Reference Semantics | $O(1)$ | $O(1)$ | Demonstration of reference passing vs value passing in Java |
| [`ArrayCC3.java`](./Arrays/ArrayCC3.java) | Linear Search | $O(N)$ | $O(1)$ | Sequential scan with early termination |
| [`BinarySearch.java`](./Arrays/BinarySearch.java) | Binary Search | $O(\log N)$ | $O(1)$ | Interval halving on sorted ascending arrays |
| [`LargestNumber.java`](./Arrays/LargestNumber.java) | Extremum Extraction | $O(N)$ | $O(1)$ | Single-pass simultaneous min and max element search |
| [`Reverse.java`](./Arrays/Reverse.java) | Two-Pointer In-Place Swap | $O(N)$ | $O(1)$ | Dual-pointer inward traversal swapping symmetric indices |
| [`Pairs.java`](./Arrays/Pairs.java) | Distinct Pair Enumeration | $O(N^2)$ | $O(1)$ | Generating all unique combinations $(A[i], A[j])$ for $i < j$ |
| [`SubArrays.java`](./Arrays/SubArrays.java) | Contiguous Subarray Slicing | $O(N^3)$ | $O(1)$ | Complete iteration across all start and end bounds |
| [`MaxSubarraySum.java`](./Arrays/MaxSubarraySum.java) | Brute-Force Subarray Sum | $O(N^3)$ | $O(1)$ | Cubic evaluation of all contiguous subarray sums |
| [`maxSubarraySum2.java`](./Arrays/maxSubarraySum2.java) | Prefix Sum Optimization | $O(N^2)$ | $O(N)$ | Quadratic subarray sum using $O(1)$ prefix sum queries |
| [`maxSuubarraySum3.java`](./Arrays/maxSuubarraySum3.java) | Kadane's Algorithm | $O(N)$ | $O(1)$ | Optimal linear DP resetting negative cumulative running sum |
| [`Stocks.java`](./Arrays/Stocks.java) | Best Time to Buy & Sell Stock | $O(N)$ | $O(1)$ | Single-pass running minimum price tracking maximal profit |
| [`TrapRainwater.java`](./Arrays/TrapRainwater.java) | Trapping Rain Water | $O(N)$ | $O(N)$ | Auxiliary prefix maximum and suffix maximum boundary vectors |

---

### 2 · 2D Matrices & Multi-Axis Search

*Directory: [`2D.Arrays/`](./2D.Arrays)* — 5 files

| File | Algorithmic Pattern | Time | Space | Notes |
| :--- | :--- | :---: | :---: | :--- |
| [`Matrices.java`](./2D.Arrays/Matrices.java) | 2D Array Fundamentals | $O(N \times M)$ | $O(N \times M)$ | Row-major memory layout, iteration, and target search |
| [`SpiralMatrix.java`](./2D.Arrays/SpiralMatrix.java) | Spiral Traversal | $O(N \times M)$ | $O(1)$ | Clockwise boundary contraction traversal (top, right, bottom, left) |
| [`generateMatrix.java`](./2D.Arrays/generateMatrix.java) | Spiral Matrix II | $O(N^2)$ | $O(N^2)$ | Clockwise boundary construction populated with values $1 \dots N^2$ |
| [`DaigonalSum.java`](./2D.Arrays/DaigonalSum.java) | Diagonal Summation | $O(N)$ | $O(1)$ | Simultaneous primary & secondary diagonal scan with center overlap check |
| [`SearchSortedMatrix.java`](./2D.Arrays/SearchSortedMatrix.java) | Staircase Search | $O(N + M)$ | $O(1)$ | Top-right/bottom-left corner pivot elimination on 2D sorted matrix |

---

### 3 · Bitwise Manipulation & Binary Arithmetic

*Directory: [`BitManipulation/`](./BitManipulation)* — 14 files

| File | Operation | Bitwise Rule | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`BinaryAND.java`](./BitManipulation/BinaryAND.java) | AND (`&`) | Bitmask filtering: 1 only if both operand bits are 1 | $O(1)$ | $O(1)$ |
| [`BinaryOR.java`](./BitManipulation/BinaryOR.java) | OR (`\|`) | Bit flag combination: 1 if at least one bit is 1 | $O(1)$ | $O(1)$ |
| [`BinaryXOR.java`](./BitManipulation/BinaryXOR.java) | XOR (`^`) | Difference detection & self-cancellation ($a \oplus a = 0$) | $O(1)$ | $O(1)$ |
| [`BinaryNOT.java`](./BitManipulation/BinaryNOT.java) | NOT (`~`) | One's complement bit inversion | $O(1)$ | $O(1)$ |
| [`BInaryLeft.java`](./BitManipulation/BInaryLeft.java) | Left Shift (`<<`) | Efficient multiplication: $a \ll b = a \cdot 2^b$ | $O(1)$ | $O(1)$ |
| [`BinaryRight.java`](./BitManipulation/BinaryRight.java) | Right Shift (`>>`) | Arithmetic floor division: $a \gg b = \lfloor a / 2^b \rfloor$ | $O(1)$ | $O(1)$ |
| [`OddorEven.java`](./BitManipulation/OddorEven.java) | Parity Check | Least significant bit inspection: `(n & 1) == 0` for even | $O(1)$ | $O(1)$ |
| [`getIthbit.java`](./BitManipulation/getIthbit.java) | Read $i$-th Bit | Isolate bit: `(n & (1 << i)) != 0` | $O(1)$ | $O(1)$ |
| [`setIthBit.java`](./BitManipulation/setIthBit.java) | Set $i$-th Bit | Bitmask activation: `n | (1 << i)` | $O(1)$ | $O(1)$ |
| [`clearIthBit.java`](./BitManipulation/clearIthBit.java) | Clear $i$-th Bit | Negated mask clearing: `n & ~(1 << i)` | $O(1)$ | $O(1)$ |
| [`updateIthBit.java`](./BitManipulation/updateIthBit.java) | Update $i$-th Bit | Clear bit, then set dynamic value: `(n & ~(1 << i)) | (val << i)` | $O(1)$ | $O(1)$ |
| [`clearLastIthBit.java`](./BitManipulation/clearLastIthBit.java) | Clear $i$ LSBs | Shifted all-ones mask: `n & (~0 << i)` | $O(1)$ | $O(1)$ |
| [`clearRange.java`](./BitManipulation/clearRange.java) | Clear Range $[i, j]$ | Combined split bitmasks: `(~0 << (j + 1)) | ((1 << i) - 1)` | $O(1)$ | $O(1)$ |
| [`CheckPower.java`](./BitManipulation/CheckPower.java) | Power of 2 | Single-bit reduction: `n > 0 && (n & (n - 1)) == 0` | $O(1)$ | $O(1)$ |

---

### 4 · Object-Oriented Programming (OOPs)

*Directory: [`OOPs/`](./OOPs)* — 12 files

| File | Core Paradigm | Architectural Purpose |
| :--- | :--- | :--- |
| [`Abstraction.java`](./OOPs/Abstraction.java) | Abstraction | Abstract classes, abstract method contracts, constructor chaining |
| [`ClassesAndObjects.java`](./OOPs/ClassesAndObjects.java) | Classes & Objects | State definitions, behavioral methods, heap memory instantiation |
| [`GettersAndSetters.java`](./OOPs/GettersAndSetters.java) | Encapsulation | Private instance variables protected by public accessors and mutators |
| [`Constructors.java`](./OOPs/Constructors.java) | Constructors | Default, parameterized, and constructor overloading strategies |
| [`CopyConstructor.java`](./OOPs/CopyConstructor.java) | Object Duplication | Shallow reference copying vs deep independent object cloning |
| [`Inheritance.java`](./OOPs/Inheritance.java) | Inheritance | Class hierarchies and code reusability using `extends` |
| [`HybridInheritance.java`](./OOPs/HybridInheritance.java) | Hybrid Hierarchies | Combining multilevel and hierarchical inheritance structures |
| [`Interface.java`](./OOPs/Interface.java) | Interfaces | Total abstraction and multiple interface inheritance using `implements` |
| [`Polymorphism.java`](./OOPs/Polymorphism.java) | Polymorphism | Compile-time method overloading vs runtime dynamic method overriding |
| [`Modifiers.java`](./OOPs/Modifiers.java) | Access Modifiers | Access scopes (`public`, `private`, `protected`, default package-private) |
| [`Satic.java`](./OOPs/Satic.java) | Static Keyword | Class-level shared memory, static methods, static initialization blocks |
| [`Super.java`](./OOPs/Super.java) | Super Keyword | Immediate superclass constructor invocation and parent method access |

---

### 5 · Sorting Algorithms

*Directory: [`Sorting/`](./Sorting)* — 4 files

| File | Algorithm | Best | Average | Worst | Auxiliary Space | Stability |
| :--- | :--- | :---: | :---: | :---: | :---: | :---: |
| [`BasicSorting.java`](./Sorting/BasicSorting.java) | Bubble Sort | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | ✅ Stable |
| [`SelectionSort.java`](./Sorting/SelectionSort.java) | Selection Sort | $O(N^2)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | ❌ Unstable |
| [`InsertionSort.java`](./Sorting/InsertionSort.java) | Insertion Sort | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | ✅ Stable |
| [`countingSort.java`](./Sorting/countingSort.java) | Counting Sort | $O(N + K)$ | $O(N + K)$ | $O(N + K)$ | $O(K)$ | ✅ Stable |

---

### 6 · String Manipulation & Processing

*Directory: [`String/`](./String)* — 8 files

| File | Concept | Algorithmic Implementation | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`StringBasics.java`](./String/StringBasics.java) | Immutability & Pool | Memory intern pool semantics, `.charAt()`, and character traversal | $O(N)$ | $O(1)$ |
| [`IsPalindrome.java`](./String/IsPalindrome.java) | Palindrome Test | Two-pointer inward traversal comparing symmetric characters | $O(N)$ | $O(1)$ |
| [`Directions.java`](./String/Directions.java) | Route Displacement | 2D displacement tracking calculating Euclidean distance $\sqrt{x^2 + y^2}$ | $O(N)$ | $O(1)$ |
| [`Substring.java`](./String/Substring.java) | Substring Extraction | Manual iterative slice vs built-in `String.substring(start, end)` | $O(K)$ | $O(K)$ |
| [`largestString.java`](./String/largestString.java) | Lexicographical Extrema | String comparison using `.compareTo()` across string collections | $O(N \cdot L)$ | $O(1)$ |
| [`StringBuilderDemo.java`](./String/StringBuilderDemo.java) | Mutable Buffer | Amortized append operations avoiding immutable object creation | $O(N)$ | $O(N)$ |
| [`StringUpperCase.java`](./String/StringUpperCase.java) | Title Case Formatter | Capitalizing initial letter of each word in a string | $O(N)$ | $O(N)$ |
| [`Compress.java`](./String/Compress.java) | Run-Length Encoding | Linear scan grouping identical contiguous characters into count tokens | $O(N)$ | $O(N)$ |

---

### 7 · Recursion & Call Stack Foundations

*Directory: [`Recursion/`](./Recursion)* — 12 files

| File | Problem Statement | Recurrence Relation | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`DecreasingOrder.java`](./Recursion/DecreasingOrder.java) | Decreasing Numbers | $T(N) = T(N-1) + O(1)$ | $O(N)$ | $O(N)$ |
| [`IncreasingOrder.java`](./Recursion/IncreasingOrder.java) | Increasing Numbers | $T(N) = T(N-1) + O(1)$ (post-order unwind) | $O(N)$ | $O(N)$ |
| [`Printfactorial.java`](./Recursion/Printfactorial.java) | Factorial ($N!$) | $F(N) = N \cdot F(N-1)$ | $O(N)$ | $O(N)$ |
| [`NaturalNoSum.java`](./Recursion/NaturalNoSum.java) | Sum of Natural Numbers | $S(N) = N + S(N-1)$ | $O(N)$ | $O(N)$ |
| [`Fibbonacci.java`](./Recursion/Fibbonacci.java) | Fibonacci Numbers | $Fib(N) = Fib(N-1) + Fib(N-2)$ | $O(2^N)$ | $O(N)$ |
| [`CheckSortedarray.java`](./Recursion/CheckSortedarray.java) | Array Sorted Check | $A[i] \le A[i+1] \land Sorted(i+1)$ | $O(N)$ | $O(N)$ |
| [`FirstOccurence.java`](./Recursion/FirstOccurence.java) | First Index of Element | Forward recursive linear search returning index on match | $O(N)$ | $O(N)$ |
| [`LastOccurrence.java`](./Recursion/LastOccurrence.java) | Last Index of Element | Post-order unwinding scan evaluating matches from tail | $O(N)$ | $O(N)$ |
| [`Tilling.java`](./Recursion/Tilling.java) | $2 \times N$ Domino Tiling | $T(N) = T(N-1) + T(N-2)$ | $O(2^N)$ | $O(N)$ |
| [`BinaryString.java`](./Recursion/BinaryString.java) | Non-Consecutive 1s | Binary branch: place '0' always, place '1' only after '0' | $O(2^N)$ | $O(N)$ |
| [`FriendsPairing.java`](./Recursion/FriendsPairing.java) | Friends Pairing | $F(N) = F(N-1) + (N-1) \cdot F(N-2)$ | $O(2^N)$ | $O(N)$ |
| [`RemoveDuplicatesInString.java`](./Recursion/RemoveDuplicatesInString.java) | Remove Duplicate Chars | Character recursion with auxiliary boolean occurrence map | $O(N)$ | $O(N)$ |

---

### 8 · Divide & Conquer Algorithms

*Directory: [`DivideNConquer/`](./DivideNConquer)* — 3 files

| File | Concept | Algorithmic Mechanism | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`MergeSort.java`](./DivideNConquer/MergeSort.java) | Merge Sort | Recursive array halving with sorted array merging | $O(N \log N)$ | $O(N)$ |
| [`QuickSort.java`](./DivideNConquer/QuickSort.java) | Quick Sort | In-place partition around pivot with recursive subarray sorting | $O(N \log N)$ avg / $O(N^2)$ worst | $O(\log N)$ |
| [`RotatedSortedArray.java`](./DivideNConquer/RotatedSortedArray.java) | Rotated Array Search | Modified binary search identifying sorted half via midpoint comparison | $O(\log N)$ | $O(\log N)$ |

---

### 9 · Time & Space Complexity Analysis

*Directory: [`TimeNSpace_Complexity/`](./TimeNSpace_Complexity)* — 3 files

| File | Concept | Optimization Mechanism | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`modifiedBubbleSort.java`](./TimeNSpace_Complexity/modifiedBubbleSort.java) | Early-Exit Bubble Sort | Short-circuiting pass loop when zero swaps occur | $O(N)$ best / $O(N^2)$ worst | $O(1)$ |
| [`PowerFun.java`](./TimeNSpace_Complexity/PowerFun.java) | Linear Exponentiation | Direct recursive multiplication: $a^n = a \cdot a^{n-1}$ | $O(n)$ | $O(n)$ |
| [`Power2.java`](./TimeNSpace_Complexity/Power2.java) | Binary Exponentiation | Divide-and-conquer exponentiation: $a^n = (a^{n/2})^2$ | $O(\log n)$ | $O(\log n)$ |

---

### 10 · Backtracking Algorithms

*Directory: [`Backracking/`](./Backracking)* — 9 files

| File | Problem | Backtracking Strategy | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`chnangeArr.java`](./Backracking/chnangeArr.java) | Array State Restoration | Modifying array on descent and restoring values on recursive return | $O(N)$ | $O(N)$ |
| [`FindSubset.java`](./Backracking/FindSubset.java) | Subsets Generation | Binary choice decision tree (include/exclude each element) | $O(2^N)$ | $O(N)$ |
| [`FindPermtn.java`](./Backracking/FindPermtn.java) | String Permutations | Recursive character selection with remaining substring concatenation | $O(N \cdot N!)$ | $O(N)$ |
| [`GridWays.java`](./Backracking/GridWays.java) | 2D Grid Path Count | Recursive exploration of Right and Down grid transitions | $O(2^{N+M})$ | $O(N+M)$ |
| [`NQueens.java`](./Backracking/NQueens.java) | N-Queens Solver | Chessboard constraint verification (row, diagonal, anti-diagonal) | $O(N!)$ | $O(N)$ |
| [`NQueens1soln.java`](./Backracking/NQueens1soln.java) | First Valid N-Queens | Early-exit backtracking returning immediately on first safe placement | $O(N!)$ | $O(N)$ |
| [`nQueens2.java`](./Backracking/nQueens2.java) | All N-Queens Boards | Exhaustive search printing every valid board configuration | $O(N!)$ | $O(N)$ |
| [`Soduku.java`](./Backracking/Soduku.java) | 9×9 Sudoku Solver | Digit placement validation across row, column, and $3 \times 3$ sub-box | $O(9^{N \times N})$ | $O(N^2)$ |
| [`waysToSolveN_queens.java`](./Backracking/waysToSolveN_queens.java) | Total N-Queens Solutions | Combinatorial counter tracking total valid configurations | $O(N!)$ | $O(N)$ |

---

### 11 · Linear Data Structures

*Directory: [`Linear_Structure/`](./Linear_Structure)* — 44 files

<details open>
<summary><b>11.1 Dynamic Arrays (ArrayList) — 12 Files</b></summary>

| File | Concept | Algorithmic Implementation | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`example.java`](./Linear_Structure/ArrayList/example.java) | ArrayList CRUD | Generics, `.add()`, `.get()`, `.set()`, `.remove()`, `.contains()` | $O(1)$ amortized | $O(N)$ |
| [`Maximum.java`](./Linear_Structure/ArrayList/Maximum.java) | Maximum Element | Single-pass scan computing global maximum | $O(N)$ | $O(N)$ |
| [`PrintReverseList.java`](./Linear_Structure/ArrayList/PrintReverseList.java) | Reverse Traversal | Backward iteration indexing from `size() - 1` to 0 | $O(N)$ | $O(N)$ |
| [`SwapTwoNumbers.java`](./Linear_Structure/ArrayList/SwapTwoNumbers.java) | Index Swapping | In-place element swap using temporary register and `.set()` | $O(1)$ | $O(N)$ |
| [`Sorting.java`](./Linear_Structure/ArrayList/Sorting.java) | Dual-Direction Sort | `Collections.sort()` ascending and `Collections.reverseOrder()` | $O(N \log N)$ | $O(\log N)$ |
| [`MultiDimsnAL.java`](./Linear_Structure/ArrayList/MultiDimsnAL.java) | 2D ArrayList Basics | Nested lists (`ArrayList<ArrayList<Integer>>`) row-column access | $O(N \times M)$ | $O(N \times M)$ |
| [`MultiDimsnAL2.java`](./Linear_Structure/ArrayList/MultiDimsnAL2.java) | Multi-Row Generation | Programmatic construction of dynamic variable-length table grids | $O(N \times M)$ | $O(N \times M)$ |
| [`ContainerWMW.java`](./Linear_Structure/ArrayList/ContainerWMW.java) | Container Water (Brute Force) | Nested loop evaluating container area across all $(i, j)$ pairs | $O(N^2)$ | $O(1)$ |
| [`TwoPointerCwMw.java`](./Linear_Structure/ArrayList/TwoPointerCwMw.java) | Container Water (Two Pointer) | Inward pointer contraction moving the shorter vertical boundary | $O(N)$ | $O(1)$ |
| [`PairSum1.java`](./Linear_Structure/ArrayList/PairSum1.java) | Pair Sum 1 (Brute Force) | Nested scan finding pair matching target sum in sorted list | $O(N^2)$ | $O(1)$ |
| [`PairSum1TwoP.java`](./Linear_Structure/ArrayList/PairSum1TwoP.java) | Pair Sum 1 (Two Pointer) | Opposite-end two-pointer search on sorted ArrayList | $O(N)$ | $O(1)$ |
| [`PairSum2.java`](./Linear_Structure/ArrayList/PairSum2.java) | Pair Sum 2 (Rotated List) | Pivot point identification with circular modular arithmetic pointers | $O(N)$ | $O(1)$ |

</details>

<details open>
<summary><b>11.2 Custom & Framework Linked Lists (LinkedList) — 12 Files</b></summary>

| File | Concept | Algorithmic Implementation | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`LinkedList.java`](./Linear_Structure/LInkedList/LinkedList.java) | Singly Linked List | Core implementation (`Node`, `addFirst`, `addLast`, `removeFirst`, `removeLast`) | $O(1)$ add/remove | $O(N)$ |
| [`reverseLinkedList.java`](./Linear_Structure/LInkedList/reverseLinkedList.java) | Reverse Linked List | 3-pointer iterative link inversion (`prev`, `curr`, `next`) | $O(N)$ | $O(1)$ |
| [`removeNthnodefromEnd.java`](./Linear_Structure/LInkedList/removeNthnodefromEnd.java) | Remove $N$-th Node From End | Two-pointer offset traversal bypassing target node | $O(N)$ | $O(1)$ |
| [`CheckLLisPalindrome.java`](./Linear_Structure/LInkedList/CheckLLisPalindrome.java) | Palindrome Linked List | Fast/slow pointer mid-find, 2nd-half reversal, dual-pointer comparison | $O(N)$ | $O(1)$ |
| [`CycleinLL.java`](./Linear_Structure/LInkedList/CycleinLL.java) | Cycle Detection | Floyd's Cycle-Finding Algorithm using slow and fast pointers | $O(N)$ | $O(1)$ |
| [`removeCycleinLL.java`](./Linear_Structure/LInkedList/removeCycleinLL.java) | Cycle Removal | Meeting point discovery, cycle entry node search, loop severing | $O(N)$ | $O(1)$ |
| [`DoublyLL.java`](./Linear_Structure/LInkedList/DoublyLL.java) | Doubly Linked List | Bidirectional node links (`prev`/`next`) with head/tail updates | $O(1)$ add/remove | $O(N)$ |
| [`reverseDLL.java`](./Linear_Structure/LInkedList/reverseDLL.java) | Reverse Doubly Linked List | Iterative node pointer swapping (`curr.next` and `curr.prev`) | $O(N)$ | $O(1)$ |
| [`MergeSortLL.java`](./Linear_Structure/LInkedList/MergeSortLL.java) | Merge Sort on Linked List | Slow/fast mid finding, recursive split, sorted linked merging | $O(N \log N)$ | $O(\log N)$ |
| [`ZigZagLL.java`](./Linear_Structure/LInkedList/ZigZagLL.java) | Zig-Zag Reordering | Mid split, 2nd-half reversal, alternating merge ($1 \to N \to 2 \dots$) | $O(N)$ | $O(1)$ |
| [`circularLL.java`](./Linear_Structure/LInkedList/circularLL.java) | Circular Linked List | Node structure with continuous tail-to-head circular reference | $O(1)$ add/remove | $O(N)$ |
| [`collectionLL.java`](./Linear_Structure/LInkedList/collectionLL.java) | JCF LinkedList API | Standard library `java.util.LinkedList` methods and iteration | $O(1)$ add/remove | $O(N)$ |

</details>

<details open>
<summary><b>11.3 Queue Architectures (Queue) — 10 Files</b></summary>

| File | Concept | Algorithmic Implementation | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`Structure.java`](./Linear_Structure/Queue/Structure.java) | Circular Array Queue | Fixed-capacity array with circular `front` and `rear` modulo pointers | $O(1)$ amortized | $O(N)$ |
| [`queueUsingLL.java`](./Linear_Structure/Queue/queueUsingLL.java) | Linked List Queue | Singly linked list queue maintaining $O(1)$ head dequeue and tail enqueue | $O(1)$ | $O(N)$ |
| [`queueUsingJcf.java`](./Linear_Structure/Queue/queueUsingJcf.java) | JCF Queue Interface | Standard library queue usage via `LinkedList` and `ArrayDeque` | $O(1)$ | $O(N)$ |
| [`queueUsing2Stack.java`](./Linear_Structure/Queue/queueUsing2Stack.java) | Queue using 2 Stacks | FIFO queue emulation backed by dual LIFO stacks ($O(N)$ push / $O(1)$ pop) | $O(1)$ amortized | $O(N)$ |
| [`stackUsing2queue.java`](./Linear_Structure/Queue/stackUsing2queue.java) | Stack using 2 Queues | LIFO stack emulation backed by dual FIFO queues | $O(1)$ amortized | $O(N)$ |
| [`nonRepeatingLetter.java`](./Linear_Structure/Queue/nonRepeatingLetter.java) | First Non-Repeating Char | Character stream processing using FIFO queue and frequency map | $O(N)$ | $O(1)$ |
| [`Interleave2Halves.java`](./Linear_Structure/Queue/Interleave2Halves.java) | Interleave Queue Halves | Halving queue with auxiliary queue and alternating order reconstruction | $O(N)$ | $O(N)$ |
| [`queueReversal.java`](./Linear_Structure/Queue/queueReversal.java) | Queue Reversal | Inverting queue element sequence using an auxiliary Stack | $O(N)$ | $O(N)$ |
| [`DequqExample.java`](./Linear_Structure/Queue/DequqExample.java) | Deque Operations | Double-ended queue methods (`addFirst`, `addLast`, `removeFirst`, `removeLast`) | $O(1)$ | $O(N)$ |
| [`stackUsingDeque.java`](./Linear_Structure/Queue/stackUsingDeque.java) | Stack & Queue via Deque | Abstracting LIFO Stack and FIFO Queue interfaces on top of Deque | $O(1)$ | $O(N)$ |

</details>

<details open>
<summary><b>11.4 Stack Data Structure & Monotonic Stacks (Stack) — 10 Files</b></summary>

| File | Concept | Algorithmic Implementation | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`StackB.java`](./Linear_Structure/Stack/StackB.java) | Stack via ArrayList | Dynamic LIFO stack implementation backed by `java.util.ArrayList` | $O(1)$ amortized | $O(N)$ |
| [`StackbyLL.java`](./Linear_Structure/Stack/StackbyLL.java) | Stack via Linked List | Node-based LIFO stack with $O(1)$ head insertion and removal | $O(1)$ | $O(N)$ |
| [`PushAtBottom.java`](./Linear_Structure/Stack/PushAtBottom.java) | Push at Bottom | Recursive implicit call-stack insertion placing target element at bottom | $O(N)$ | $O(N)$ |
| [`reverseStringByStack.java`](./Linear_Structure/Stack/reverseStringByStack.java) | String Reversal via Stack | Character sequence reversal via push-all and pop-all operations | $O(N)$ | $O(N)$ |
| [`ReverseStack.java`](./Linear_Structure/Stack/ReverseStack.java) | In-Place Stack Reversal | Reversing stack using pure recursion and `pushAtBottom` without auxiliary data | $O(N^2)$ | $O(N)$ |
| [`StockSpan.java`](./Linear_Structure/Stack/StockSpan.java) | Stock Span Problem | Monotonic decreasing stack storing price indices for consecutive days | $O(N)$ | $O(N)$ |
| [`NextGreaterElement.java`](./Linear_Structure/Stack/NextGreaterElement.java) | Next Greater Element | Monotonic stack right-to-left scan tracking nearest greater values | $O(N)$ | $O(N)$ |
| [`ValidParantheses.java`](./Linear_Structure/Stack/ValidParantheses.java) | Valid Parentheses | Bracket matching for `()`, `[]`, `{}` using LIFO stack | $O(N)$ | $O(N)$ |
| [`DuplicateParantheses.java`](./Linear_Structure/Stack/DuplicateParantheses.java) | Duplicate Parentheses | Detecting redundant bracket sets via operator element count on pop | $O(N)$ | $O(N)$ |
| [`MaxAreaHistogram.java`](./Linear_Structure/Stack/MaxAreaHistogram.java) | Max Area in Histogram | Monotonic stack finding Next Smaller Left (NSL) & Next Smaller Right (NSR) | $O(N)$ | $O(N)$ |

</details>

---

### 12 · Binary Tree Structures

*Directory: [`NonLinear_Structure/BinaryTree`](./NonLinear_Structure/BinaryTree)* — 11 files

| File | Algorithmic Task | Implementation Pattern | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`Classroom.java`](./NonLinear_Structure/BinaryTree/Classroom.java) | Tree Construction & Traversals | Node structure, Preorder, Inorder, Postorder, and BFS Level-Order | $O(N)$ | $O(N)$ |
| [`CountOfNodes.java`](./NonLinear_Structure/BinaryTree/CountOfNodes.java) | Node Count & Sum | Recursive tree aggregation summing total nodes and values | $O(N)$ | $O(N)$ |
| [`DiameteOfTree.java`](./NonLinear_Structure/BinaryTree/DiameteOfTree.java) | Tree Diameter | Longest path between nodes ($O(N^2)$ and optimized $O(N)$ height-diameter pair) | $O(N)$ | $O(N)$ |
| [`HeightOfTree.java`](./NonLinear_Structure/BinaryTree/HeightOfTree.java) | Tree Height | Maximum tree depth calculation: $1 + \max(lh, rh)$ | $O(N)$ | $O(N)$ |
| [`KthAncestor.java`](./NonLinear_Structure/BinaryTree/KthAncestor.java) | $K$-th Ancestor | Recursive ancestor search locating node $K$ levels above target | $O(N)$ | $O(N)$ |
| [`KthLevel.java`](./NonLinear_Structure/BinaryTree/KthLevel.java) | $K$-th Level Elements | Recursive depth-first printing of all nodes at target level $K$ | $O(N)$ | $O(N)$ |
| [`LowestCommonAncestor.java`](./NonLinear_Structure/BinaryTree/LowestCommonAncestor.java) | Lowest Common Ancestor (LCA) | Path array comparison and optimal single-traversal recursion | $O(N)$ | $O(N)$ |
| [`MinDistance.java`](./NonLinear_Structure/BinaryTree/MinDistance.java) | Minimum Node Distance | Shortest path between nodes: $dist(n1, n2) = dist(LCA, n1) + dist(LCA, n2)$ | $O(N)$ | $O(N)$ |
| [`Subtree.java`](./NonLinear_Structure/BinaryTree/Subtree.java) | Subtree Verification | Subtree isomorphism check validating if subtree is identical to root branch | $O(N \times M)$ | $O(N)$ |
| [`TopView.java`](./NonLinear_Structure/BinaryTree/TopView.java) | Tree Top View | Horizontal distance coordinates with BFS queue and tracking map | $O(N)$ | $O(N)$ |
| [`TransformSum.java`](./NonLinear_Structure/BinaryTree/TransformSum.java) | Transform to Sum Tree | In-place tree mutation replacing node value with sum of child subtrees | $O(N)$ | $O(N)$ |

---

### 13 · Greedy Algorithms & Optimization

*Directory: [`Greedy_Algorithm/`](./Greedy_Algorithm)* — 9 files

| File | Problem Statement | Greedy Strategy | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`ActivitySelection.java`](./Greedy_Algorithm/ActivitySelection.java) | Activity Selection (Sorted) | Always choosing activity with earliest finish time on sorted input | $O(N)$ | $O(1)$ |
| [`unsortedActSelecn.java`](./Greedy_Algorithm/unsortedActSelecn.java) | Activity Selection (Unsorted) | Custom 2D comparator sorting intervals by end time | $O(N \log N)$ | $O(N)$ |
| [`FractionalKanpsack.java`](./Greedy_Algorithm/FractionalKanpsack.java) | Fractional Knapsack | Maximizing value via descending value-to-weight ratio sorting | $O(N \log N)$ | $O(N)$ |
| [`MinAbsoluteDiffPairs.java`](./Greedy_Algorithm/MinAbsoluteDiffPairs.java) | Min Absolute Difference Pairs | Sorting dual arrays and pairing corresponding sorted indices | $O(N \log N)$ | $O(1)$ |
| [`ManLengthChainOfPairs.java`](./Greedy_Algorithm/ManLengthChainOfPairs.java) | Max Length Chain of Pairs | Sorting pairs by second element and greedily appending compatible pairs | $O(N \log N)$ | $O(1)$ |
| [`NonOverlappingIntervals.java`](./Greedy_Algorithm/NonOverlappingIntervals.java) | Non-Overlapping Intervals | Greedily removing overlapping intervals with later finish times | $O(N \log N)$ | $O(1)$ |
| [`IndianCoins.java`](./Greedy_Algorithm/IndianCoins.java) | Canonical Coin Change | Greedily selecting maximal currency denomination for canonical systems | $O(N \log N)$ | $O(N)$ |
| [`JobSequencing.java`](./Greedy_Algorithm/JobSequencing.java) | Job Sequencing with Deadlines | Sorting jobs by profit and greedily scheduling in latest open slot $\le deadline$ | $O(N \log N)$ | $O(N)$ |
| [`ChocolaProblem.java`](./Greedy_Algorithm/ChocolaProblem.java) | Chocola (Board Cutting) | Sorting cut costs descending and greedily executing highest cost cuts first | $O(N \log N + M \log M)$ | $O(1)$ |

---

### 14 · Binary Search Tree (BST)

*Directory: [`BinarySearch_Tree/`](./BinarySearch_Tree)* — 9 files

| File | Algorithmic Task | Implementation Pattern | Time | Space |
| :--- | :--- | :--- | :---: | :---: |
| [`BST.java`](./BinarySearch_Tree/BST.java) | BST Core Construction | Recursive insertion preserving left < root < right and Inorder traversal | $O(H)$ | $O(H)$ |
| [`SearchBST.java`](./BinarySearch_Tree/SearchBST.java) | BST Search | Interval halving search comparing target with current node value | $O(H)$ | $O(H)$ |
| [`DeleteNode.java`](./BinarySearch_Tree/DeleteNode.java) | BST Deletion & Range Print | Node deletion (0, 1, or 2 children via inorder successor) & range search | $O(H)$ | $O(H)$ |
| [`BSTtoBalancedBST.java`](./BinarySearch_Tree/BSTtoBalancedBST.java) | BST Balancing | Inorder extraction to sorted list and divide-and-conquer balanced rebuild | $O(N)$ | $O(N)$ |
| [`MirrorBST.java`](./BinarySearch_Tree/MirrorBST.java) | Mirror a BST | Inverting tree structure by swapping left and right subtrees recursively | $O(N)$ | $O(H)$ |
| [`Paths.java`](./BinarySearch_Tree/Paths.java) | Root-to-Leaf Paths | Depth-first path tracking printing all trajectories from root to leaves | $O(N)$ | $O(H)$ |
| [`SortedArrayToBST.java`](./BinarySearch_Tree/SortedArrayToBST.java) | Sorted Array to BST | Divide-and-conquer constructing minimum-height balanced BST from array | $O(N)$ | $O(H)$ |
| [`ValidateBST.java`](./BinarySearch_Tree/ValidateBST.java) | Validate BST | Range boundary validation ensuring every node satisfies $(min < node < max)$ | $O(N)$ | $O(H)$ |
| [`LargestBST.java`](./BinarySearch_Tree/LargestBST.java) | Largest BST Subtree | Bottom-up post-order subtree size validation returning largest valid BST | $O(N)$ | $O(H)$ |

---

### 15 · Dynamic Programming

*Directory: [`Dyanmic_Programming/`](./Dyanmic_Programming)* — 6 files

| File | Problem Statement | DP Technique | Time | Space | Notes |
| :--- | :--- | :--- | :---: | :---: | :--- |
| [`DP.java`](./Dyanmic_Programming/DP.java) | Fibonacci Numbers | Top-Down Memoization & Bottom-Up Tabulation | $O(N)$ | $O(N)$ | State caching preventing exponential subproblem recalculation |
| [`Climbing.java`](./Dyanmic_Programming/Climbing.java) | Climbing Stairs | Recursion, Memoization & Tabulation | $O(N)$ | $O(N)$ | Counting ways with step sizes 1 and 2: $DP[i] = DP[i-1] + DP[i-2]$ |
| [`Knapsack.java`](./Dyanmic_Programming/Knapsack.java) | 0-1 Knapsack Problem | Recursion, Top-Down Memo & Bottom-Up Tabulation | $O(N \times W)$ | $O(N \times W)$ | Optimal subset value maximization with 2D DP matrix visualization |
| [`TargetSumSubset.java`](./Dyanmic_Programming/TargetSumSubset.java) | Target Sum Subset | Boolean DP Tabulation Matrix | $O(N \times \text{sum})$ | $O(N \times \text{sum})$ | Boolean table: $DP[i][j] = DP[i-1][j - w] \lor DP[i-1][j]$ |
| [`UnboundesKnapsack.java`](./Dyanmic_Programming/UnboundesKnapsack.java) | Unbounded Knapsack | Bottom-Up Tabulation with Item Reuse | $O(N \times W)$ | $O(N \times W)$ | State transition allowing repeat inclusion: $val[i-1] + DP[i][j - wt[i-1]]$ |
| [`CoinChange.java`](./Dyanmic_Programming/CoinChange.java) | Coin Change (Ways) | Unbounded Knapsack Combinations | $O(N \times \text{sum})$ | $O(N \times \text{sum})$ | Total combinations to form sum: $DP[i][j] = DP[i][j - coin] + DP[i-1][j]$ |

---

## 💡 LeetCode Solutions Tracker

<div align="center">

| Difficulty | Solved | Primary Paradigms |
| :---: | :---: | :--- |
| 🟢 **Easy** | **33** | Hash Maps, Two Pointers, String Simulation, Binary Trees, Bitwise Operations |
| 🟡 **Medium** | **38** | Monotonic Stacks, 2D Grid Search, Unbounded & 0-1 Knapsack DP, Prefix Sums |
| 🔴 **Hard** | **15** | Minimax Game Theory, Monotonic Boundary Bounds, Dynamic Bitmasking, Backtracking |
| **Total** | **86** | Validated, standalone solutions with README explanations |

</div>

<details>
<summary><b>🟢 Easy Solutions (33 Problems) — Expand to view</b></summary>
<br/>

| # | Problem | Category | Primary Technique | Solution |
| :---: | :--- | :--- | :--- | :---: |
| 0001 | [Two Sum](./LeetCode_Problems/0001-two-sum) | Hash Table / Array | Complement Lookup ($O(N)$) | [Java](./LeetCode_Problems/0001-two-sum/0001-two-sum.java) |
| 0009 | [Palindrome Number](./LeetCode_Problems/0009-palindrome-number) | Math | Half-Integer Reversal ($O(\log_{10} N)$) | [Java](./LeetCode_Problems/0009-palindrome-number/0009-palindrome-number.java) |
| 0020 | [Valid Parentheses](./LeetCode_Problems/0020-valid-parentheses) | Stack / String | LIFO Character Matching ($O(N)$) | [Java](./LeetCode_Problems/0020-valid-parentheses/0020-valid-parentheses.java) |
| 0026 | [Remove Duplicates from Sorted Array](./LeetCode_Problems/0026-remove-duplicates-from-sorted-array) | Two Pointers | In-Place Write Pointer ($O(N)$) | [Java](./LeetCode_Problems/0026-remove-duplicates-from-sorted-array/0026-remove-duplicates-from-sorted-array.java) |
| 0028 | [Find Index of First Occurrence in String](./LeetCode_Problems/0028-find-the-index-of-the-first-occurrence-in-a-string) | String Matching | Sliding Window Comparison ($O(N \cdot M)$) | [Java](./LeetCode_Problems/0028-find-the-index-of-the-first-occurrence-in-a-string/0028-find-the-index-of-the-first-occurrence-in-a-string.java) |
| 0070 | [Climbing Stairs](./LeetCode_Problems/0070-climbing-stairs) | Dynamic Programming | Fibonacci Recurrence ($O(N)$) | [Java](./LeetCode_Problems/0070-climbing-stairs/0070-climbing-stairs.java) |
| 0088 | [Merge Sorted Array](./LeetCode_Problems/0088-merge-sorted-array) | Two Pointers | Reverse Tail-to-Front Insertion ($O(N+M)$) | [Java](./LeetCode_Problems/0088-merge-sorted-array/0088-merge-sorted-array.java) |
| 0108 | [Convert Sorted Array to Binary Search Tree](./LeetCode_Problems/0108-convert-sorted-array-to-binary-search-tree) | Tree / Divide & Conquer | Midpoint Pivot Divide-and-Conquer ($O(N)$) | [Java](./LeetCode_Problems/0108-convert-sorted-array-to-binary-search-tree/0108-convert-sorted-array-to-binary-search-tree.java) |
| 0121 | [Best Time to Buy and Sell Stock](./LeetCode_Problems/0121-best-time-to-buy-and-sell-stock) | Dynamic Programming | Running Minimum Scan ($O(N)$) | [Java](./LeetCode_Problems/0121-best-time-to-buy-and-sell-stock/0121-best-time-to-buy-and-sell-stock.java) |
| 0141 | [Linked List Cycle](./LeetCode_Problems/0141-linked-list-cycle) | Linked List | Floyd's Fast & Slow Pointers ($O(N)$) | [Java](./LeetCode_Problems/0141-linked-list-cycle/0141-linked-list-cycle.java) |
| 0190 | [Reverse Bits](./LeetCode_Problems/0190-reverse-bits) | Bit Manipulation | Bit-by-Bit Shift Assembly ($O(1)$) | [Java](./LeetCode_Problems/0190-reverse-bits/0190-reverse-bits.java) |
| 0206 | [Reverse Linked List](./LeetCode_Problems/0206-reverse-linked-list) | Linked List | 3-Pointer Iterative Reversal ($O(N)$) | [Java](./LeetCode_Problems/0206-reverse-linked-list/0206-reverse-linked-list.java) |
| 0225 | [Implement Stack using Queues](./LeetCode_Problems/0225-implement-stack-using-queues) | Design / Queue | Single Queue Rotation on Push ($O(N)$) | [Java](./LeetCode_Problems/0225-implement-stack-using-queues/0225-implement-stack-using-queues.java) |
| 0231 | [Power of Two](./LeetCode_Problems/0231-power-of-two) | Bit Manipulation / Math | Bitwise Bit-Clear Test `n > 0 && (n & (n - 1)) == 0` | [Java](./LeetCode_Problems/0231-power-of-two/0231-power-of-two.java) |
| 0232 | [Implement Queue using Stacks](./LeetCode_Problems/0232-implement-queue-using-stacks) | Design / Stack | Dual Stacks Amortized Transfer ($O(1)$) | [Java](./LeetCode_Problems/0232-implement-queue-using-stacks/0232-implement-queue-using-stacks.java) |
| 0234 | [Palindrome Linked List](./LeetCode_Problems/0234-palindrome-linked-list) | Linked List / Two Pointers | Fast/Slow Mid + Half Reversal ($O(N)$) | [Java](./LeetCode_Problems/0234-palindrome-linked-list/0234-palindrome-linked-list.java) |
| 0283 | [Move Zeroes](./LeetCode_Problems/0283-move-zeroes) | Two Pointers | Non-Zero Shift and Fill ($O(N)$) | [Java](./LeetCode_Problems/0283-move-zeroes/0283-move-zeroes.java) |
| 0344 | [Reverse String](./LeetCode_Problems/0344-reverse-string) | Two Pointers | In-Place Opposite End Swap ($O(N)$) | [Java](./LeetCode_Problems/0344-reverse-string/0344-reverse-string.java) |
| 0455 | [Assign Cookies](./LeetCode_Problems/0455-assign-cookies) | Greedy / Sorting | Dual Array Sorted Greedy Matching ($O(N \log N)$) | [Java](./LeetCode_Problems/0455-assign-cookies/0455-assign-cookies.java) |
| 0496 | [Next Greater Element I](./LeetCode_Problems/0496-next-greater-element-i) | Monotonic Stack | Decreasing Monotonic Stack + Map ($O(N)$) | [Java](./LeetCode_Problems/0496-next-greater-element-i/0496-next-greater-element-i.java) |
| 0509 | [Fibonacci Number](./LeetCode_Problems/0509-fibonacci-number) | Dynamic Programming | Iterative Space-Optimized DP ($O(N)$) | [Java](./LeetCode_Problems/0509-fibonacci-number/0509-fibonacci-number.java) |
| 0541 | [Reverse String II](./LeetCode_Problems/0541-reverse-string-ii) | Two Pointers / String | Chunk Step Traversal ($O(N)$) | [Java](./LeetCode_Problems/0541-reverse-string-ii/0541-reverse-string-ii.java) |
| 0700 | [Search in a Binary Search Tree](./LeetCode_Problems/0700-search-in-a-binary-search-tree) | Tree / BST | Value-Guided Subtree Navigation ($O(H)$) | [Java](./LeetCode_Problems/0700-search-in-a-binary-search-tree/0700-search-in-a-binary-search-tree.java) |
| 1189 | [Maximum Number of Balloons](./LeetCode_Problems/1189-maximum-number-of-balloons) | Hash Table / Counting | Character Frequency Bottleneck ($O(N)$) | [Java](./LeetCode_Problems/1189-maximum-number-of-balloons/1189-maximum-number-of-balloons.java) |
| 1464 | [Max Product of Two Elements](./LeetCode_Problems/1464-maximum-product-of-two-elements-in-an-array) | Greedy | Top-2 Running Maximums ($O(N)$) | [Java](./LeetCode_Problems/1464-maximum-product-of-two-elements-in-an-array/1464-maximum-product-of-two-elements-in-an-array.java) |
| 1572 | [Matrix Diagonal Sum](./LeetCode_Problems/1572-matrix-diagonal-sum) | Matrix / Array | Single-Pass Both Diagonals ($O(N)$) | [Java](./LeetCode_Problems/1572-matrix-diagonal-sum/1572-matrix-diagonal-sum.java) |
| 1614 | [Maximum Nesting Depth of Parentheses](./LeetCode_Problems/1614-maximum-nesting-depth-of-the-parentheses) | Stack / String | Running Counter Peak Tracker ($O(N)$) | [Java](./LeetCode_Problems/1614-maximum-nesting-depth-of-the-parentheses/1614-maximum-nesting-depth-of-the-parentheses.java) |
| 1624 | [Largest Substring Between Equal Chars](./LeetCode_Problems/1624-largest-substring-between-two-equal-characters) | Hash Table | First Occurrence Index Array ($O(N)$) | [Java](./LeetCode_Problems/1624-largest-substring-between-two-equal-characters/1624-largest-substring-between-two-equal-characters.java) |
| 2769 | [Find Maximum Achievable Number](./LeetCode_Problems/2769-find-the-maximum-achievable-number) | Math | Mathematical Formula $num + 2 \cdot t$ | [Java](./LeetCode_Problems/2769-find-the-maximum-achievable-number/2769-find-the-maximum-achievable-number.java) |
| 3014 | [Min Pushes to Type Word I](./LeetCode_Problems/3014-minimum-number-of-pushes-to-type-word-i) | Greedy | 8-Key Assignment Greedy Allocation | [Java](./LeetCode_Problems/3014-minimum-number-of-pushes-to-type-word-i/3014-minimum-number-of-pushes-to-type-word-i.java) |
| 3345 | [Smallest Divisible Digit Product I](./LeetCode_Problems/3345-smallest-divisible-digit-product-i) | Math | Sequential Simulation ($O(1)$) | [Java](./LeetCode_Problems/3345-smallest-divisible-digit-product-i/3345-smallest-divisible-digit-product-i.java) |
| 3731 | [Find Missing Elements](./LeetCode_Problems/3731-find-missing-elements) | Hash Set | Set Difference Membership Search | [Java](./LeetCode_Problems/3731-find-missing-elements/3731-find-missing-elements.java) |
| 3936 | [Min Swaps to Move Zeros to End](./LeetCode_Problems/3936-minimum-swaps-to-move-zeros-to-end) | Greedy | Linear Scan Non-Zero Swapping | [Java](./LeetCode_Problems/3936-minimum-swaps-to-move-zeros-to-end/3936-minimum-swaps-to-move-zeros-to-end.java) |

</details>

<details>
<summary><b>🟡 Medium Solutions (38 Problems) — Expand to view</b></summary>
<br/>

| # | Problem | Category | Primary Technique | Solution |
| :---: | :--- | :--- | :--- | :---: |
| 0002 | [Add Two Numbers](./LeetCode_Problems/0002-add-two-numbers) | Linked List / Math | Columnar Sum with Carry Propagation | [Java](./LeetCode_Problems/0002-add-two-numbers/0002-add-two-numbers.java) |
| 0003 | [Longest Substring Without Repeating Characters](./LeetCode_Problems/0003-longest-substring-without-repeating-characters) | Sliding Window | Dynamic Sliding Window + Last Seen Index Map | [Java](./LeetCode_Problems/0003-longest-substring-without-repeating-characters/0003-longest-substring-without-repeating-characters.java) |
| 0006 | [Zigzag Conversion](./LeetCode_Problems/0006-zigzag-conversion) | String / Simulation | Row Buffers Simulation with Direction Flip | [Java](./LeetCode_Problems/0006-zigzag-conversion/0006-zigzag-conversion.java) |
| 0007 | [Reverse Integer](./LeetCode_Problems/0007-reverse-integer) | Math | Modulo Reversal with 32-bit Overflow Detection | [Java](./LeetCode_Problems/0007-reverse-integer/0007-reverse-integer.java) |
| 0011 | [Container With Most Water](./LeetCode_Problems/0011-container-with-most-water) | Two Pointers | Inward Contraction Moving Shorter Boundary | [Java](./LeetCode_Problems/0011-container-with-most-water/0011-container-with-most-water.java) |
| 0019 | [Remove Nth Node From End of List](./LeetCode_Problems/0019-remove-nth-node-from-end-of-list) | Linked List | Fast/Slow Gap Pointer Offset Unlinking | [Java](./LeetCode_Problems/0019-remove-nth-node-from-end-of-list/0019-remove-nth-node-from-end-of-list.java) |
| 0054 | [Spiral Matrix](./LeetCode_Problems/0054-spiral-matrix) | Matrix Simulation | 4-Boundary Layer Contraction ($O(N \cdot M)$) | [Java](./LeetCode_Problems/0054-spiral-matrix/0054-spiral-matrix.java) |
| 0059 | [Spiral Matrix II](./LeetCode_Problems/0059-spiral-matrix-ii) | Matrix Simulation | Clockwise Matrix Filling ($O(N^2)$) | [Java](./LeetCode_Problems/0059-spiral-matrix-ii/0059-spiral-matrix-ii.java) |
| 0074 | [Search a 2D Matrix](./LeetCode_Problems/0074-search-a-2d-matrix) | Binary Search | Virtual 1D Array Mapping ($O(\log(N \cdot M))$) | [Java](./LeetCode_Problems/0074-search-a-2d-matrix/0074-search-a-2d-matrix.java) |
| 0078 | [Subsets](./LeetCode_Problems/0078-subsets) | Backtracking | Binary Decision Tree Inclusion/Exclusion | [Java](./LeetCode_Problems/0078-subsets/0078-subsets.java) |
| 0090 | [Subsets II](./LeetCode_Problems/0090-subsets-ii) | Backtracking | Sorted Backtracking Skipping Duplicate Siblings | [Java](./LeetCode_Problems/0090-subsets-ii/0090-subsets-ii.java) |
| 0092 | [Reverse Linked List II](./LeetCode_Problems/0092-reverse-linked-list-ii) | Linked List | In-Place Subsegment Pointer Reversal | [Java](./LeetCode_Problems/0092-reverse-linked-list-ii/0092-reverse-linked-list-ii.java) |
| 0142 | [Linked List Cycle II](./LeetCode_Problems/0142-linked-list-cycle-ii) | Linked List | Floyd's Detection + Head-Meeting Entry Step | [Java](./LeetCode_Problems/0142-linked-list-cycle-ii/0142-linked-list-cycle-ii.java) |
| 0153 | [Find Min in Rotated Sorted Array](./LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array) | Binary Search | Modified Binary Search on Inflection Point | [Java](./LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array/0153-find-minimum-in-rotated-sorted-array.java) · [C++](./LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array/0153-find-minimum-in-rotated-sorted-array.cpp) |
| 0201 | [Bitwise AND of Numbers Range](./LeetCode_Problems/0201-bitwise-and-of-numbers-range) | Bit Manipulation | Common Bit Prefix Extraction via Right Shifts | [Java](./LeetCode_Problems/0201-bitwise-and-of-numbers-range/0201-bitwise-and-of-numbers-range.java) |
| 0238 | [Product of Array Except Self](./LeetCode_Problems/0238-product-of-array-except-self) | Prefix / Suffix | Dual Prefix & Suffix Products ($O(N)$ time, $O(1)$ aux) | [Java](./LeetCode_Problems/0238-product-of-array-except-self/0238-product-of-array-except-self.java) |
| 0322 | [Coin Change](./LeetCode_Problems/0322-coin-change) | Dynamic Programming | Unbounded Knapsack Tabulation (Min Coins) | [Java](./LeetCode_Problems/0322-coin-change/0322-coin-change.java) |
| 0371 | [Sum of Two Integers](./LeetCode_Problems/0371-sum-of-two-integers) | Bit Manipulation | Half Adder Logic via XOR and Shifted Carry (`&`) | [Java](./LeetCode_Problems/0371-sum-of-two-integers/0371-sum-of-two-integers.java) |
| 0435 | [Non-overlapping Intervals](./LeetCode_Problems/0435-non-overlapping-intervals) | Greedy / Sorting | Interval Scheduling Sorting by Earliest End Time | [Java](./LeetCode_Problems/0435-non-overlapping-intervals/0435-non-overlapping-intervals.java) |
| 0450 | [Delete Node in a BST](./LeetCode_Problems/0450-delete-node-in-a-bst) | Tree / BST | Inorder Successor Replacement Deletion ($O(H)$) | [Java](./LeetCode_Problems/0450-delete-node-in-a-bst/0450-delete-node-in-a-bst.java) |
| 0486 | [Predict the Winner](./LeetCode_Problems/0486-predict-the-winner) | DP / Minimax | Game Theory Interval DP Table ($O(N^2)$) | [Java](./LeetCode_Problems/0486-predict-the-winner/0486-predict-the-winner.java) |
| 0494 | [Target Sum](./LeetCode_Problems/0494-target-sum) | Dynamic Programming | Subset Sum Reduction $S = \frac{total + target}{2}$ | [Java](./LeetCode_Problems/0494-target-sum/0494-target-sum.java) |
| 0503 | [Next Greater Element II](./LeetCode_Problems/0503-next-greater-element-ii) | Monotonic Stack | Circular Array Monotonic Stack via $2N$ Indices | [Java](./LeetCode_Problems/0503-next-greater-element-ii/0503-next-greater-element-ii.java) |
| 0518 | [Coin Change II](./LeetCode_Problems/0518-coin-change-ii) | Dynamic Programming | Unbounded Knapsack Tabulation (Total Ways) | [Java](./LeetCode_Problems/0518-coin-change-ii/0518-coin-change-ii.java) |
| 0538 | [Convert BST to Greater Tree](./LeetCode_Problems/0538-convert-bst-to-greater-tree) | Tree / BST | Reverse Inorder Traversal (Right $\to$ Root $\to$ Left) | [Java](./LeetCode_Problems/0538-convert-bst-to-greater-tree/0538-convert-bst-to-greater-tree.java) |
| 0556 | [Next Greater Element III](./LeetCode_Problems/0556-next-greater-element-iii) | Math / Two Pointers | Next Lexicographical Permutation Algorithm | [Java](./LeetCode_Problems/0556-next-greater-element-iii/0556-next-greater-element-iii.java) |
| 0567 | [Permutation in String](./LeetCode_Problems/0567-permutation-in-string) | Sliding Window | Fixed-Length Frequency Map Matching | [Java](./LeetCode_Problems/0567-permutation-in-string/0567-permutation-in-string.java) |
| 0735 | [Asteroid Collision](./LeetCode_Problems/0735-asteroid-collision) | Stack | LIFO Stack Simulating Right-to-Left Collisions | [Java](./LeetCode_Problems/0735-asteroid-collision/0735-asteroid-collision.java) |
| 0813 | [Largest Sum of Averages](./LeetCode_Problems/0813-largest-sum-of-averages) | Dynamic Programming | 2D Partition DP with Prefix Sums ($O(K \cdot N^2)$) | [Java](./LeetCode_Problems/0813-largest-sum-of-averages/0813-largest-sum-of-averages.java) |
| 0877 | [Stone Game](./LeetCode_Problems/0877-stone-game) | Game Theory / DP | Minimax Choice Evaluation ($O(1)$ Math / $O(N^2)$ DP) | [Java](./LeetCode_Problems/0877-stone-game/0877-stone-game.java) |
| 1222 | [Queens That Can Attack the King](./LeetCode_Problems/1222-queens-that-can-attack-the-king) | Matrix / Simulation | 8-Direction Raycast Collision from King ($O(1)$) | [Java](./LeetCode_Problems/1222-queens-that-can-attack-the-king/1222-queens-that-can-attack-the-king.java) |
| 2812 | [Find Safest Path in a Grid](./LeetCode_Problems/2812-find-the-safest-path-in-a-grid) | BFS / Binary Search | Multi-Source BFS Distance Field + Binary Search | [Java](./LeetCode_Problems/2812-find-the-safest-path-in-a-grid/2812-find-the-safest-path-in-a-grid.java) |
| 3016 | [Min Pushes to Type Word II](./LeetCode_Problems/3016-minimum-number-of-pushes-to-type-word-ii) | Greedy / Sorting | Frequency-Sorted Keypad Slot Assignment | [Java](./LeetCode_Problems/3016-minimum-number-of-pushes-to-type-word-ii/3016-minimum-number-of-pushes-to-type-word-ii.java) |
| 3159 | [Find Occurrences of Element in Array](./LeetCode_Problems/3159-find-occurrences-of-an-element-in-an-array) | Array / Hash Map | Precomputed Match Index Vector ($O(1)$ query) | [Java](./LeetCode_Problems/3159-find-occurrences-of-an-element-in-an-array/3159-find-occurrences-of-an-element-in-an-array.java) |
| 3228 | [Max Ops to Move Ones to End](./LeetCode_Problems/3228-maximum-number-of-operations-to-move-ones-to-the-end) | Greedy / String | Running Prefix Accumulator of '1's | [Python](./LeetCode_Problems/3228-maximum-number-of-operations-to-move-ones-to-the-end/3228-maximum-number-of-operations-to-move-ones-to-the-end.py) |
| 3302 | [Lexicographically Smallest Valid Seq](./LeetCode_Problems/3302-find-the-lexicographically-smallest-valid-sequence) | Two Pointers / DP | Suffix Greedy Match Array + Greedy Prefix Search | [Java](./LeetCode_Problems/3302-find-the-lexicographically-smallest-valid-sequence/3302-find-the-lexicographically-smallest-valid-sequence.java) |
| 3310 | [Remove Methods From Project](./LeetCode_Problems/3310-remove-methods-from-project) | Graph / BFS / DFS | Directed Reachability & External Caller Traversal | [Java](./LeetCode_Problems/3310-remove-methods-from-project/3310-remove-methods-from-project.java) |
| 3517 | [Smallest Palindromic Rearrangement I](./LeetCode_Problems/3517-smallest-palindromic-rearrangement-i) | Greedy / Sorting | Frequency Parity Half-String Construction | [Java](./LeetCode_Problems/3517-smallest-palindromic-rearrangement-i/3517-smallest-palindromic-rearrangement-i.java) |

</details>

<details>
<summary><b>🔴 Hard Solutions (15 Problems) — Expand to view</b></summary>
<br/>

| # | Problem | Category | Primary Technique | Solution |
| :---: | :--- | :--- | :--- | :---: |
| 0004 | [Median of Two Sorted Arrays](./LeetCode_Problems/0004-median-of-two-sorted-arrays) | Binary Search | Dual-Array Partition Search ($O(\log(\min(N, M)))$) | [Java](./LeetCode_Problems/0004-median-of-two-sorted-arrays/0004-median-of-two-sorted-arrays.java) |
| 0037 | [Sudoku Solver](./LeetCode_Problems/0037-sudoku-solver) | Backtracking | 9×9 Exact Cover Constraint Validation | [Java](./LeetCode_Problems/0037-sudoku-solver/0037-sudoku-solver.java) |
| 0042 | [Trapping Rain Water](./LeetCode_Problems/0042-trapping-rain-water) | Two Pointers | Dual Pointers with Running Left/Right Max ($O(N)$) | [Java](./LeetCode_Problems/0042-trapping-rain-water/0042-trapping-rain-water.java) |
| 0051 | [N-Queens](./LeetCode_Problems/0051-n-queens) | Backtracking | Bitmask / Vector Chessboard Diagonal Pruning | [Java](./LeetCode_Problems/0051-n-queens/0051-n-queens.java) |
| 0052 | [N-Queens II](./LeetCode_Problems/0052-n-queens-ii) | Backtracking | High-Performance Count Backtracking ($O(N!)$) | [Java](./LeetCode_Problems/0052-n-queens-ii/0052-n-queens-ii.java) |
| 0084 | [Largest Rectangle in Histogram](./LeetCode_Problems/0084-largest-rectangle-in-histogram) | Monotonic Stack | Single-Pass Monotonic Stack (NSL & NSR) ($O(N)$) | [Java](./LeetCode_Problems/0084-largest-rectangle-in-histogram/0084-largest-rectangle-in-histogram.java) |
| 0115 | [Distinct Subsequences](./LeetCode_Problems/0115-distinct-subsequences) | Dynamic Programming | 2D Matching DP ($DP[i][j] = DP[i-1][j-1] + DP[i-1][j]$) | [Java](./LeetCode_Problems/0115-distinct-subsequences/0115-distinct-subsequences.java) |
| 0154 | [Find Min in Rotated Sorted Array II](./LeetCode_Problems/0154-find-minimum-in-rotated-sorted-array-ii) | Binary Search | Binary Search with Duplicate High-Pointer Decrement | [C++](./LeetCode_Problems/0154-find-minimum-in-rotated-sorted-array-ii/0154-find-minimum-in-rotated-sorted-array-ii.cpp) |
| 1406 | [Stone Game III](./LeetCode_Problems/1406-stone-game-iii) | DP / Minimax | Suffix 3-Step Minimax Evaluation ($O(N)$) | [Java](./LeetCode_Problems/1406-stone-game-iii/1406-stone-game-iii.java) |
| 1483 | [Kth Ancestor of a Tree Node](./LeetCode_Problems/1483-kth-ancestor-of-a-tree-node) | Tree / Binary Lifting | $O(\log N)$ Binary Lifting Table ($DP[node][2^k]$) | [Java](./LeetCode_Problems/1483-kth-ancestor-of-a-tree-node/1483-kth-ancestor-of-a-tree-node.java) |
| 1510 | [Stone Game IV](./LeetCode_Problems/1510-stone-game-iv) | DP / Game Theory | Backward Perfect Square Transition Evaluation | [Java](./LeetCode_Problems/1510-stone-game-iv/1510-stone-game-iv.java) |
| 2267 | [Check if There Is a Valid Parentheses Path](./LeetCode_Problems/2267-check-if-there-is-a-valid-parentheses-string-path) | DP / Grid / String | 3D State Memoization $(r, c, balance)$ | [Java](./LeetCode_Problems/2267-check-if-there-is-a-valid-parentheses-string-path/2267-check-if-there-is-a-valid-parentheses-string-path.java) |
| 3348 | [Smallest Divisible Digit Product II](./LeetCode_Problems/3348-smallest-divisible-digit-product-ii) | Greedy / Math | Prime Factor Counting (2, 3, 5, 7) + Digit Backtracking | [Java](./LeetCode_Problems/3348-smallest-divisible-digit-product-ii/3348-smallest-divisible-digit-product-ii.java) |
| 3518 | [Smallest Palindromic Rearrangement II](./LeetCode_Problems/3518-smallest-palindromic-rearrangement-ii) | DP / Combinatorics | Multinomial Permutations + Lexicographical Greedy Pick | [Java](./LeetCode_Problems/3518-smallest-palindromic-rearrangement-ii/3518-smallest-palindromic-rearrangement-ii.java) |
| 3962 | [Max Subarray Sum After K Swaps](./LeetCode_Problems/3962-maximum-subarray-sum-after-at-most-k-swaps) | DP / Prefix Sums | Top-$K$ Heap Balancing on Prefix Sum Bounds | [Java](./LeetCode_Problems/3962-maximum-subarray-sum-after-at-most-k-swaps/3962-maximum-subarray-sum-after-at-most-k-swaps.java) |

</details>

---

## ⏱️ Master Complexity Matrix

### 1 · Sorting Algorithms

| Algorithm | Best Case | Average Case | Worst Case | Auxiliary Space | Stable? | Primary Mechanism |
| :--- | :---: | :---: | :---: | :---: | :---: | :--- |
| **Bubble Sort** | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | ✅ | Adjacent element pairwise comparison with early exit |
| **Selection Sort** | $O(N^2)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | ❌ | Unsorted partition scan for minimum element |
| **Insertion Sort** | $O(N)$ | $O(N^2)$ | $O(N^2)$ | $O(1)$ | ✅ | Rightward element shifting to insert item in sorted subarray |
| **Merge Sort** | $O(N \log N)$ | $O(N \log N)$ | $O(N \log N)$ | $O(N)$ | ✅ | Divide-and-conquer recursive halving & array merging |
| **Quick Sort** | $O(N \log N)$ | $O(N \log N)$ | $O(N^2)$ | $O(\log N)$ | ❌ | In-place pivot partitioning with recursive subarray sorting |
| **Counting Sort** | $O(N + K)$ | $O(N + K)$ | $O(N + K)$ | $O(K)$ | ✅ | Non-comparison frequency counting across integer range $K$ |

### 2 · Searching & Matrix Operations

| Operation | Best Case | Average Case | Worst Case | Space | Notes |
| :--- | :---: | :---: | :---: | :---: | :--- |
| **Linear Search** | $O(1)$ | $O(N)$ | $O(N)$ | $O(1)$ | Sequential scan on unsorted collection |
| **Binary Search** | $O(1)$ | $O(\log N)$ | $O(\log N)$ | $O(1)$ | Requires sorted array; interval halving |
| **Search in Rotated Sorted Array** | $O(1)$ | $O(\log N)$ | $O(\log N)$ | $O(\log N)$ | Binary search identifying monotonic half |
| **Staircase Matrix Search** | $O(1)$ | $O(N + M)$ | $O(N + M)$ | $O(1)$ | Row & column sorted matrix; top-right corner pivot |
| **Spiral Matrix Generation** | $O(N^2)$ | $O(N^2)$ | $O(N^2)$ | $O(N^2)$ | Clockwise 4-boundary contraction |

### 3 · Linear Data Structures

| Structure / Operation | Access | Search | Insertion | Deletion | Space |
| :--- | :---: | :---: | :---: | :---: | :---: |
| **ArrayList** | $O(1)$ | $O(N)$ | $O(1)$ amortized | $O(N)$ | $O(N)$ |
| **Singly Linked List** | $O(N)$ | $O(N)$ | $O(1)$ at head/tail | $O(1)$ at head | $O(N)$ |
| **Doubly Linked List** | $O(N)$ | $O(N)$ | $O(1)$ at both ends | $O(1)$ with node ref | $O(N)$ |
| **Circular Queue (Array)** | — | — | $O(1)$ enqueue | $O(1)$ dequeue | $O(N)$ |
| **Stack (Array / Linked List)** | $O(1)$ peek | $O(N)$ | $O(1)$ push | $O(1)$ pop | $O(N)$ |
| **Monotonic Stack (NSL / NSR)** | — | — | $O(N)$ amortized | $O(N)$ amortized | $O(N)$ |

### 4 · Binary Trees & Binary Search Trees

| Tree Operation | Balanced BST | Skewed BST | Binary Tree | Auxiliary Space |
| :--- | :---: | :---: | :---: | :---: |
| **Search** | $O(\log N)$ | $O(N)$ | $O(N)$ | $O(H)$ recursion stack |
| **Insertion** | $O(\log N)$ | $O(N)$ | $O(N)$ | $O(H)$ recursion stack |
| **Deletion** | $O(\log N)$ | $O(N)$ | $O(N)$ | $O(H)$ recursion stack |
| **Tree Diameter (Optimized)** | $O(N)$ | $O(N)$ | $O(N)$ | $O(H)$ pair post-order |
| **Lowest Common Ancestor (LCA)** | $O(\log N)$ | $O(N)$ | $O(N)$ | $O(H)$ single pass |
| **Largest BST in Binary Tree** | $O(N)$ | $O(N)$ | $O(N)$ | $O(H)$ bottom-up post-order |

### 5 · Dynamic Programming & Greedy Strategies

| Algorithmic Technique | Time Complexity | Space Complexity | DP State Equation / Principle |
| :--- | :---: | :---: | :--- |
| **Fibonacci (Memo / Tab)** | $O(N)$ | $O(N)$ | $DP[i] = DP[i-1] + DP[i-2]$ |
| **Climbing Stairs** | $O(N)$ | $O(N)$ | $DP[i] = DP[i-1] + DP[i-2]$ |
| **0-1 Knapsack** | $O(N \cdot W)$ | $O(N \cdot W)$ | $\max(val[i-1] + DP[i-1][j - wt[i-1]], DP[i-1][j])$ |
| **Target Sum Subset** | $O(N \cdot \text{sum})$ | $O(N \cdot \text{sum})$ | $DP[i][j] = DP[i-1][j - num[i-1]] \lor DP[i-1][j]$ |
| **Unbounded Knapsack** | $O(N \cdot W)$ | $O(N \cdot W)$ | $\max(val[i-1] + DP[i][j - wt[i-1]], DP[i-1][j])$ |
| **Coin Change — Total Ways** | $O(N \cdot S)$ | $O(N \cdot S)$ | $DP[i][j] = DP[i][j - coin[i-1]] + DP[i-1][j]$ |
| **Coin Change — Min Coins** | $O(N \cdot S)$ | $O(N \cdot S)$ | $\min(DP[i-1][j], 1 + DP[i][j - coin[i-1]])$ |
| **Activity Selection** | $O(N \log N)$ | $O(1)$ | Earliest end-time greedy interval selection |
| **Job Sequencing** | $O(N \log N)$ | $O(N)$ | Profit-sorted greedy latest deadline slotting |
| **Chocola Board Cutting** | $O(N \log N + M \log M)$ | $O(1)$ | Largest cut-cost priority choice across dimensions |

---

## 🛠️ Compilation & Execution

> [!TIP]
> All core Java implementations include a `main(String[] args)` driver method with test assertions. To run any class with package declarations, compile from the repository root directory.

### ☕ Java Execution

```bash
# Navigate to the repository root
cd "DSA"

# Dynamic Programming: 0-1 Knapsack, Coin Change & Subset Sum
javac Dyanmic_Programming/Knapsack.java
java Dyanmic_Programming.Knapsack

javac Dyanmic_Programming/CoinChange.java
java Dyanmic_Programming.CoinChange

javac Dyanmic_Programming/TargetSumSubset.java
java Dyanmic_Programming.TargetSumSubset

# Binary Search Tree: Largest BST Subtree
javac BinarySearch_Tree/LargestBST.java
java BinarySearch_Tree.LargestBST

# Greedy Algorithms: Job Sequencing & Chocola Problem
javac Greedy_Algorithm/JobSequencing.java
java Greedy_Algorithm.JobSequencing

javac Greedy_Algorithm/ChocolaProblem.java
java Greedy_Algorithm.ChocolaProblem

# Linear Structures: Monotonic Stack Histogram
javac Linear_Structure/Stack/MaxAreaHistogram.java
java Linear_Structure.Stack.MaxAreaHistogram
```

### 💻 C++ Execution

```bash
# Problem 0153: Find Minimum in Rotated Sorted Array
cd "LeetCode_Problems/0153-find-minimum-in-rotated-sorted-array"
g++ -O3 0153-find-minimum-in-rotated-sorted-array.cpp -o solution
./solution
```

### 🐍 Python Execution

```bash
# Problem 3228: Maximum Operations to Move Ones to End
cd "LeetCode_Problems/3228-maximum-number-of-operations-to-move-ones-to-the-end"
python 3228-maximum-number-of-operations-to-move-ones-to-the-end.py
```

---

<div align="center">

**Crafted with precision for computer science foundations, technical interview excellence & competitive programming.**

*Maintained under the [MIT License](https://opensource.org/licenses/MIT).*

</div>
