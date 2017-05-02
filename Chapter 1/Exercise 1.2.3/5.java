import java.util.Arrays;

class Birthday implements Comparable<Birthday> {
  public int day;
  public int month;
  public int year;
  
  public Birthday(int d, int m, int y) {
    this.day = d;
    this.month = m;
    this.year = y;
  }
  
  public int compareTo(Birthday other) {
    if (this.month != other.month) {
      // ascending birth months
      return (this.month > other.month) ? 1 : -1;
    } else if (this.day != other.day) {
      // ascending birth dates
      return (this.day > other.day) ? 1 : -1;
    } else if (this.year != other.year) {
      // ascending age
      return (this.year < other.year) ? 1 : -1;
    } else {
      return 0;
    }
  }
  
  public String toString() {
    return "(" + this.day + ", " + this.month + ", " + this.year + ")";
  }
}

class Main {
  public static void main(String[] args) {
    Birthday p1 = new Birthday(1, 1, 1992);
    Birthday p2 = new Birthday(1, 1, 1993);
    Birthday p3 = new Birthday(1, 1, 1994);
    Birthday[] bdays = {p1, p2, p3};
    Arrays.sort(bdays);
    System.out.println(Arrays.toString(bdays));
  }
}
