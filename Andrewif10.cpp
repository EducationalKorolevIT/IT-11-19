#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int a=0;
    int b=0;
    cin >> a;
    cin >> b;
    if (a!=b){
        a=a+b;
        b=a;
    }
    else{
        a=0;
        b=0;
    }
    cout << a <<" "<< b;
}
