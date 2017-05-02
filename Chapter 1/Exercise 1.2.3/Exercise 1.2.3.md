### Exercise 1.2.3

Produce working code that is as concise as possible for the following tasks:

1. Using Java, read in a double (e.g. 1.4732, 15.324547327, etc.) echo it, but with a minimum field width of 7 and 3 digits after the decimal point (e.g. ss1.473 (where ‘s’ denotes a space), s15.325, etc.)

   ```shell
   javac 1.java
   ```

2. Given an integer n (n ≤ 15), print π to n digits after the decimal point (rounded). (e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, print 3.14159.)

   ```bash
   g++ -std=c++14 2.cpp
   javac 2.java
   ```

3. Given a date, determine the day of the week (Monday, . . . , Sunday) on that day. (e.g. 9 August 2010 —the launch date of the first edition of this book — is a Monday.)

   ```shell
   g++ -std=c++14 3.cpp
   javac 3.java
   ```

4. Given n random integers, print the distinct (unique) integers in sorted order.

   ```shell
   g++ -std=c++14 4.cpp
   javac 4.java
   ```

5. Given the distinct and valid birthdates of n people as triples (DD, MM, YYYY), order them first by ascending birth months (MM), then by ascending birth dates (DD), and finally by ascending age.

   ```shell
   g++ -std=c++14 5.cpp
   javac 5.java
   ```

6. Given a list of sorted integers L of size up to 1M items, determine whether a value vexists in L with no more than 20 comparisons (more details in Section 2.2).

   **C++**

   ```c++
   #include <iostream>
   #include <vector>
   #include <iterator>
   #include <algorithm>
   using namespace std;

   int main() {
     vector<int> L = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     int v = 11;
     cout << binary_search(begin(L), end(L), v) << "\n";
     return 0;
   }
   ```

   **Java**

   ```java
   import java.util.Arrays;

   class Main {
     public static void main(String[] args) {
       int[] L = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int v = 3;
       System.out.println(Arrays.binarySearch(L, v) >= 0);
     }
   }
   ```

7. Generate all possible permutations of {‘A’, ‘B’, ‘C’, . . . , ‘J’}, the first N = 10 letters in the alphabet (see Section 3.2.1).

   **C++**

   ```c++
   #include <iostream>
   #include <vector>
   #include <iterator>
   #include <algorithm>
   using namespace std;

   int main() {
     vector<char> letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
     sort(begin(letters), end(letters));
     
     // include original permutation
     do {
       for (int i = 0; i < letters.size(); ++i) {
         cout << letters[i] << " ";
       }
       cout << "\n";
     } while (next_permutation(begin(letters), end(letters)));
     
     return 0;
   }
   ```

   **Java**

   ```java
   import java.util.ArrayList;
   import java.util.Collections;

   class Permutations extends ArrayList<ArrayList<Character>> {}

   class Main {
     public static Permutations permute(ArrayList<Character> array) {
       if (array.size() == 1) {
         Permutations last = new Permutations();
         last.add(array);
         return last;
       }

       Permutations all = new Permutations();
       for (int i = 0; i < array.size(); ++i) {
         ArrayList<Character> subarray = new ArrayList<>();
         for (int j = 0; j < array.size(); ++j) {
           if (i != j) {
             subarray.add(array.get(j));
           }
         }

         Permutations current = permute(subarray);
         for (int j = 0; j < current.size(); ++j) {
           current.get(j).add(0, array.get(i));
           all.add(current.get(j));
         }
       }

       return all;
     }

     public static void main(String[] args) {
       ArrayList<Character> letters = new ArrayList<>();
       for (char c = 'A'; c <= 'C'; ++c) {
         letters.add(c);
       }
       Collections.sort(letters);

       // generate and print all permutations
       Permutations all = permute(letters);
       for (ArrayList<Character> p : all) {
         System.out.println(p);
       }
     }
   }
   ```

8. Generate all possible subsets of {0, 1, 2, . . . , N-1}, for N = 20 (see Section 3.2.1).

    **C++**

    ```c++
    #include <iostream>
    #include <vector>
    #include <bitset>
    #include <math.h>
    using namespace std;

    int main() {
      const int N = 20;
      
      vector<int> s;
      for (int i = 0; i < N; ++i) {
        s.push_back(i);
      }
      
      vector<vector<int>> all;
      for (int i = 0; i < pow(2, N); ++i) {
        string binary = bitset<N>(i).to_string();
        vector<int> subset;
        for (int j = 0; j < binary.length(); ++j) {
          if (binary[j] == '1') {
            subset.push_back(s[j]);
          }
        }
        all.push_back(subset);
      }
      
      // print all subsets
      for (int i = 0; i < all.size(); ++i) {
        for (int j = 0; j < all[i].size(); ++j) {
          cout << all[i][j] << " ";
        }
        cout << "\n";
      }
      
      return 0;
    }
    ```

    **Java**

    ```java
    import java.util.ArrayList;

    class Main {
      public static void main(String[] args) {
        int N = 20;
        
        int[] s = new int[N];
        for (int i = 0; i < N; ++i) {
          s[i] = i;
        }
        
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, N); ++i) {
          String binary = Integer.toBinaryString(i);
          binary = String.format("%" + N + "s", binary).replace(' ', '0');
          ArrayList<Integer> subset = new ArrayList<>();
          for (int j = 0; j < binary.length(); ++j) {
            if (binary.charAt(j) == '1') {
              subset.add(s[j]);
            }
          }
          all.add(subset);
        }
        
        // print all subsets
        for (ArrayList<Integer> subset : all) {
          System.out.println(subset);
        }
      }
    }
    ```

9. Given a string that represents a base X number, convert it to an equivalent string in base Y, 2 ≤ X, Y ≤ 36. For example: “FF” in base X = 16 (hexadecimal) is “255” in base Y1 = 10 (decimal) and “11111111” in base Y2 = 2 (binary). See Section 5.3.2.

10. Let's define a 'special word' as a lowercase alphabet followed by two consecutive digits. Given a string, replace all 'special words' of length 3 with 3 stars "\*\*\*", e.g. S = "line: a70 and z72 will be replaced, aa24 and a872 will not" should be transformed into: S = "line: \*\*\* and \*\*\* will be replaced, aa24 and a872 will not".

  **C++**

  ```c++
  #include <iostream>
  #include <string>
  #include <regex>
  using namespace std;

  int main() {
    string S = "line: a70 and z72 will be replaced, aa24 and a872 will not";
    regex pattern("\\s[a-z][0-9]{2}\\s");
    S = regex_replace(S, pattern, " *** ");
    cout << S << "\n";
    return 0;
  }
  ```

  **Java**

  ```java
  class Main {
    public static void main(String[] args) {
      String S = "line: a70 and z72 will be replaced, aa24 and a872 will not";
      S = S.replaceAll("\\s[a-z][0-9]{2}\\s", " *** ");
      System.out.println(S);
    }
  }
  ```
