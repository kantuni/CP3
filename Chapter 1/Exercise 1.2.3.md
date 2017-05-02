### Exercise 1.2.3

Produce working code that is as concise as possible for the following tasks:

1. Using Java, read in a double (e.g. 1.4732, 15.324547327, etc.) echo it, but with a minimum field width of 7 and 3 digits after the decimal point (e.g. ss1.473 (where ‘s’ denotes a space), s15.325, etc.)

   ```java
   import java.util.Scanner;

   class Main {
     public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double d = scan.nextDouble();
       System.out.println(String.format("%7.3f", d));
     }
   }
   ```

2. Given an integer n (n ≤ 15), print π to n digits after the decimal point (rounded). (e.g. for n = 2, print 3.14; for n = 4, print 3.1416; for n = 5, print 3.14159.)

   **C++**

   ```c++
   #include <cstdio>
   #include <math.h>

   int main() {
     int n;
     scanf("%d", &n);
     printf("%.*f\n", n, M_PI);
     return 0;
   }
   ```

   **Java**

   ```java
   import java.util.Scanner;

   class Main {
     public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       System.out.println(String.format("%." + n + "f", Math.PI));
     }
   }
   ```

3. Given a date, determine the day of the week (Monday, . . . , Sunday) on that day. (e.g. 9 August 2010 —the launch date of the first edition of this book — is a Monday.)

   **C++**

   ```c++
   #include <iostream>
   #include <string>
   #include <math.h>
   using namespace std;

   int main() {
     string months[12] = {
       "March", "April", "May", "June", 
       "July", "August", "September", "October", 
       "November", "December", "January", "February"
     };
     string days[7] = {
       "Sunday", "Monday", "Tuesday", 
       "Wednesday", "Thursday", "Friday", "Saturday"
     };
     
     string date[3] = {"9", "August", "2010"};
     int d, m, Y, y, c, w;
     
     d = stoi(date[0]);
     for (int i = 0; i < 12; ++i) {
       if (months[i] == date[1]) {
         m = i + 1;
       }
     }
     Y = stoi(date[2]);
     Y = (m == 11 || m == 12) ? Y - 1 : Y;
     y = Y % 100;
     c = (Y - y) / 100;
     w = (d + (int)(2.6 * m - 0.2) + y + (y / 4) + (c / 4) - 2 * c) % 7;
     
     cout << days[w] << "\n";
     return 0;
   }
   ```

   **Java**

   ```java
   import java.util.Calendar;
   import java.util.GregorianCalendar;

   class Main {
     public static void main(String[] args) {
       String[] days = {
         "Sunday", "Monday", "Tuesday", 
         "Wednesday", "Thursday", "Friday", "Saturday"
       };
       Calendar calendar = new GregorianCalendar(9, 8, 2010);
       int d = calendar.get(Calendar.DAY_OF_WEEK);
       System.out.println(days[d]);
     }
   }
   ```

4. Given n random integers, print the distinct (unique) integers in sorted order.

   **C++**

   ```c++
   #include <iostream>
   #include <vector>
   #include <set>
   #include <iterator>
   using namespace std;

   int main() {
     vector<int> random = {4, 6, 2, 3, 1, 4, 1, 3, 5};
     set<int> s(begin(random), end(random));
     random.assign(begin(s), end(s));
     for (auto n : random) {
       cout << n << " ";
     }
     cout << "\n";
     return 0;
   }
   ```

   **Java**

   ```java
   import java.util.ArrayList;
   import java.util.Arrays;
   import java.util.Collections;
   import java.util.Set;
   import java.util.HashSet;

   class Main {
     public static void main(String[] args) {
       Integer[] random = {4, 6, 2, 3, 1, 4, 1, 3, 5};
       ArrayList<Integer> l = new ArrayList<>();
       Collections.addAll(l, random);
       Set<Integer> s = new HashSet<>();
       s.addAll(l);
       l.clear();
       l.addAll(s);
       System.out.println(l);
     }
   }
   ```

5. Given the distinct and valid birthdates of n people as triples (DD, MM, YYYY), order them first by ascending birth months (MM), then by ascending birth dates (DD), and finally by ascending age.

   **C++**

   ```c++
   #include <vector>
   #include <iterator>
   #include <algorithm>
   using namespace std;

   struct Birthday {
     int day;
     int month;
     int year;

     Birthday(int d, int m, int y) {
       this->day = d;
       this->month = m;
       this->year = y;
     }

     friend bool operator<(const Birthday& a, const Birthday& b) {
       if (a.month != b.month) {
         // ascending birth months
         return a.month < b.month;
       } else if (a.day != b.day) {
         // ascending birth dates
         return a.day < b.day;
       } else {
         // ascending age
         return a.year > b.year;
       }
     }
   };

   int main() {
     Birthday p1(1, 1, 1994);
     Birthday p2(1, 1, 1993);
     Birthday p3(1, 1, 1992);
     vector<Birthday> bdays = {p1, p2, p3};
     sort(begin(bdays), end(bdays));
     return 0;
   }
   ```

   **Java**

   ```java
   import java.util.Arrays;

   class Birthday implements Comparable<Birthday> {
     public int day;
     public int month;
     public int year;
     
     public Birthday(int d, int m, int y) {
       this.day = d;
       this.month = m;
       this.year = y;
     }
     
     public int compareTo(Birthday other) {
       if (this.month != other.month) {
         // ascending birth months
         return (this.month > other.month) ? 1 : -1;
       } else if (this.day != other.day) {
         // ascending birth dates
         return (this.day > other.day) ? 1 : -1;
       } else if (this.year != other.year) {
         // ascending age
         return (this.year < other.year) ? 1 : -1;
       } else {
         return 0;
       }
     }
     
     public String toString() {
       return "(" + this.day + ", " + this.month + ", " + this.year + ")";
     }
   }

   class Main {
     public static void main(String[] args) {
       Birthday p1 = new Birthday(1, 1, 1992);
       Birthday p2 = new Birthday(1, 1, 1993);
       Birthday p3 = new Birthday(1, 1, 1994);
       Birthday[] bdays = {p1, p2, p3};
       Arrays.sort(bdays);
       System.out.println(Arrays.toString(bdays));
     }
   }
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

9. Given a string that represents a base X number, convert it to an equivalent string in base Y, 2 ≤ X, Y ≤ 36. For example: “FF” in base X = 16 (hexadecimal) is “255” in base Y1 = 10 (decimal) and “11111111” in base Y2 = 2 (binary). See Section 5.3.2.

10. Let's define a 'special word' as a lowercase alphabet followed by two consecutive digits. Given a string, replace all 'special words' of length 3 with 3 stars "\*\*\*", e.g. S = "line: a70 and z72 will be replaced, aa24 and a872 will not" should be transformed into: S = "line: \*\*\* and \*\*\* will be replaced, aa24 and a872 will not".

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
