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

3. Given a date, determine the day of the week (Monday, . . . , Sunday) on that day. (e.g. 9 August 2010—the launch date of the first edition of this book—is a Monday.)

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

   ​