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
   
