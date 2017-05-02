import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double d = scan.nextDouble();
    System.out.println(String.format("%7.3f", d));
  }
}

