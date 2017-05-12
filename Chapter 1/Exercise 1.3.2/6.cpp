#include <iostream>
using namespace std;

int main() {
  int k;
  while (cin >> k) {
    int sum = 0;
    while (k > 0) {
      int a;
      cin >> a;
      sum += a;
      --k;
    }
    cout << sum << "\n";
  }
  return 0;
}
