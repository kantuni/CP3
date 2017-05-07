import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  static class FastReader {
    BufferedReader reader;
    
    FastReader() {
      reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    String nextLine() {
      String line = "";
      try {
        line = reader.readLine();
      } catch (IOException e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
      }
      return line;
    }
  }
  
  public static void main(String[] args) {
    FastReader reader = new FastReader();
    String line = reader.nextLine();
    while (line != null && line.length() != 0) {
      String[] tokens = line.split(" ");
      int total = 0;
      for (int i = 0; i < tokens.length; ++i) {
        total += Integer.parseInt(tokens[i]);
      }
      System.out.println(total);
      line = reader.nextLine();
    }
  }
}
