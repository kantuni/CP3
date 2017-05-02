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
