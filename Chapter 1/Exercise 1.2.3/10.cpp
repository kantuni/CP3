#include <iostream>
#include <string>
#include <regex>
using namespace std;

int main() {
  string S = "line: a70 and z72 will be replaced, aa24 and a872 will not";
  regex pattern("\\s[a-z][0-9]{2}\\s");
  S = regex_replace(S, pattern, " *** ");
  cout << S << "\n";
  return 0;
}
