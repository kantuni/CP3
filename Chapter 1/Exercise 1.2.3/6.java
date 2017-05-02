import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] L = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int v = 3;
    System.out.println(Arrays.binarySearch(L, v) >= 0);
  }
}
