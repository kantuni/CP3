### Exercise 1.2.3

Produce working code that is as concise as possible for the following tasks:

1. Using Java, read in a double (e.g. 1.4732, 15.324547327, etc.) echo it, but with a minimum field width of 7 and 3 digits after the decimal point (e.g. ss1.473 (where ‘s’ denotes a space), s15.325, etc.)

      ```shell
      g++ -std=c++14 1.cpp
      ./a.out

      javac 1.java
      java Main
      ```

2. Given an integer n (n ≤ 15), print π to n digits after the decimal point (rounded). (e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, print 3.14159.)

      ```shell
      g++ -std=c++14 2.cpp
      ./a.out

      javac 2.java
      java Main
      ```

3. Given a date, determine the day of the week (Monday, . . . , Sunday) on that day. (e.g. 9 August 2010 —the launch date of the first edition of this book — is a Monday.)

      ```shell
      g++ -std=c++14 3.cpp
      ./a.out

      javac 3.java
      java Main
      ```

4. Given n random integers, print the distinct (unique) integers in sorted order.

      ```shell
      g++ -std=c++14 4.cpp
      ./a.out

      javac 4.java
      java Main
      ```

5. Given the distinct and valid birthdates of n people as triples (DD, MM, YYYY), order them first by ascending birth months (MM), then by ascending birth dates (DD), and finally by ascending age.

      ```shell
      g++ -std=c++14 5.cpp
      ./a.out

      javac 5.java
      java Main
      ```

6. Given a list of sorted integers L of size up to 1M items, determine whether a value vexists in L with no more than 20 comparisons (more details in Section 2.2).

      ```shell
      g++ -std=c++14 6.cpp
      ./a.out

      javac 6.java
      java Main
      ```

7. Generate all possible permutations of {‘A’, ‘B’, ‘C’, . . . , ‘J’}, the first N = 10 letters in the alphabet (see Section 3.2.1).

      ```shell
      g++ -std=c++14 7.cpp
      ./a.out

      javac 7.java
      java Main
      ```

8. Generate all possible subsets of {0, 1, 2, . . . , N-1}, for N = 20 (see Section 3.2.1).

      ```shell
      g++ -std=c++14 8.cpp
      ./a.out

      javac 8.java
      java Main
      ```

9. Given a string that represents a base X number, convert it to an equivalent string in base Y, 2 ≤ X, Y ≤ 36. For example: “FF” in base X = 16 (hexadecimal) is “255” in base Y1 = 10 (decimal) and “11111111” in base Y2 = 2 (binary). See Section 5.3.2.

      ```shell
      g++ -std=c++14 9.cpp
      ./a.out

      javac 9.java
      java Main
      ```

10. Let's define a 'special word' as a lowercase alphabet followed by two consecutive digits. Given a string, replace all 'special words' of length 3 with 3 stars "\*\*\*", e.g. S = "line: a70 and z72 will be replaced, aa24 and a872 will not" should be transformed into: S = "line: \*\*\* and \*\*\* will be replaced, aa24 and a872 will not".

    ```shell
    g++ -std=c++14 10.cpp
    ./a.out

    javac 10.java
    java Main
    ```

11. Given a valid mathematical expression involving '+', '-', '*', '/', '(', and ')' in a single line, evaluate that expression. (e.g. a rather complicated but valid expression 3 + (8 -7.5) * 10 / 5 - (2 + 5 * 7) should produce -33.0 when evaluated with standard operator precedence.)

    ```shell
    g++ -std=c++14 11.cpp
    ./a.out
    
    javac 11.java
    java Main
    ```
