#include <iostream>
#include <string>
#include <locale>
#include <iterator>
#include <algorithm>
using namespace std;

string convert(string n, int from, int to) {
  string digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  int decimal = stoi(n, 0, from);
  string converted = "";
  
  while (decimal % to != 0) {
    converted += to_string(decimal % to);
    decimal -= (decimal % to);
    decimal /= to;
  }
  
  reverse(begin(converted), end(converted));
  return converted;
}

int main() {
  int x = 16, y1 = 10, y2 = 2;
  string xn = "FF";
  cout << convert(xn, x, y1) << "\n";
  cout << convert(xn, x, y2) << "\n";
  return 0;
}
