#include <iostream>
#include <string>
#include <math.h>
using namespace std;

int main() {
  string months[12] = {
    "March", "April", "May", "June", 
    "July", "August", "September", "October", 
    "November", "December", "January", "February"
  };
  string days[7] = {
    "Sunday", "Monday", "Tuesday", 
    "Wednesday", "Thursday", "Friday", "Saturday"
  };
  
  string date[3] = {"9", "August", "2010"};
  int d, m, Y, y, c, w;
  
  d = stoi(date[0]);
  for (int i = 0; i < 12; ++i) {
    if (months[i] == date[1]) {
      m = i + 1;
    }
  }
  Y = stoi(date[2]);
  Y = (m == 11 || m == 12) ? Y - 1 : Y;
  y = Y % 100;
  c = (Y - y) / 100;
  w = (d + (int)(2.6 * m - 0.2) + y + (y / 4) + (c / 4) - 2 * c) % 7;
  
  cout << days[w] << "\n";
  return 0;
}
