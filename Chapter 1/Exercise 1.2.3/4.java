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
