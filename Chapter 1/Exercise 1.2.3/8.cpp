#include <iostream>
#include <vector>
#include <bitset>
#include <math.h>
using namespace std;

int main() {
  const int N = 20;
  
  vector<int> s;
  for (int i = 0; i < N; ++i) {
    s.push_back(i);
  }
  
  vector<vector<int>> all;
  for (int i = 0; i < pow(2, N); ++i) {
    string binary = bitset<N>(i).to_string();
    vector<int> subset;
    for (int j = 0; j < binary.length(); ++j) {
      if (binary[j] == '1') {
        subset.push_back(s[j]);
      }
    }
    all.push_back(subset);
  }
  
  // print all subsets
  for (int i = 0; i < all.size(); ++i) {
    for (int j = 0; j < all[i].size(); ++j) {
      cout << all[i][j] << " ";
    }
    cout << "\n";
  }
  
  return 0;
}
