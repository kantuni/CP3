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
    
    String next() {
      while (!tokenizer.hasMoreElements()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return tokenizer.nextToken();
    }
    
    int nextInt() {
      return Integer.parseInt(next());
    }
  }
  
  public static void main(String[] args) {
    FastReader reader = new FastReader();
  }
}
