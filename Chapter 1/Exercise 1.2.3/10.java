class Main {
  public static void main(String[] args) {
    String S = "line: a70 and z72 will be replaced, aa24 and a872 will not";
    S = S.replaceAll("\\s[a-z][0-9]{2}\\s", " *** ");
    System.out.println(S);
  }
}
