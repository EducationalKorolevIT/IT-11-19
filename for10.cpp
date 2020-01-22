#include <iostream>
using namespace std;
int main(){
setlocale(LC_ALL,"");
double N, a = 0, i = 1;
cout << "N" << endl;
cin >> N;
if (N > 0)
for (i; i <= N; i++){
   a += 1 / i;
   cout << a << endl;
}
return 0;
}

