#include <iostream>
#include <string>
#include <cstdlib>
using namespace std;

int main() {
  string line;
  
  while (getline(cin, line)) {
    int total = 0;
    char* temp = strdup(line.c_str());
    char* token = strtok(temp, " ");
    while (token != NULL) {
      total += stoi(token);
      token = strtok(NULL, " ");
    }
    cout << total << "\n";
    free(temp);
  }
  
  return 0;
}
