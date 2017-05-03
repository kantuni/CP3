class Main {
  public static void main(String[] args) {
    int x = 16, y1 = 10, y2 = 2;
    String xn = "FF";
    String y1n = Integer.toString(Integer.parseInt(xn, x), y1);
    String y2n = Integer.toString(Integer.parseInt(xn, x), y2);
    System.out.println(y1n);
    System.out.println(y2n);
  }
}
