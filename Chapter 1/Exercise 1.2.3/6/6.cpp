#include <iostream>
#include <vector>
#include <iterator>
#include <algorithm>
using namespace std;

int main() {
  vector<int> L = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int v = 11;
  cout << binary_search(begin(L), end(L), v) << "\n";
  return 0;
}
