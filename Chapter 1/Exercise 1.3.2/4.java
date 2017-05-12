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
    
    boolean hasNext() throws IOException {
      String line = reader.readLine();
      if (line != null) {
        tokenizer = new StringTokenizer(line);
        return true;
      }
      return false;
    }
    
    String next() throws IOException {
      while (!tokenizer.hasMoreElements()) {
        tokenizer = new StringTokenizer(reader.readLine());
      }
      return tokenizer.nextToken();
    }
    
    int nextInt() throws IOException {
      return Integer.parseInt(next());
    }
  }

  public static void main(String[] args) {
    FastReader reader = new FastReader();
    try {
      int t = 1;
      while (reader.hasNext()) {
        int a = reader.nextInt();
        int b = reader.nextInt();
        System.out.println("Case " + t + ": " + (a + b) + "\n");
        ++t;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
