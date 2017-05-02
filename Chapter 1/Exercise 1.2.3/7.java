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
