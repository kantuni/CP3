#include <iostream>
#include <vector>
#include <iterator>
#include <algorithm>
using namespace std;

int main() {
  vector<char> letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
  sort(begin(letters), end(letters));
  
  // include original permutation
  do {
    for (int i = 0; i < letters.size(); ++i) {
      cout << letters[i] << " ";
    }
    cout << "\n";
  } while (next_permutation(begin(letters), end(letters)));
  
  return 0;
}
