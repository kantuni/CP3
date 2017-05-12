#include <iostream>
using namespace std;

int main() {
  int a, b, t = 1;
  while (cin >> a >> b) {
    cout << "Case " << t << ": " << a + b << "\n\n";
    ++t;
  }
  return 0;
}
