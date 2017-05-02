import java.util.Calendar;
import java.util.GregorianCalendar;

class Main {
  public static void main(String[] args) {
    String[] days = {
      "Sunday", "Monday", "Tuesday", 
      "Wednesday", "Thursday", "Friday", "Saturday"
    };
    Calendar calendar = new GregorianCalendar(9, 8, 2010);
    int d = calendar.get(Calendar.DAY_OF_WEEK);
    System.out.println(days[d]);
  }
}
