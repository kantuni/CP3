#include <vector>
#include <iterator>
#include <algorithm>
using namespace std;

struct Birthday {
  int day;
  int month;
  int year;

  Birthday(int d, int m, int y) {
    this->day = d;
    this->month = m;
    this->year = y;
  }

  friend bool operator<(const Birthday& a, const Birthday& b) {
    if (a.month != b.month) {
      // ascending birth months
      return a.month < b.month;
    } else if (a.day != b.day) {
      // ascending birth dates
      return a.day < b.day;
    } else {
      // ascending age
      return a.year > b.year;
    }
  }
};

int main() {
  Birthday p1(1, 1, 1994);
  Birthday p2(1, 1, 1993);
  Birthday p3(1, 1, 1992);
  vector<Birthday> bdays = {p1, p2, p3};
  sort(begin(bdays), end(bdays));
  return 0;
}
