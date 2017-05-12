#include <iostream>
using namespace std;

int main() {
  int a, b, t = 1;
  while (cin >> a >> b) {
    if (t > 1) {
      cout << "\n";
    }
    cout << "Case " << t << ": " << a + b << "\n";
    ++t;
  }
  return 0;
}
