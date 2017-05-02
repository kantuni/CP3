#include <iostream>
#include <vector>
#include <set>
#include <iterator>
using namespace std;

int main() {
  vector<int> random = {4, 6, 2, 3, 1, 4, 1, 3, 5};
  set<int> s(begin(random), end(random));
  random.assign(begin(s), end(s));
  for (auto n : random) {
    cout << n << " ";
  }
  cout << "\n";
  return 0;
}
