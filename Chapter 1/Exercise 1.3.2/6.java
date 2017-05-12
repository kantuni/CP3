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
      while (reader.hasNext()) {
        int k = reader.nextInt();
        int sum = 0;
        while (k > 0) {
          int a = reader.nextInt();
          sum += a;
          --k;
        }
        System.out.println(sum);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
