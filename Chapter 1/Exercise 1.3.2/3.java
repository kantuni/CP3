import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
  static class FastReader {
    BufferedReader reader;
    StringTokenizer tokenizer;
    
    FastReader() {
      reader = new BufferedReader(new InputStreamReader(System.in));
      tokenizer = new StringTokenizer("");
    }
    
    boolean hasNext() {
      if (!tokenizer.hasMoreElements()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return tokenizer.hasMoreElements();
    }
    
    String next() {
      return tokenizer.nextToken();
    }
    
    int nextInt() {
      return Integer.parseInt(next());
    }
  }
  
  public static void main(String[] args) {
    FastReader reader = new FastReader();
    while (reader.hasNext()) {
      int a = reader.nextInt();
      int b = reader.nextInt();
      System.out.println(a + b);
    }
  }
}
