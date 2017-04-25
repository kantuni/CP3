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

