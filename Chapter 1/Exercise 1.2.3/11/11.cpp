#include <iostream>
#include <ctype.h>
#include <string>
#include <iterator>
#include <algorithm>
using namespace std;

string evaluate(string e) {
  // remove spaces
  e.erase(remove(begin(e), end(e), ' '), end(e));
  cout << e << "\n";
  
  // remove first and last parentheses
  if (e[0] == '(' && e[e.length() - 1] == ')') {
    e = e.substr(1, e.length() - 2);
  }
  
  // evaluate ()
  int start = -1, end = -1;
  for (int i = 0; i < e.length(); ++i) {
    if (e[i] == '(') {
      start = i;
    }
    
    if (e[i] == ')') {
      end = i;
      break;
    }
  }
  
  if (start != -1 && end != -1) {
    e = e.substr(0, start) + evaluate(e.substr(start, end - start + 1)) + e.substr(end + 1);
  }
  
  // evaluate *
  for (int i = 0; i < e.length(); ++i) {
    if (e[i] == '*') {
      string left;
      for (int j = i - 1; j >= 0; --j) {
        if (!isdigit(e[j]) && e[j] != '.') {
          start = j + 1;
          left = e.substr(j + 1, i - j - 1);
          break;
        }
        
        if (j == 0) {
          start = j;
          left = e.substr(j, i - j);
          break;
        }
      }
      
      string right;
      for (int j = i + 1; j < e.length(); ++j) {
        if (!isdigit(e[j]) && e[j] != '.') {
          end = j;
          right = e.substr(i + 1, j - i - 1);
          break;
        }
        
        if (j == e.length() - 1) {
          end = e.length();
          right = e.substr(i + 1, j - i);
          break;
        }
      }
      
      double l = stod(left);
      double r = stod(right);
      e = e.substr(0, start) + to_string(l * r) + e.substr(end);
    }
  }
  
  // evaluate /
  // evaluate +
  // evaluate -
  
  return e;
}

int main() {
  string expression;
  getline(cin, expression);
  cout << evaluate(expression) << "\n";  
  return 0;
}
