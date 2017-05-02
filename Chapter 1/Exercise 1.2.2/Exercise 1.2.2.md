### Exercise 1.2.2

Please answer the following questions below using your current knowledge about classic algorithms and their time complexities. After you have finished reading this book once, it may be beneficial to attempt this exercise again.

1. There are n webpages (1 ≤ n ≤ 10M). Each webpage i has a page rank r<sub>i</sub>. You want to pick the top 10 pages with the highest page ranks. Which method is better?

   - (a)  Load all n webpages' page rank to memory, sort (Section 2.2) them in descending page rank order, obtaining the top 10.
   - **(b) Use a priority queue data structure (a heap)**

2. Given an M × N integer matrix Q (1 ≤ M, N ≤ 30), determine if there exists a sub-matrix of Q of size A × B (1 ≤ A ≤ M, 1 ≤ B ≤ N) where mean(Q) = 7.

   - **(a) Try all possible sub-matrices and check if the mean of each sub-matrix is 7. This algorithm runs in O(M<sup>3</sup> × N<sup>3</sup>).**
   - (b) Try all possible sub-matrices, but in O(M<sup>2</sup> × N<sup>2</sup>) with this technique: ____

3. Given a list L with 10K integers, you need to frequently obtain sum(i, j), i.e. the sum of L[i] + L[i+1] + ...+ L[j]. Which data structure should you use?

   - (a) Simple Array (Section 2.2).
   - **(b) Simple Array pre-processed with Dynamic Programming (Section 2.2 & 3.5).**
   - (c) Balanced Binary Search Tree (Section 2.3).(d) Binary Heap (Section 2.3).
   - (e) Segment Tree (Section 2.4.3).
   - (f) Binary Indexed (Fenwick) Tree (Section 2.4.4).
   - (g) Suffix Tree (Section 6.6.2) or its alternative, Suffix Array (Section 6.6.4).

4. Given a set S of N points randomly scattered on a 2D plane (2 ≤ N ≤ 1000), find two points ∈ S that have the greatest separating Euclidean distance. Is an O(N<sup>2</sup>) complete search algorithm that tries all possible pairs feasible?

   - **(a) Yes, such complete search is possible.**
   - (b) No, we must find another way. We must use: ____

5. You have to compute the shortest path between two vertices on a weighted Directed Acyclic Graph (DAG) with |V|, |E| ≤ 100K. Which algorithm(s) can be used in a typical programming contest (that is, with a time limit of approximately 3 seconds)?

   - (a) Dynamic Programming (Section 3.5, 4.2.5, & 4.7.1).
   - (b) Breadth First Search (Section 4.2.2 & 4.4.2).
   - **(c) Dijkstra’s (Section 4.4.3).**
   - **(d) Bellman Ford’s (Section 4.4.4).**
   - (e) Floyd Warshall’s (Section 4.5).

6. Which algorithm produces a list of the first 10K prime numbers with the best time complexity? (Section 5.5.1)

   - **(a) Sieve of Eratosthenes (Section 5.5.1).**
   - (b) For each number i ∈ [1..10K], test if isPrime(i) is true (Section 5.5.1).

7. You want to test if the factorial of n, i.e. n! is divisible by an integer m. 1 ≤ n ≤ 10000. What should you do?

   - (a) Test if n! % m == 0.
   - **(b) The naive approach above will not work, use: Number Theory.**

8. Question 4, but with a larger set of points: N ≤ 1M and one additional constraint: The points are randomly scattered on a 2D plane.

   - (a) The complete search mentioned in question 3 can still be used.
   - (b) The naive approach above will not work, use: ____ (Section 7.3.7).

9. You want to enumerate all occurrences of a substring P (of length m) in a (long) string T (of length n), if any. Both n and m have a maximum of 1M characters.

   - (a) Use the following C++ code snippet: 

     ```c++
     for (int i = 0; i < n; i++) {
       bool found = true;
       for (int j = 0; j < m && found; j++)
         if (i + j >= n || P[j] != T[i + j]) found = false; 
       if (found) printf("P is found at index %d in T\n", i);
     }
     ```

   - **(b) The naive approach above will not work, use: Suffix Trie (Section 6.4 or 6.6).**
